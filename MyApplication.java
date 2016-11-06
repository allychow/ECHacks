package com.example.andrewseto.echacks;

import android.app.Application;

/**
 * Created by andrewseto on 05/11/2016.
 */
public class MyApplication extends Application {

    private String fName;

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

}
