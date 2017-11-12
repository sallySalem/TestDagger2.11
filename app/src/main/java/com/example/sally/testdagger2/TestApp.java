package com.example.sally.testdagger2;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by Sally on 10/11/2017.
 */

public class TestApp extends Application implements HasActivityInjector {
   // private AppComponent appComponent;
    @Inject
   DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        //appComponent  = DaggerAppComponent.create();
        DaggerAppComponent.builder().applications(this).build().inject(this);
    }

   // public AppComponent getAppComponent(){return appComponent;}

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
