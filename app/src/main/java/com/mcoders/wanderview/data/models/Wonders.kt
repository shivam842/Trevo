package com.mcoders.wanderview.data.models

import com.google.gson.annotations.SerializedName

data class WondersList(
    val destinations: List<Destination>,
)

data class Destination(
    val name: String,
    val location: Location,
    val details: Details,
    val photos: List<Photo>,
    val reviews: List<Review>,
    @SerializedName("nearby_attractions")
    val nearbyAttractions: List<NearbyAttraction>,
    @SerializedName("opening_hours")
    val openingHours: OpeningHours,
)

data class Location(
    val latitude: Double,
    val longitude: Double,
    val address: String,
)

data class Details(
    val description: String,
    val length: String?,
    val built: String?,
    @SerializedName("visitor_count_per_year")
    val visitorCountPerYear: String,
    @SerializedName("official_website")
    val officialWebsite: String,
    val established: String?,
    val height: String?,
)

data class Photo(
    val url: String,
    val description: String,
    val credit: String,
    val resolution: String,
)

data class Review(
    val user: String,
    val rating: Long,
    val comment: String,
    val date: String,
)

data class NearbyAttraction(
    val name: String,
    @SerializedName("distance_km")
    val distanceKm: Double,
    val description: String,
)

data class OpeningHours(
    val monday: String,
    val tuesday: String,
    val wednesday: String,
    val thursday: String,
    val friday: String,
    val saturday: String,
    val sunday: String,
)
