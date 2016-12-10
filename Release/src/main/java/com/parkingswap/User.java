package com.parkingswap;

/**
 * Created by jaskiratsingh on 10/29/16.
 */


import android.content.Context;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class User
{
    int id=0;
    String lot="";
    String myLat = "";
    String myLong = "";
    String Model = "";
    String Make = "";
    String Color = "";
    BufferedReader br;
    FileInputStream fin;
    ArrayList<String> line = new ArrayList<>();
    public void onCreate(String filename,Context context) {
            try {
                fin = context.openFileInput(filename);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

    }

    public User(Context context)
    {onCreate(user_info_activity.file,context);
        br = new BufferedReader(new InputStreamReader(fin));
        for(int i = 0; i<3;i++)
        {
            try {
                line.add(i,br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Random rand = new Random();
        if (FBMainActivity.ParkOrLeave.equals("Leave")) {
            this.id = rand.nextInt(999999);
            this.lot = LotActivity.ID;
            this.myLat = LeaveActivity.LeaveLatitude;
            this.myLong = LeaveActivity.LeaveLongitude;
            this.Model = line.get(0);
            this.Make = line.get(1);
            this.Color = line.get(2);
        }
        else{

            this.id = rand.nextInt(999999);
            this.lot = LotActivity.ID;
            this.myLat = CampusMapActivity.Latitude;
            this.myLong = CampusMapActivity.Longitude;
            this.Model = line.get(0);
            this.Make = line.get(1);
            this.Color = line.get(2);

        }


    }
    public int getID()
    {
        return id;

    }
    public String getLot()
    {
        return lot;

    }

    public String getLat(){
        return myLat;
    }

    public String getLong(){
        return myLong;
    }

    public String getModel(){
        return Model;
    }

    public String getMake(){
        return Make;
    }

    public String getColor(){
        return Color;
    }


}