package com.example.dogsphotos.data.repository

import com.example.dogsphotos.data.model.DogResponseModel
import com.example.dogsphotos.data.network.DogApi
import javax.inject.Inject

class DogsRepo @Inject constructor(
    private val dogApi: DogApi
) {
    suspend fun getDogImages(): DogResponseModel {
        return dogApi.getImages()
    }
}