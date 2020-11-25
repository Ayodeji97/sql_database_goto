package com.mylearning.sqldatabasegoto.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.mylearning.sqldatabasegoto.entities.Student
import com.mylearning.sqldatabasegoto.entities.Subject

data class SubjectWithStudents (
    @Embedded val subject: Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )

    val student : List<Student>
)