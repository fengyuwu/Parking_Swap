package com.parkingswap;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class GetClient extends Activity {

    Button buttonConnect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_park);
        buttonConnect = (Button) findViewById(R.id.connectButton);
        buttonConnect.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                ServerPark myClient = new ServerPark();
                myClient.execute();


            }

        });



    }


}