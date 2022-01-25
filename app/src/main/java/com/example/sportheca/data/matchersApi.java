package com.example.sportheca.data;

import com.example.sportheca.domain.Match;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface matchersApi {

    @GET("matches.json")
    Call<List<Match>> getMatches();
}
