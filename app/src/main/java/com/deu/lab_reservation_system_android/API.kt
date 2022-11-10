package com.deu.lab_reservation_system_android

import retrofit2.Call
import retrofit2.http.*

public interface API {
    // login
    @POST("/api/login")
    fun getLoginResponse(@Body user: User): Call<String>
}