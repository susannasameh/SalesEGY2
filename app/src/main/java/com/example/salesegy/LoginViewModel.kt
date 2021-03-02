package com.example.salesegy

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.salesegy.database.Repository.SalesEgyRepositery
import com.example.salesegy.model.User

class LoginViewModel ( private val repository: SalesEgyRepositery): ViewModel(){
    suspend fun insertUsers(users: List<User>) = repository.insertUsers(users)

    fun loginUser(userName: String, password: String): User {
        return repository.loginUser(userName, password)
    }

    fun login(userName: String, password: String): Boolean{
        return repository.login(userName , password)
    }


    fun getAllUsers() = repository.users
}


class LoginViewModelFactory(private val repository: SalesEgyRepositery) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        try {
            val constructor = modelClass.getDeclaredConstructor(SalesEgyRepositery::class.java)
            return constructor.newInstance(repository)
        } catch (e: Exception) {
            Log.e("" , e.message.toString())
        }
        return super.create(modelClass)
    }
}


