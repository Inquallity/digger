package com.inquallity.digger.di;

import android.content.Context;

import com.inquallity.digger.AppDelegate;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

/**
 * @author Maxim Radko on 19.04.2018.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(AppDelegate appDelegate);

    AdaptersComponent adapters(AdaptersModule adaptersModule);
    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder context(Context ctx);
        AppComponent build();
    }
}
