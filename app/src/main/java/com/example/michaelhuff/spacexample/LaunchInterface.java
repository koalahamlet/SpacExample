package com.example.michaelhuff.spacexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface LaunchInterface {

    //https://api.spacexdata.com/v3/launches/past

    @GET("launches/past")
    Call<List<Launch>> getPastLaunchs();

}
