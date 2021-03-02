package com.example.salesegy.database.Dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.salesegy.model.User

@Dao
interface SalesEgyDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUsers(users: List<User>)

    @Transaction
    @Query( "SELECT  * FROM  user_table")
    fun  getAllUsers(): LiveData<List<User>>


    @Query("SELECT * FROM  user_table WHERE user_name_en LIKE :userName   AND user_password LIKE :password  LIMIT 1")
    fun loginUser(userName: String, password: String): User


    @Query("SELECT * FROM  user_table WHERE user_name_en = :userName   AND user_password = :password  LIMIT 1")
    fun login(userName: String, password: String): Boolean

    @Query("SELECT EXISTS (SELECT 1 FROM user_table WHERE user_name_en = :userName)")
    fun exists(userName: String): Boolean

}