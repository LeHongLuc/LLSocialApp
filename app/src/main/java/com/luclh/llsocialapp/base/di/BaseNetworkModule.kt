package com.luclh.llsocialapp.base.di

import android.util.Log
import com.google.gson.Gson
import com.luclh.llsocialapp.data.resful.ClientService
import com.luclh.llsocialapp.data.resful.RetrofitBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object BaseNetworkModule {

    @Singleton
    @Provides
    fun providerGson(): Gson{
        return Gson()
    }

    @Singleton
    @Provides
    fun providerRetrofit(): ClientService{
        return RetrofitBuilder.getRetrofit().create(ClientService::class.java)
            .also { Log.d("TAG", "providesClientService: " + hashCode()) }
    }
}