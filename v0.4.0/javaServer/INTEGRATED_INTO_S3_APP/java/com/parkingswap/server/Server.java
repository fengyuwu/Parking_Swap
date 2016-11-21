package com.parkingswap.server;

/**
 * Created by jaskiratsingh on 10/29/16.
 */


import android.os.AsyncTask;
import android.widget.TextView;

import com.parkingswap.s3.User;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Server extends AsyncTask<Void, Void, Void>
{

    private final String EC2_ELASTIC_IP = "52.206.108.200";

    private String response = "";
    protected static String who;
    private String getButtonID() {

        return who;
}
    TextView T1;

    Server(TextView textResponse) {
        this.T1 = textResponse;
    }


    @Override
    protected Void doInBackground(Void... arg0) {

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


        User player = new User();
        System.out.println(player.getID());

        boolean step2 = true;
        boolean step1 = true;

        while(step2)
        {
            if(step1)
            {
                System.out.println(); //perfunctory

                String curWord = "PARK";

                out.println(curWord);
                out.flush();
                out.println(player.getID());
                out.flush();

                String matchFromServer = in.nextLine();
                while(matchFromServer.length()<1)
                {
                    matchFromServer = in.nextLine();
                }
                System.out.println();

                String lame = matchFromServer;

                if(matchFromServer.equals(lame)  )
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