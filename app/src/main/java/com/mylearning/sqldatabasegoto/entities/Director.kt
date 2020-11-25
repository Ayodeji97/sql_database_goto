package com.mylearning.sqldatabasegoto.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Director (
    @PrimaryKey (autoGenerate = false)
    val directName : String,
    // the school name the director is
    val schoolName : String
)