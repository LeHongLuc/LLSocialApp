package com.luclh.llsocialapp.data.resful

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder() .baseUrl("").addConverterFactory(GsonConverterFactory.create()).build()
    }
}