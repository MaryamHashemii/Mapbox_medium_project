package ir.hashemi.mapbox_medium_project

import android.os.Bundle
import com.mapbox.mapboxsdk.Mapbox
import com.mapbox.mapboxsdk.geometry.LatLng
import com.mapbox.mapboxsdk.maps.MapboxMap
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback
import com.mapbox.mapboxsdk.maps.Style
import dagger.hilt.android.AndroidEntryPoint
import ir.hashemi.mapbox_medium_project.databinding.ActivityMainBinding

@AndroidEntryPoint
class MainActivity : BaseDataBindingActivity<ActivityMainBinding>(R.layout.activity_main),
    OnMapReadyCallback, MapboxMap.OnMapClickListener, MapboxMap.OnMapLongClickListener {

    private lateinit var mapboxMap: MapboxMap


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.map.onCreate(savedInstanceState)
        binding.map.getMapAsync(this)

    }

    override fun onStart() {
        super.onStart()
        binding.map.onStart()
    }

    override fun onResume() {
        super.onResume()
        binding.map.onResume()
    }

    override fun onPause() {
        super.onPause()
        binding.map.onPause()
    }

    override fun onStop() {
        super.onStop()
        binding.map.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding.map.onDestroy()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        binding.map.onLowMemory()
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        binding.map.onSaveInstanceState(outState)
    }


    override fun setupViews() {
    }

    override fun onMapReady(mapboxMap: MapboxMap) {
        this.mapboxMap = mapboxMap
        configMapBox()
    }

    override fun onMapClick(point: LatLng): Boolean {
        return false
    }

    override fun onMapLongClick(point: LatLng): Boolean {
        return false
    }

    private fun configMapBox() {
        mapboxMap.setStyle(Style.MAPBOX_STREETS)
        mapboxMap.addOnMapClickListener(this)
        mapboxMap.addOnMapLongClickListener(this)

    }
}