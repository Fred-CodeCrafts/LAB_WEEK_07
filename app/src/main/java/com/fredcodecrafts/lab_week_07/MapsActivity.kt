package com.fredcodecrafts.lab_week_07

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var map: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        // Get the SupportMapFragment and request notification when map is ready
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.mapFragment) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap

        // Example: add marker and move camera
        val exampleLocation = LatLng(-6.200000, 106.816666) // Jakarta
        map.addMarker(MarkerOptions().position(exampleLocation).title("Marker in Jakarta"))
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(exampleLocation, 10f))
    }
}
