package com.mcoders.wanderview.domain.repository

import com.mcoders.wanderview.data.remote.DetailsApi
import javax.inject.Inject

class DetailsRepository @Inject constructor(
    private val detailsApi: DetailsApi
){

}