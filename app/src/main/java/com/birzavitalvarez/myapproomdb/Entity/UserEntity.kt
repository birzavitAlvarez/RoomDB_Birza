package com.birzavitalvarez.myapproomdb.Entity

import androidx.room.*


@Entity(tableName = "users")
data class UserEntity (

    @PrimaryKey(autoGenerate = true)
    val id: Int=0,
    val name: String,
    val email:String

)