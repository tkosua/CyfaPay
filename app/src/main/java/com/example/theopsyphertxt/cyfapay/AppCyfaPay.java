package com.example.theopsyphertxt.cyfapay;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by TheoPsyphertxt on 19/04/2017.
 */

public class AppCyfaPay extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this);
    }
}
