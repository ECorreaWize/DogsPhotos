package com.example.dogsphotos.config

import com.example.dogsphotos.data.network.DogApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RetrofitHelper {

    @Provides
    @Singleton
    fun providesApi(builder: Retrofit.Builder): DogApi {
        return builder
            .build()
            .create(DogApi::class.java)
    }

    @Provides
    @Singleton
    fun providesRetrofit(): Retrofit.Builder {
        return Retrofit
            .Builder()
            .baseUrl(Constants.URL_BASE)
            .addConverterFactory(GsonConverterFactory.create())
    }
}