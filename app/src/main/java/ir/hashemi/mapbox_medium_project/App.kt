package ir.hashemi.mapbox_medium_project

import android.app.Application
import com.mapbox.mapboxsdk.Mapbox
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application(){

    override fun onCreate() {
        super.onCreate()
        Mapbox.getInstance(this,getString(R.string.mapbox_access_token))

    }

}