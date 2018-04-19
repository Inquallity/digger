package com.inquallity.digger;

import android.app.Application;

import com.inquallity.digger.di.AdaptersComponent;
import com.inquallity.digger.di.AdaptersModule;
import com.inquallity.digger.di.AppComponent;
import com.inquallity.digger.di.DaggerAppComponent;

/**
 * @author Maxim Radko on 19.04.2018.
 */

public class AppDelegate extends Application {

    public static AppComponent sAppComponent;

    public static AdaptersComponent adapters() {
        return sAppComponent.adapters(new AdaptersModule());
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sAppComponent = DaggerAppComponent
                .builder()
                .context(this)
                .build();
        sAppComponent.inject(this);
    }
}
