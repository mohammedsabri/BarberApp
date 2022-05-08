package com.example.barberapp.models

import android.os.Parcelable
import com.example.barberapp.firebase.FirebaseDBManager.database
import com.google.firebase.database.Exclude
import kotlinx.parcelize.Parcelize
import java.time.LocalDate.now
import java.time.LocalDateTime
import com.google.firebase.database.IgnoreExtraProperties

import java.util.*

@IgnoreExtraProperties
@Parcelize
data class BookModel(

    var uid: String = "",
    val service: String = "Haircut",
    val appDate: String,
    val time: String,
    var profilepic: String = "",
    val email: String = "moe@sabri.com",
    val barbername: String ="Moe",
    val cost: Int = 15,
    var latitude: Double = 0.0,
    var longitude: Double = 0.0) : Parcelable


: Parcelable
{
    @Exclude
    fun toMap(): Map<String, Any?> {
        return mapOf(
            "uid" to uid,
             "service" to service  ,
             "appDate" to appDate,
             "time" to time,
            "barbername" to barbername,
            "cost" to cost,
            "profilepic" to profilepic,
            "email" to email,
            "latitude" to latitude,
            "longitude" to longitude
        )
    }
}
