package com.example.sally.testdagger2;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Sally on 11/11/2017.
 */

@Module
public abstract class MainBuilder {
    @ContributesAndroidInjector
    abstract MainActivity mainActivityBuilder();
}
