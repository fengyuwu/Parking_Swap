package com.parkingswap.server;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.parkingswap.R;

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

<<<<<<< HEAD:INTEGRATED_INTO_S3_APP/java/com/parkingswap/server/GetClient.java
                do{
                    response.setText(Server.who);
                    try {
                        Thread.sleep(1000); //Retry every second
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }while(response.getText().length() == 0);

                response.setText(response.getText()+" Done!");
=======
>>>>>>> master:app/src/main/java/com/parkingswap/GetClient.java

            }

        });



    }


}