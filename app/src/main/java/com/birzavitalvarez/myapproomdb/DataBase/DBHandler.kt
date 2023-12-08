package com.birzavitalvarez.myapproomdb.DataBase

import android.content.Context
import androidx.room.Room

object DBHandler {
    fun getDB(context: Context): AppDatabase{
        return Room.databaseBuilder(context,AppDatabase::class.java,"user_db").allowMainThreadQueries().build()
    }
}