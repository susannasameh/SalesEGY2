package com.example.salesegy.database.Repository

import com.example.salesegy.database.Dao.SalesEgyDao
import com.example.salesegy.model.User

class SalesEgyRepositery (private val  dao: SalesEgyDao) {
    val users  =  dao.getAllUsers()

    suspend fun insertUsers(users:List<User>){
        dao.insertUsers(users)

    }

    fun login(userName: String, password: String): Boolean {

        return dao.login(userName , password)
    }
    fun loginUser(userName: String, password: String): User {
        return dao.loginUser(userName, password)
    }


}