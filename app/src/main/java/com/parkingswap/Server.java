package com.parkingswap;

/**
 * Created by jaskiratsingh on 10/29/16.
 */


import android.widget.TextView;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import android.os.AsyncTask;
import java.io.*;
import java.util.*;

public class Server extends AsyncTask<Void, Void, Void>
{

<<<<<<< HEAD
    private final String EC2_ELASTIC_IP = "52.206.108.200";

    private String response = "";
    protected static String who;
    private String getButtonID() {

        return who;
}
    TextView T1;

=======
    String response = "";
    public static String who;
    public String getButtonID() {

        return who;
    }
    TextView T1;




>>>>>>> origin/xenalin
    Server(TextView textResponse) {
        this.T1 = textResponse;
    }


    @Override
    protected Void doInBackground(Void... arg0) {

<<<<<<< HEAD
        Socket s = null;

        try {

            s = new Socket("52.206.108.200", 4922);

        } catch (IOException e) {
            e.printStackTrace();
        }

=======
        System.out.println("attempt");
        Socket s = null;
        try {
            s = new Socket( "52.91.175.206", 4922);
        } catch (IOException e) {
            e.printStackTrace();
        }
>>>>>>> origin/xenalin
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
        System.out.println(player.getID());

        boolean step2 = true;
        boolean step1 = true;
<<<<<<< HEAD

=======
>>>>>>> origin/xenalin
        while(step2)
        {
            if(step1)
            {
<<<<<<< HEAD
                System.out.println(); //perfunctory
=======
                System.out.println();
                System.out.println("YOU WANT TO PARK OR LEAVE?");


>>>>>>> origin/xenalin

                String curWord = "PARK";

                out.println(curWord);
                out.flush();
                out.println(player.getID());
                out.flush();

<<<<<<< HEAD
                String matchFromServer = in.nextLine();
                while(matchFromServer.length()<1)
                {
                    matchFromServer = in.nextLine();
                }
                System.out.println();

                String lame = matchFromServer;

                if(matchFromServer.equals(lame)  )
=======

                String dan = in.nextLine();
                while(dan.length()<1)
                {
                    dan = in.nextLine();
                }
                String lame = dan;

                if(dan.equals(lame)  )
>>>>>>> origin/xenalin
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
        T1.setText(response);
        super.onPostExecute(result);
    }

}