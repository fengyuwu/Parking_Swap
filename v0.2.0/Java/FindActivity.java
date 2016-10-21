package com.example.jaskiratsingh.parkingswap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by jaskiratsingh on 9/14/16.
 */
public class FindActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);
    }


    public void onButtonClickLot(View v){

        startActivity(new Intent("Lot_class.Lot"));
    }

    public void onButtonClickMap(View v){

        startActivity(new Intent("Map_class.Map"));
    }
}



