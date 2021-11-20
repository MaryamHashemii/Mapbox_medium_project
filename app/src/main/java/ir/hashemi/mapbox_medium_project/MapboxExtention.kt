package ir.hashemi.mapbox_medium_project

import com.mapbox.android.gestures.MoveGestureDetector
import com.mapbox.mapboxsdk.maps.MapboxMap

fun MapboxMap.onMoveBegin(onMoveBegin: (MoveGestureDetector) -> Unit) {
    this.addOnMoveListener(object : MapboxMap.OnMoveListener {
        override fun onMoveBegin(moveGestureDetector: MoveGestureDetector) {
            onMoveBegin(moveGestureDetector)
        }

        override fun onMove(moveGestureDetector: MoveGestureDetector) {
        }

        override fun onMoveEnd(moveGestureDetector: MoveGestureDetector) {
        }

    })
}