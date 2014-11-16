package com.example.citivate;

import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;
import android.app.Activity;
import android.os.Bundle;

public class Map extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        // Get a handle to the Map Fragment
        GoogleMap map = ((MapFragment) getFragmentManager()
                .findFragmentById(R.id.mapView)).getMap();

        LatLng com = new LatLng(43.451024, -80.498029);

        map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(com, 17));

        LatLng bus = new LatLng(43.451914, -80.498581);
        map.addMarker(new MarkerOptions()
                .title("Bus Stop")
                .position(bus));
        
        LatLng f = new LatLng(43.451497, -80.497685);
        map.addMarker(new MarkerOptions()
                .title("Firken at the Tannery")
                .position(f));
        
        LatLng bike = new LatLng(43.451300, -80.498288);
        map.addMarker(new MarkerOptions()
                .title("Bike Rack")
                .position(bike));
        
        LatLng recycle = new LatLng(43.451031, -80.499485);
        map.addMarker(new MarkerOptions()
                .title("Recycling Bin")
                .position(recycle));
        
        LatLng recycle2 = new LatLng(43.451286, -80.497085);
        map.addMarker(new MarkerOptions()
        		.title("Recycling Bin")
                .position(recycle2));
    }
}