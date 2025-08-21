package com.example.wishoclock.Model

import java.sql.Date
import java.sql.Time

data class Occasion (
    val name: String,
    val timeZone : Int,
    val date: Date,
    val time: Time,
    val occasionType: String
)
