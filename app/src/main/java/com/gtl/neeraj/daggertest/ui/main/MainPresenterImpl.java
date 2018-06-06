package com.gtl.neeraj.daggertest.ui.main;

import com.gtl.neeraj.daggertest.network.ApiService;
import com.gtl.neeraj.daggertest.network.models.IndicesResponseVO;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

/**
 * Created by 10944 on 07-04-2018.
 */

public class MainPresenterImpl implements MainPresenter {

    private MainView mainView;
    private ApiService apiService;

    @Inject
    public MainPresenterImpl(MainView mainView, ApiService apiService) {
        this.mainView = mainView;
        this.apiService = apiService;
    }

    @Override
    public void getData() {
        apiService.getData(new retrofit2.Callback<IndicesResponseVO>() {
            @Override
            public void onResponse(retrofit2.Call<IndicesResponseVO> call, retrofit2.Response<IndicesResponseVO> response) {
                IndicesResponseVO data = response.body();
                Map<String, String> temp = new HashMap<>();
                if (data != null) {
                    temp.put("Status", data.getStatus());
                    temp.put("Pre Open", String.valueOf(data.getPreOpen()));
                    temp.put("Pre Close", String.valueOf(data.getPreClose()));
                    temp.put("Time", data.getTime());
                    temp.put("Corr Open", String.valueOf(data.getCorrOpen()));
                    temp.put("Corr Close", String.valueOf(data.getCorrClose()));
                    temp.put("Code", String.valueOf(data.getCode()));
                    temp.put("Halted Status", data.getHaltedStatus());
                    temp.put("Mkt Open", String.valueOf(data.getMktOpen()));
                    temp.put("Mkt Close", String.valueOf(data.getMktClose()));
                }
                mainView.setData(temp);
            }

            @Override
            public void onFailure(retrofit2.Call<IndicesResponseVO> call, Throwable t) {

            }
        });
    }

}
