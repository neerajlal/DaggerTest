package com.gtl.neeraj.daggertest.network;

import com.gtl.neeraj.daggertest.network.models.IndicesResponseVO;

import javax.inject.Inject;

import dagger.Module;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 10944 on 07-04-2018.
 */

@Module
public class ApiService {

    @Inject
    public ApiService() {
    }

    public void getData(Callback<IndicesResponseVO> callback) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(RequestService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RequestService service = retrofit.create(RequestService.class);
        Call<IndicesResponseVO> data = service.getIndices();
        data.enqueue(callback);
    }

}
