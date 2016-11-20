package com.parkingswap;

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
import com.parkingswap.R;
/**
 * Created by jaskiratsingh on 9/14/16.
 */


public class LotActivity extends AppCompatActivity{

    public static String ID;

    public String getButtonID() {

        return ID;
    }


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

    public void onButtonClickNorth(View v){
        switch(v.getId()){
            case R.id.Arena:
                LotActivity.ID = "Arena";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.AlumniA:
                LotActivity.ID = "AlumniA";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.AlumniB:
                LotActivity.ID = "AlumniB";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.AlumniC:
                LotActivity.ID = "AlumniC";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.BairdA:
                LotActivity.ID = "BairdA";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.CookeA:
                LotActivity.ID = "CookeA";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.CookeB:
                LotActivity.ID = "CookeB";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.Crofts:
                LotActivity.ID = "Crofts";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.Fargo:
                LotActivity.ID = "Fargo";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.GovernorsB:
                LotActivity.ID = "GovernorsB";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.GovernorsC:
                LotActivity.ID = "GovernorsC";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.GovernorsD:
                LotActivity.ID = "GovernorsD";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.GovernorsE:
                LotActivity.ID = "GovernorsE";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.HochstetterB:
                LotActivity.ID = "HochstetterB";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.JacobsB:
                LotActivity.ID = "JacobsB";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.JacobsC:
                LotActivity.ID = "JacobsC";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.JarvisA:
                LotActivity.ID = "JarvisA";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.JarvisB:
                LotActivity.ID = "JarvisB";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.Ketter:
                LotActivity.ID = "Ketter";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.LakeLaSalle:
                LotActivity.ID = "LakeLaSalle";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.RedJacket:
                LotActivity.ID = "RedJacket";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.RichmondA:
                LotActivity.ID = "RichmondA";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.RichmondB:
                LotActivity.ID = "RichmondB";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.SpecialEventParking:
                LotActivity.ID = "SpecialEventParking";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.Stadium:
                LotActivity.ID = "Stadium";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.SleeA:
                LotActivity.ID = "SleeA";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.SleeB:
                LotActivity.ID = "SleeB";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.Spaulding:
                LotActivity.ID = "Spaulding";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
        }

    }


    public void onButtonClickSouth(View v){
        switch (v.getId()){
            case R.id.Abbott_A:
                LotActivity.ID = "Abbot_A";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.Clark:
                LotActivity.ID = "Clark";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.Main_Bailey:
                LotActivity.ID = "Main_Bailey";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.Parker:
                LotActivity.ID = "Parker";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.Sherman:
                LotActivity.ID = "Sherman";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;
            case R.id.Townsend:
                LotActivity.ID = "Townsend";
                if (FBMainActivity.ParkOrLeave.equals("Leave"))
                {
                    startActivity(new Intent("Leave_class.Leave"));
                }
                else
                {
                    startActivity(new Intent("Campus_class.Campus"));
                }
                break;



        }



    }
}
