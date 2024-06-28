package com.mcoders.wanderview.data.remote

import com.mcoders.wanderview.data.models.Details
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.Url

interface DetailsApi {
    @GET("details/{id}")
    suspend fun getDetails(@Path("id") id: String): Call<Details>
}

class DetailsApiImpl: DetailsApi {
    override suspend fun getDetails(id: String): Call<Details> {

        TODO("Not yet implemented")
    }
}
