package com.gtl.neeraj.daggertest.ui.main;

import com.gtl.neeraj.daggertest.network.ApiService;

import dagger.Module;
import dagger.Provides;

/**
 * Created by 10944 on 06-04-2018.
 */

@Module
public class MainActivityModule {

    @Provides
    MainView provideMainView(MainActivity activity) {
        return activity;
    }

    @Provides
    MainPresenter provideMainPresenter(MainView view, ApiService service) {
        return new MainPresenterImpl(view, service);
    }

}
