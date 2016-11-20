package com.parkingswap;

/**
 * Created by jaskiratsingh on 10/29/16.
 */

import java.util.*;

public class User
{
    static int id=0;


    public String where;
    public User( )
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
}
