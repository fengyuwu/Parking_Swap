package com.parkingswap.cognito;

/**
 * Created by Baldy 19 on 11/11/2016.
 */
public class UserId {

    private static String id;

    private UserId(String id) {
        this.id = id;
        System.out.println("Created user: "+id);
    }

    public static String getId(){
        return id;
    }

    public static void setId(String id){
        UserId.id = id;
    }

}
