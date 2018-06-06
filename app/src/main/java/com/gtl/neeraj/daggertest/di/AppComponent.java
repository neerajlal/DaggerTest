package com.gtl.neeraj.daggertest.di;

import android.app.Application;

import com.gtl.neeraj.daggertest.MyApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.DaggerActivity;

/**
 * Created by 10944 on 06-04-2018.
 */

@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityBuilder.class})
public interface AppComponent extends AndroidInjector<DaggerActivity> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

    void inject(MyApplication app);

    @Override
    void inject(DaggerActivity instance);
}
