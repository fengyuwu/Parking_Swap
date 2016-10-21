package com.example.jaskiratsingh.parkingswap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by jaskiratsingh on 9/14/16.
 */
public class LotActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lots);
    }

//    public void onButtonClickMap(View v){
//
//        startActivity(new Intent("Map_class.Map"));
//    }

    public void onButtonClickButton1(View v){
        startActivity(new Intent("Arena_class.Map"));

    }

    public void onButtonClickButton2(View v){
        startActivity(new Intent("Alumni_class.Map"));

    }

    public void onButtonClickButton3(View v){
        startActivity(new Intent("Baird_class.Map"));

    }

    public void onButtonClickButton4(View v){
        startActivity(new Intent("Cooke_class.Map"));

    }

    public void onButtonClickButton5(View v){
        startActivity(new Intent("Crofts_class.Map"));

    }

    public void onButtonClickButton6(View v){
        startActivity(new Intent("Fargo_class.Map"));

    }

    public void onButtonClickButton7(View v){
        startActivity(new Intent("Furnas_class.Map"));

    }

    public void onButtonClickButton8(View v){
        startActivity(new Intent("Governors_class.Map"));

    }

    public void onButtonClickButton9(View v){
        startActivity(new Intent("Hochstetter_class.Map"));

    }

    public void onButtonClickButton10(View v){
        startActivity(new Intent("Jacobs_class.Map"));

    }

    public void onButtonClickButton11(View v){
        startActivity(new Intent("Jarvis_class.Map"));

    }

    public void onButtonClickButton12(View v){
        startActivity(new Intent("Ketter_class.Map"));

    }

    public void onButtonClickButton13(View v){
        startActivity(new Intent("LakeLaSalle_class.Map"));

    }

    public void onButtonClickButton14(View v){
        startActivity(new Intent("RedJacket_class.Map"));

    }

    public void onButtonClickButton15(View v){
        startActivity(new Intent("Richmond_class.Map"));

    }

    public void onButtonClickButton16(View v){
        startActivity(new Intent("Stadium_class.Map"));

    }

    public void onButtonClickButton17(View v){
        startActivity(new Intent("Slee_class.Map"));

    }

    public void onButtonClickButton18(View v){
        startActivity(new Intent("Spaulding_class.Map"));

    }


}

