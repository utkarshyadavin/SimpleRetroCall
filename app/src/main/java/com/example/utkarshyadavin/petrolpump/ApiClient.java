package com.example.utkarshyadavin.petrolpump;

import com.example.utkarshyadavin.petrolpump.api.ApiService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by utkarshyadavin on 10/6/18.
 */

public class ApiClient {

    private static final String ROOT_URL = "https://mypetrolpump.com" ;


    // Getting a retrofit instance
    private static Retrofit getRetrofitInstance(){
        return new Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build() ;
    }

    public static ApiService getApiService() {
        return getRetrofitInstance().create(ApiService.class);
    }

}
