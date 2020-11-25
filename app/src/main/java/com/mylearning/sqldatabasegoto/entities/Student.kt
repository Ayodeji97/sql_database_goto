package com.mylearning.sqldatabasegoto.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Student (
    @PrimaryKey(autoGenerate = false)
    val studentName : String,
    val semester : Int,
    // Get the school name the student is and no other way round.
    val schoolName : String
)