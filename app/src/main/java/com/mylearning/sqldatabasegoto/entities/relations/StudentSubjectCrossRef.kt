package com.mylearning.sqldatabasegoto.entities.relations

import androidx.room.Entity
@Entity
data class StudentSubjectCrossRef (
    /*
    * Because this is a relationship table, nor of this is the primary key
    * Instead, only the combination of both is the primary school
    * */

    val studentName : String,
    val subjectName : String
)