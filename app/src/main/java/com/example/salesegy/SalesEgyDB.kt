package com.example.salesegy

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.salesegy.database.Dao.SalesEgyDao
import com.example.salesegy.model.User

@Database(entities = [ User::class] , version = 1 ,exportSchema = false)
  abstract  class SalesEgyDB :RoomDatabase() {
      abstract val salesEgyDao: SalesEgyDao

    companion object{
        @Volatile
        private var INSTANCE : SalesEgyDB? = null

        fun getInstance(context: Context) : SalesEgyDB{
            synchronized(this){
                var instance : SalesEgyDB? = INSTANCE
                if(instance == null){
                    instance = Room.databaseBuilder( context.applicationContext ,
                        SalesEgyDB::class.java , "WHMDatabase").fallbackToDestructiveMigration().build()

                }
                return instance
            }
        }
    }
}