package com.mylearning.sqldatabasegoto.entities

import androidx.room.PrimaryKey

data class Student (
    @PrimaryKey(autoGenerate = false)
    val studentName : String,
    val semester : Int,
    // Get the school name the student is and no other way round.
    val schoolName : String
)