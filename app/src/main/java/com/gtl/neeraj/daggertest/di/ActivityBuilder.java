package com.gtl.neeraj.daggertest.di;

import com.gtl.neeraj.daggertest.ui.bse.BseActivity;
import com.gtl.neeraj.daggertest.ui.bse.BseActivityModule;
import com.gtl.neeraj.daggertest.ui.nse.NseActivity;
import com.gtl.neeraj.daggertest.ui.nse.NseActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by 10944 on 06-04-2018.
 */

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = {NseActivityModule.class})
    abstract NseActivity bindNseActivity();

    @ContributesAndroidInjector(modules = {BseActivityModule.class})
    abstract BseActivity bindBseActivity();

}
