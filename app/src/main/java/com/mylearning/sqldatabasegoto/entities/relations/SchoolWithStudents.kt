package com.mylearning.sqldatabasegoto.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.mylearning.sqldatabasegoto.entities.School
import com.mylearning.sqldatabasegoto.entities.Student

/**
 * One to many relationship between school and students
 */

data class SchoolWithStudents (
    @Embedded val school: School,
    @Relation (
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )

    val student : List<Student>
)