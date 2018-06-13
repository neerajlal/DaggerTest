package com.gtl.neeraj.daggertest.ui.nse;

import com.gtl.neeraj.daggertest.network.ApiService;

import dagger.Module;
import dagger.Provides;

/**
 * Created by 10944 on 06-04-2018.
 */

@Module
public class NseActivityModule {

    @Provides
    NseContract.MainView provideMainView(NseActivity activity) {
        return activity;
    }

    @Provides
    NseContract.MainPresenter provideMainPresenter(NseContract.MainView view, ApiService service) {
        return new NsePresenterImpl(view, service);
    }

}
