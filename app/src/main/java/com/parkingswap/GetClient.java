package com.parkingswap;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class GetClient extends Activity {

    TextView response;
    Button buttonConnect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server);

        buttonConnect = (Button) findViewById(R.id.connectButton);
        response = (TextView) findViewById(R.id.T1);

        buttonConnect.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Server myClient = new Server(response);
                myClient.execute();

                do{
                    response.setText(Server.who);
                    try {
                        Thread.sleep(1000); //Retry every second
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }while(response.getText().length() == 0);

                response.setText(response.getText()+" Done!");

            }

        });


    }

}