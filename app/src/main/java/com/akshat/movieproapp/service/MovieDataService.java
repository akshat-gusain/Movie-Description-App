package com.akshat.movieproapp.service;

import com.akshat.movieproapp.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieDataService {


    //https://api.themoviedb.org/3/movie/popular?api_key=2bb07fcc31ada1e9e0d642a53042f7a7
    @GET("movie/popular")
    Call<Result> getPopularMovies(@Query("api_key") String apiKey);
}
