package com.birzavitalvarez.myapproomdb.DataBase

import androidx.room.Database
import androidx.room.RoomDatabase
import com.birzavitalvarez.myapproomdb.DAO.UserDAO
import com.birzavitalvarez.myapproomdb.Entity.UserEntity

@Database(entities = [UserEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract val userDao : UserDAO
}
