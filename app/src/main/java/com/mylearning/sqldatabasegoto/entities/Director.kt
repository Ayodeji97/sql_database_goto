package com.mylearning.sqldatabasegoto.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Director (
    @PrimaryKey (autoGenerate = false)
    val directName : String,
    /**the school name the director is
     * here we a placing the school primary key to the director
     * We can do it other way round
     */
    val schoolName : String
)