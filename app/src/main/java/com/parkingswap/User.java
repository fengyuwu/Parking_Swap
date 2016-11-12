package com.parkingswap;

/**
 * Created by jaskiratsingh on 10/29/16.
 */

public class User {

    String id;

    public User() {
        id = UserId.getId();
    }

    public String getID() {
        return id;
    }

}
