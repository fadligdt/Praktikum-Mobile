/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.devplat.lmoroney.maps3_3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MainActivity extends ActionBarActivity implements OnMapReadyCallback {

    GoogleMap m_map;
    boolean mapReady=false;

    //TODO 1 : Create CameraPostion :variable :  NEWYORK , LatLng : (40 784, -73.9857), zoom : (21), bearings (0), tilt (45)

    //TODO 2 : Create CameraPostion :variable :  SEATTLE, LatLng (47.6204, -122.3491), zoom (17), bearings 	(0), tilt (45)

    //TODO 3 : Create CameraPostion :variable : DUBLIN , LatLng (53.3478, -6.2597), 	zoom (17), bearings (90). tilt (45)


    //TODO 4 : Create CameraPostion :variable : BANDUNG ,LatLng (-.9034443,107.5731168), 	zoom (17), bearings (90). tilt (45)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO 6 : Declaration of button with id : btnSeattle

        //TODO 7 : Create a function on btnSeattle to change the appearance of a Map to SEATTLE

        //TODO 8 : Declaration of button with id btnDublin

        //TODO 9 : Create function on btnSeattle to change the appearance of a Map to DUBLIN


        Button btnBandung = (Button) findViewById(R.id.btnBandung);

        btnBandung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mapReady) {

                    //TODO 10 : Navigate the map to BANDUNG

                    //TODO 11 : Create a function to add the marker and set the position to BANDUNG

                }
            }
        });

        //TODO 16 : Declare a button with id btnMap

        //TODO 17 : Create a function on btnMap for implicit intent to move the application map


        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap map){
        //TODO 5 : Create mapReady and directed to NEWYORK


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void flyTo(CameraPosition target)
    {
        m_map.animateCamera(CameraUpdateFactory.newCameraPosition(target), 10000, null);



    }


    public void onClickOpenAddressButton(){
        // TODO 18 : Store an address in a String

        // TODO 19 : Use Uri.Builder with the appropriate scheme and query to form the Uri for the address


        // TODO 20 : Create an Intent with action type, Intent.ACTION_VIEW

        // TODO 21 : Set the data of the Intent to the Uri passed into this method

        // TODO 22 : Verify that this Intent can be launched and then call startActivity


    }
}
