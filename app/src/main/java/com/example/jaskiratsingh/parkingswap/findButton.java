package com.example.jaskiratsingh.parkingswap;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by jaskiratsingh on 10/24/16.
 */

public class findButton extends Application {


    private String ID;

    public String getButtonID() {

        return ID;
    }

    public void setID(String k) {
        this.ID = k;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(getBaseContext());
    }

}