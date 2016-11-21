package com.parkingswap;

/**
 * Created by jaskiratsingh on 10/29/16.
 */

/*import java.util.*;

public class User
{
    static int id=0;


    public String where;
    public User()
    {
        Random rand = new Random();
        this.id= rand.nextInt(999999);


    }
    public String getWhere()
    {
        return where;
    }
    public int getID()
    {
        return id;
    }


    public String toString(){
        return "I am "+where;
    }
}*/


import java.util.*;

public class User
{
    static int id=0;
    String lot="";
    String myLat = "";
    String myLong = "";


    public User()
    {
        Random rand = new Random();
        if (FBMainActivity.ParkOrLeave.equals("Leave")) {
            this.id = rand.nextInt(999999);
            this.lot = LotActivity.ID;
            this.myLat = LeaveActivity.LeaveLatitude;
            this.myLong = LeaveActivity.LeaveLongitude;
        }
        else{

            this.id = rand.nextInt(999999);
            this.lot = LotActivity.ID;
            this.myLat = CampusMapActivity.Latitude;
            this.myLong = CampusMapActivity.Longitude;

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

}