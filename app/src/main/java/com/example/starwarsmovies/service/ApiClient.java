package com.example.starwarsmovies.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static final String BASE_URL = "http://swapi.co/api/";

    private static ApiInterface apiInterface;

    public static ApiInterface getServices(){
        if (apiInterface == null){
            buildServices();
        }
        return apiInterface;
    }

    private static void buildServices(){

        apiInterface = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(ApiInterface.class);
    }
}