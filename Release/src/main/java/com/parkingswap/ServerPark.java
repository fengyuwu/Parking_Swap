package com.parkingswap;

/**
 * Created by jaskiratsingh on 10/29/16.
 */


import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.widget.TextView;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import android.os.AsyncTask;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.*;
import java.util.*;

public class ServerPark extends AsyncTask<Void, Void, Void>
{


    String who = null;
    public static String LatPark = null;
    public static String LongPark = null;
    static String LotName = null;
    public static String Model_Park = null;
    public static String Make_Park = null;
    public static String Color_Park = null;
    @Override
    protected Void doInBackground(Void... arg0) {


        System.out.println("attempt");
        Socket s = null;
        try {
            s = new Socket( "52.206.108.200", 4922);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("tried");

        InputStream instream = null;
        try {
            instream = s.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        OutputStream outstream  = null;
        try {
            outstream = s.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner in = new Scanner(instream);
        PrintWriter out = new PrintWriter(outstream);
        User player = new User (FBMainActivity.mContext);
        boolean step1 = true;
        boolean step2 = true;
        while(step2)
        {
            if(step1)
            {
                System.out.println();
                System.out.println("YOU WANT TO PARK OR LEAVE?");



                String curWord = "PARK";
                out.println(curWord);
                out.flush();
                out.println(player.getID());
                out.flush();
                out.println(player.getLat());
                out.flush();
                out.println(player.getLong());
                out.flush();
                out.println(player.getLot());
                out.flush();
                out.println(player.getModel());
                out.flush();
                out.println(player.getMake());
                out.flush();
                out.println(player.getColor());
                out.flush();

                who = in.nextLine();
                while(who.length()<1)
                {
                    who = in.nextLine();
                }
                LatPark = in.nextLine();
                while(LatPark.length()<1)
                {
                    LatPark = in.nextLine();
                }
                LongPark = in.nextLine();
                while(LongPark.length()<1)
                {
                    LongPark = in.nextLine();
                }
                LotName = in.nextLine();
                while(LotName.length()<1)
                {
                    LotName = in.nextLine();
                }
                Model_Park = in.nextLine();
                while(Model_Park.length()<1)
                {
                    Model_Park = in.nextLine();
                }
                Make_Park = in.nextLine();
                while(Make_Park.length()<1)
                {
                    Make_Park = in.nextLine();
                }
                Color_Park = in.nextLine();
                while(Color_Park.length()<1)
                {
                    Color_Park = in.nextLine();
                }


                while (who == null || LatPark == null || LongPark == null || LotName == null || Model_Park == null || Make_Park == null || Color_Park == null){


            }
                step2 = false;

            }
        }


    return null;


    }


    @Override
    protected void onPostExecute(Void result) {
        super.onPostExecute(result);
        LotActivity.done = true;
        CampusMapActivity.alert.dismiss();
        CampusMapActivity.Info_Park = new AlertDialog.Builder(CampusMapActivity.Campus_Context)
                .setTitle("Matched User Car Information")
                .setMessage("Model: "+Model_Park+"\n"+"Make: "+Make_Park+"\n"+"Color: "+Color_Park)
                .setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //Do Nothing
                    }
                })
                .show();
        System.out.println("passed while in park");
        CampusMapActivity.setDirection.add(CampusMapActivity.current);
        CampusMapActivity.destination = new LatLng(Double.parseDouble(ServerPark.LatPark),Double.parseDouble(ServerPark.LongPark));
        CampusMapActivity.setDirection.add(CampusMapActivity.destination);
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        for (int i = 0; i < CampusMapActivity.setDirection.size(); i++) {
            builder.include(CampusMapActivity.setDirection.get(i));
        }
        LatLngBounds bounds = builder.build();
        CampusMapActivity.mMap.animateCamera(CameraUpdateFactory.newLatLngBounds(bounds, 10));
        CampusMapActivity.Directions();
        CampusMapActivity.mMap.addMarker(new MarkerOptions()
                .position(new LatLng(Double.parseDouble(LatPark),Double.parseDouble(LongPark)))
                .title("I am Leaving"));

    }

}
