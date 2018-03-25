package com.example.junhee.omg.utils

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by JunHee on 2018. 3. 24..
 */
public class RemoteUtil {

    companion object {
        val BASE_URL = "https://api.twitter.com/1.1/"
        val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()

        val service: ScheduleApi = retrofit.create(ScheduleApi::class.java)
    }
}