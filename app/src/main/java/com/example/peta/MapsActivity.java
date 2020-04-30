package com.example.peta;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng Pom1 = new LatLng(-7.904861, 112.572230);
        mMap.addMarker(new MarkerOptions().position(Pom1).title("Pom Bensin Batu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Pom1));

        LatLng Pom = new LatLng(-7.920749, 112.595094);
        mMap.addMarker(new MarkerOptions().position(Pom).title("Pom Bensin UMM"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Pom));

        LatLng Restoran = new LatLng(-7.922422, 112.596213);
        mMap.addMarker(new MarkerOptions().position(Restoran).title("Kedai Assalamualaikum"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Restoran));

        LatLng Polisi = new LatLng(-7.912637, 112.584576);
        mMap.addMarker(new MarkerOptions().position(Polisi).title("Polsek Dau"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Polisi));

        LatLng wisata = new LatLng(-7.896558, 112.553833);
        mMap.addMarker(new MarkerOptions().position(wisata).title("Jatim Park"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(wisata));

        LatLng sekolah = new LatLng(-7.916830, 112.588234);
        mMap.addMarker(new MarkerOptions().position(sekolah).title("SMP Dau"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sekolah));


        LatLng kades = new LatLng(-7.915757, 112.586796);
        mMap.addMarker(new MarkerOptions().position(kades).title("Kantor Desa"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kades));
    }
}
