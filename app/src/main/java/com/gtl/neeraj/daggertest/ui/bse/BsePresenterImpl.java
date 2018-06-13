package com.gtl.neeraj.daggertest.ui.bse;

import com.gtl.neeraj.daggertest.network.ApiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BsePresenterImpl implements BseContract.Presenter {

    private ApiService apiService;
    private BseContract.View view;

    BsePresenterImpl(BseContract.View view, ApiService apiService) {
        this.view = view;
        this.apiService = apiService;
    }

    @Override
    public void getData() {
        apiService.getBSEData(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                view.setData(response.body());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                view.setError(t.toString());
            }
        });
    }
}
