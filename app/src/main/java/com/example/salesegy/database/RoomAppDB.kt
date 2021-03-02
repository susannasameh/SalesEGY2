package com.example.salesegy.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.salesegy.database.Dao.CustomerDao
import com.example.salesegy.model.Customer


@Database(entities = [Customer::class],version = 1)
abstract class RoomAppDB : RoomDatabase(){

    abstract fun customerDao():CustomerDao?

    companion object {
        private var INSTANCE :RoomAppDB?= null
        fun getAppDatabase(context: Context): RoomAppDB?{
            if (INSTANCE==null){
          INSTANCE=  Room.databaseBuilder<RoomAppDB>(
                    context.applicationContext,RoomAppDB::class.java,"customer_DB"
            ).allowMainThreadQueries().build()
            }
            return INSTANCE
        }
    }
}