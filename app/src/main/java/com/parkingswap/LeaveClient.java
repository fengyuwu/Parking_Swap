package com.parkingswap;

import android.*;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.model.LatLng;


public class LeaveClient extends Activity {

    TextView response2;
    Button buttonLeave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave_lot);


        buttonLeave = (Button) findViewById(R.id.leaveButton);



        response2 = (TextView) findViewById(R.id.T4);


        buttonLeave.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                ServerLeave myClient = new ServerLeave(response2);
                myClient.execute();


            }

        });



    }


}