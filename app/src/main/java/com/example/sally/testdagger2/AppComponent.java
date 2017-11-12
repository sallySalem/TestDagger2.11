package com.example.sally.testdagger2;

import android.app.Application;
import android.os.Build;

import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by Sally on 10/11/2017.
 */

@Component(modules= {
        AndroidSupportInjectionModule.class,
        MainBuilder.class,
        AppModule.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder applications(TestApp app);
        AppComponent build();
    }

    void inject (TestApp app);
//    void inject (MainActivity mainActivity);
}
