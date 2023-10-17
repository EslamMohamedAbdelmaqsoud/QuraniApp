package com.example.quraniapp.network;

import com.example.quraniapp.response.SurahDetailResponse;
import com.example.quraniapp.response.SurahResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface JsonPlaceHolderApi {

    @GET("surah")
    Call<SurahResponse> getSurah();

    @GET("sura/{language}/{id}")
    Call<SurahDetailResponse> getSurahDetail(@Path("language")String lan,
                                             @Path("id") int surahId);
}