package ir.hashemi.mapbox_medium_project

import android.os.Build
import android.os.Build.VERSION_CODES.M
import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import java.util.*



abstract class BaseDataBindingActivity<T : ViewDataBinding>(
    @LayoutRes private val layoutRes: Int
) : AppCompatActivity() {

    protected lateinit var binding: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setLocale()
        WindowCompat.setDecorFitsSystemWindows(window, false)
        binding = DataBindingUtil.setContentView(this, layoutRes)
        setupViews()
    }

    private fun setLocale(newLocale: String = "fa") {
        val locale = Locale(newLocale)
        Locale.setDefault(locale)
        val config = resources.configuration
        config.setLocale(locale)
        resources.updateConfiguration(config, resources.displayMetrics)
    }

    protected abstract fun setupViews()

}