package com.inquallity.digger.di;

import com.inquallity.digger.activity.MainActivity;

import dagger.Subcomponent;

/**
 * @author Maxim Radko on 19.04.2018.
 */
@MyScope
@Subcomponent(modules = AdaptersModule.class)
public interface AdaptersComponent {

    void inject(MainActivity ac);
}
