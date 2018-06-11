package com.gtl.neeraj.daggertest.network;

import com.gtl.neeraj.daggertest.network.models.IndicesResponseVO;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestService {
    String NSE_BASE_URL = "https://www.nseindia.com/";
    String BSE_BASE_URL = "https://www.bseindia.com/";

    @GET("homepage/Indices1.json")
    Call<IndicesResponseVO> getIndices();

    @GET("Msource/FlagData.aspx")
    Call<String> getFlagData();
}