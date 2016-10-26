package com.example.jaskiratsingh.parkingswap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by jaskiratsingh on 9/14/16.
 */
public class SettingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_activity); //SEND YOU TO THE PLAIN XML FILE
    }


    //F- Hnadle setting buttos on click IN HHIS CLASS.
    public void onButtonClickListenerLotsPreferences(View v){
        setContentView(R.layout.activity_lots);

    }
}
