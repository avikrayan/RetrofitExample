package com.example.avikrayan.retrofitexample;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by AvikRayan on 7/2/2017.
 */

public interface WebClient {
    @GET("bins/k84gn")
    Call<Model> fetchdata();
}
