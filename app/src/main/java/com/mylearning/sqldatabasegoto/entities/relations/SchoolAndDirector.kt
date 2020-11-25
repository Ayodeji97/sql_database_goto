package com.mylearning.sqldatabasegoto.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.mylearning.sqldatabasegoto.entities.Director
import com.mylearning.sqldatabasegoto.entities.School

/**
 * Helper class that define the relationship between School table and Director table
 * **/
data class SchoolAndDirector (
    /** create an instance of school and director
     *  @Embedded to make properties inside of School class available in this class
     *  Only available in room database
     */
    @Embedded val school: School,
    @Relation (
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director
)