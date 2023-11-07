package com.example.kotlinkripto.service

import com.example.kotlinkripto.model.CryptoModel
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {

    //GET, POST, UPDATE, DELETE
    //URL BAZ: https://raw.githubusercontent.com/
    //GERİ KALAN: atilsamancioglu/K21-JSONDataSet/master/crypto.json
    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    fun getData(): Call<List<CryptoModel>>
}