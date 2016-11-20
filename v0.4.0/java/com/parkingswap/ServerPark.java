package com.parkingswap;

/**
 * Created by jaskiratsingh on 10/29/16.
 */


import android.widget.TextView;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import android.os.AsyncTask;
import com.google.android.gms.maps.model.LatLng;

import java.io.*;
import java.util.*;

public class ServerPark extends AsyncTask<Void, Void, Void>
{


    String who = null;
    public static String LatPark = null;
    public static String LongPark = null;
    String LotName = null;
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

        User player = new User();
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


                while (who == null || LatPark == null || LongPark == null || LotName == null){


            }
                step2 = false;

            }
        }


    return null;


    }


    @Override
    protected void onPostExecute(Void result) {
        super.onPostExecute(result);

    }

}
