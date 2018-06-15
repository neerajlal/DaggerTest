package com.gtl.neeraj.daggertest.ui.bse;


import com.gtl.neeraj.daggertest.network.ApiService;

import dagger.Module;
import dagger.Provides;

@Module
public class BseActivityModule {

    @Provides
    BseContract.View provideBseView(BseActivity activity) {
        return activity;
    }

    @Provides
    BsePresenterImpl provideBsePresenter(BseContract.View view, ApiService service) {
        return new BsePresenterImpl(view, service);
    }

}
