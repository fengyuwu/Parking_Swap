package com.example.jaskiratsingh.parkingswap;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TabHost;

/**
 * Created by jaskiratsingh on 9/14/16.
 */


public class LotActivity extends AppCompatActivity{

<<<<<<< HEAD
    public static String ID;

    public String getButtonID() {

        return ID;
    }

=======
>>>>>>> origin/develop

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lots);

        TabHost tabHost =(TabHost)findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec tab1 = tabHost.newTabSpec("North Campus");
        TabHost.TabSpec tab2 = tabHost.newTabSpec("South Campus");

        tab1.setContent(R.id.scroll1);
        tab1.setIndicator("North Campus");
        tabHost.addTab(tab1);

        tab2.setContent(R.id.scroll2);
        tab2.setIndicator("South Campus");
        tabHost.addTab(tab2);
    }


    public void onButtonClickSouth(View v){
        switch (v.getId()){
            case R.id.Abbott_A:
<<<<<<< HEAD
                LotActivity.ID = "Abbot_A";
                startActivity(new Intent("Campus_class.Campus"));
                break;
            case R.id.Clark:
                LotActivity.ID = "Clark";
                startActivity(new Intent("Campus_class.Campus"));
                break;
            case R.id.Main_Bailey:
                LotActivity.ID = "Main_Bailey";
                startActivity(new Intent("Campus_class.Campus"));
                break;
            case R.id.Parker:
                LotActivity.ID = "Parker";
                startActivity(new Intent("Campus_class.Campus"));
                break;
            case R.id.Sherman:
                LotActivity.ID = "Sherman";
                startActivity(new Intent("Campus_class.Campus"));
                break;
            case R.id.Townsend:
                LotActivity.ID = "Townsend";
                startActivity(new Intent("Campus_class.Campus"));
                break;



        }


=======
                //((findButton)this.getApplication()).setID("Abbot_A");
                startActivity(new Intent("Campus_class.Campus"));
                break;
            case R.id.Clark:
               // ((findButton)this.getApplication()).setID("Clark");
                startActivity(new Intent("Campus_class.Campus"));
                break;
            case R.id.Main_Bailey:
                //((findButton)this.getApplication()).setID("Main_Bailey");
                startActivity(new Intent("Campus_class.Campus"));
                break;
            case R.id.Parker:
                //((findButton)this.getApplication()).setID("Parker");
                startActivity(new Intent("Campus_class.Campus"));
                break;
            case R.id.Sherman:
                //((findButton)this.getApplication()).setID("Sherman");
                startActivity(new Intent("Campus_class.Campus"));
                break;
            case R.id.Townsend:
                //((findButton)this.getApplication()).setID("Townsend");
                startActivity(new Intent("Campus_class.Campus"));
                break;



        }


>>>>>>> origin/develop

    }
}
