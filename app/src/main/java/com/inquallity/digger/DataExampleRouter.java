package com.inquallity.digger;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author Maxim Radko on 19.04.2018.
 */
@Singleton
public class DataExampleRouter {

    @Inject
    DataExampleRouter() {
    }

    public void data(String data) {
        Log.d("OYAEBU", "data: " + data);
    }
}
