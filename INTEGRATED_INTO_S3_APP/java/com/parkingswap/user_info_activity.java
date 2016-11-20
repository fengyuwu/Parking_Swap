package com.parkingswap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.parkingswap.s3.UserProfileJson;

/**
 * Created by jaskiratsingh on 10/22/16.
 */

public class user_info_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_info_activity);
    }

    public void onClickUpdateInfo(View v){
        UserProfileJson upj = new UserProfileJson(this);
        upj.buildJson();
    }

}
