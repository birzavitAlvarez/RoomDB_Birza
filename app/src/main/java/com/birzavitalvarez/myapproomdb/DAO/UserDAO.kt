package com.birzavitalvarez.myapproomdb.DAO

import androidx.room.*
import com.birzavitalvarez.myapproomdb.Entity.UserEntity

@Dao
interface UserDAO {

    @Query("SELECT * FROM users")
    suspend fun getAll(): List<UserEntity>

    @Query("SELECT * FROM users WHERE id IN (:id)")
    suspend fun loadAllByIds(id: IntArray): List<UserEntity>

    @Query("SELECT * FROM users WHERE name LIKE :name AND email LIKE :email LIMIT 1")
    suspend fun findByName(name: String, email: String): UserEntity

    @Insert
    suspend fun insertAll(vararg users: UserEntity)

    @Delete
    suspend fun delete(user: UserEntity)
    //
    @Insert()
    suspend fun insertUser(user:UserEntity)
    //
    @Update
    suspend fun updateUser(user:UserEntity)
    //
    @Delete
    suspend fun deleteUser(user:UserEntity)
    //
    @Query("SELECT * FROM users")
    suspend fun getAllUsers(): List<UserEntity>
    //
    @Query("SELECT * FROM users WHERE id = :id")
    suspend fun getUSersById(id: Int): UserEntity

}