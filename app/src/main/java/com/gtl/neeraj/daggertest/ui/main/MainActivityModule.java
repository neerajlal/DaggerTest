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
    MainContract.MainView provideMainView(MainActivity activity) {
        return activity;
    }

    @Provides
    MainContract.MainPresenter provideMainPresenter(MainContract.MainView view, ApiService service) {
        return new MainPresenterImpl(view, service);
    }

}
