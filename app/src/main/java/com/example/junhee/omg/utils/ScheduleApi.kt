package com.example.junhee.omg.utils

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Created by JunHee on 2018. 3. 24..
 */
public interface ScheduleApi{

    @GET ("statuses/user_timeline/{user_id}")
    fun getTimeline(@Path("user_id") userId: String): Observable<String>
}
