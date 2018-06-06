package com.gtl.neeraj.daggertest.di;

import com.gtl.neeraj.daggertest.ui.main.MainActivity;
import com.gtl.neeraj.daggertest.ui.main.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by 10944 on 06-04-2018.
 */

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = {MainActivityModule.class})
    abstract MainActivity bindMainActivity();

}
