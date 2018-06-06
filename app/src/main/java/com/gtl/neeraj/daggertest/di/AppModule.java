package com.gtl.neeraj.daggertest.di;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by 10944 on 06-04-2018.
 */

@Module
public class AppModule {

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

}
