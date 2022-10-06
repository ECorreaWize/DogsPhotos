package com.example.dogsphotos.data.network

import com.example.dogsphotos.config.Constants
import com.example.dogsphotos.data.model.DogResponseModel
import retrofit2.http.GET

interface DogApi {

    @GET(Constants.END_POINT)
    suspend fun getImages(): DogResponseModel

}