package com.example.quraniapp.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.quraniapp.repository.SurahDetailRepo;
import com.example.quraniapp.response.SurahDetailResponse;


public class SurahDetailViewModel extends ViewModel {

    public SurahDetailRepo surahDetailRepo;

    public SurahDetailViewModel() {
        surahDetailRepo = new SurahDetailRepo();
    }
    public LiveData<SurahDetailResponse> getSurahDetail(String lan , int id){
        return surahDetailRepo.getSurahDetail(lan,id);
    }
}
