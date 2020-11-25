package com.mylearning.sqldatabasegoto

import androidx.room.*
import com.mylearning.sqldatabasegoto.entities.Director
import com.mylearning.sqldatabasegoto.entities.School
import com.mylearning.sqldatabasegoto.entities.relations.SchoolAndDirector

/**
 * Data access object
 * **/
@Dao
interface SchoolDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchool (school: School)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector (director: Director)

    @Transaction
    @Query("SELECT * FROM school WHERE schoolName = :schoolName")
    suspend fun getSchoolAndDirectorWithSchoolName (schoolName : String) : List<SchoolAndDirector>



}