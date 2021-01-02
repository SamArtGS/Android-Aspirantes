package com.proteco.almacenesssa.ui.main

import android.Manifest
import android.Manifest.permission.ACCESS_FINE_LOCATION
import android.app.Activity
import android.content.pm.PackageManager
import android.location.Location
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import com.proteco.almacenesssa.R
import org.json.JSONObject


class Mapa : Fragment(), OnMapReadyCallback,GoogleMap.OnMarkerClickListener{
    object JSON
    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityCompat.requestPermissions(this.requireActivity(),
            arrayOf(ACCESS_FINE_LOCATION)
            ,1)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater.inflate(R.layout.fragment_mapa, container, false)

        var mapFragment : SupportMapFragment? = childFragmentManager.findFragmentById(R.id.mapita) as? SupportMapFragment
        mapFragment?.getMapAsync(this)
        return rootView
    }


    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        // mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID)
        // mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE)
        // mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN)
        // mMap.setMapType(GoogleMap.MAP_TYPE_NONE)

        if (ContextCompat.checkSelfPermission(this.context!!, android.Manifest.permission.ACCESS_FINE_LOCATION) ==
            PackageManager.PERMISSION_GRANTED &&
            ContextCompat.checkSelfPermission(this.context!!, android.Manifest.permission.ACCESS_COARSE_LOCATION) ==
            PackageManager.PERMISSION_GRANTED) {



            mMap.mapType = GoogleMap.MAP_TYPE_NORMAL
            googleMap.isMyLocationEnabled = true
            googleMap.uiSettings.isMyLocationButtonEnabled = true
            mMap.isTrafficEnabled = true
            mMap.uiSettings.isZoomControlsEnabled = false
            mMap.uiSettings.isCompassEnabled = true
            mMap.uiSettings.isRotateGesturesEnabled = true
            mMap.uiSettings.isZoomGesturesEnabled = true
            mMap.setOnMarkerClickListener(this)


        } else {
            Toast.makeText(this.context, "No tengo permisos de ubicación", Toast.LENGTH_LONG).show();
        }

        val jsonfile: String = this.context!!.assets.open("AlmacenesAndroid.json").bufferedReader().use {it.readText()}
        var jsonObject = JSONObject(jsonfile)
        var item1:JSONObject = jsonObject.getJSONObject("CLUES")
        var item2:JSONObject = jsonObject.getJSONObject("LATITUD")
        var item3:JSONObject = jsonObject.getJSONObject("LONGITUD")
        var keys = item1.keys()


        while(keys.hasNext()) {
            var keia = keys.next()
            println("Valor clave es $keia")
            var clues = item1.getString("$keia")
            var lat = item2.getDouble("$keia")
            var log = item3.getDouble("$keia")
            when("$keia".toInt()){
                in 1..300 -> mMap.addMarker(MarkerOptions().position(LatLng(lat, log))
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)).snippet(clues).title(clues))
                in 300..400 ->  mMap.addMarker(MarkerOptions().position(LatLng(lat, log))
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)).snippet(clues).title(clues))
                in 400..3000 ->  mMap.addMarker(MarkerOptions().position(LatLng(lat, log))
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)).snippet(clues).title(clues))
                in 3000..10000 ->  mMap.addMarker(MarkerOptions().position(LatLng(lat, log))
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)).snippet(clues).title(clues))
                in 10000..30000 ->  mMap.addMarker(MarkerOptions().position(LatLng(lat, log))
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)).snippet(clues).title(clues))
                in 30000..35000 ->  mMap.addMarker(MarkerOptions().position(LatLng(lat, log))
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)).snippet(clues).title(clues))
                else -> {
                    mMap.addMarker(MarkerOptions().position(LatLng(lat, log))
                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)).snippet(clues).title(clues))
                }
            }
        }

    }

    override fun onMarkerClick(p0: Marker?): Boolean {
        return true
    }


}