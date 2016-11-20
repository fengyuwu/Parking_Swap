package com.parkingswap;

/**
 * Created by jaskiratsingh on 10/29/16.
 */


import android.location.Location;
import android.widget.TextView;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import android.os.AsyncTask;
import java.io.*;
import java.util.*;

public class ServerLeave extends AsyncTask<Void, Void, Void>
{

    public static String who;
    TextView T1;
    //System.out.println(player.getID());

    ServerLeave(TextView textResponse) {
        this.T1 = textResponse;
    }


    @Override
    protected Void doInBackground(Void... arg0) {

        System.out.println("attempt");
        Socket s = null;
        try {
            s = new Socket("52.206.108.200", 4922);
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


        User player = new User ();
        boolean step2 = true;
        boolean step1 = true;
        while(step2)
        {
            if(step1)
            {

                System.out.println();
                System.out.println("YOU WANT TO PARK OR LEAVE?");



                String curWord = "LEAVE";

                out.println(curWord);
                out.flush();
                out.println(player.getID());
                out.flush();


                String dan = in.nextLine();
                while(dan.length()<1)
                {
                    dan = in.nextLine();
                }
                String lame = dan;

                if(dan.equals(lame)  )
                {

                    who = in.nextLine();
                    while(who.length()<1)
                    {
                        who = in.nextLine();
                    }
                    step2 = false;

                }


            }
        }
        return null;

    }

    @Override
    protected void onPostExecute(Void result) {
        super.onPostExecute(result);
        T1.setText(who);
    }
}