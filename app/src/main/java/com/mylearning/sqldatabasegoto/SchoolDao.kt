package com.mylearning.sqldatabasegoto

import androidx.room.*
import com.mylearning.sqldatabasegoto.entities.Director
import com.mylearning.sqldatabasegoto.entities.School
import com.mylearning.sqldatabasegoto.entities.Student
import com.mylearning.sqldatabasegoto.entities.relations.SchoolAndDirector
import com.mylearning.sqldatabasegoto.entities.relations.SchoolWithStudents

/**
 * Data access object
 * **/
@Dao
interface SchoolDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchool (school: School)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector (director: Director)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudent (student: Student)

    @Transaction
    @Query("SELECT * FROM school WHERE schoolName = :schoolName")
    suspend fun getSchoolAndDirectorWithSchoolName (schoolName : String) : List<SchoolAndDirector>

    @Transaction
    @Query("SELECT * FROM school WHERE schoolName = :schoolName")
    suspend fun getSchoolWithStudents (schoolName: String) : List<SchoolWithStudents>



}