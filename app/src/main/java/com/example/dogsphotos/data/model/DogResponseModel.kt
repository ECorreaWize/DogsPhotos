package com.example.dogsphotos.data.model

import com.google.gson.annotations.SerializedName

data class DogResponseModel(
    @SerializedName("message")
    var message: ArrayList<String>,
    @SerializedName("status")
    var status: String
)
