package com.mylearning.sqldatabasegoto.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.mylearning.sqldatabasegoto.entities.Student
import com.mylearning.sqldatabasegoto.entities.Subject

data class StudentWithSubjects (
    @Embedded val student: Student,
    @Relation (
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )

    val subject: List<Subject>
)