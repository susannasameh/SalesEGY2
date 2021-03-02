package com.example.salesegy.database.Dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.salesegy.model.Customer

@Dao
interface CustomerDao {
    @Query("SELECT * FROM customer_table ORDER BY customer_name  desc" )
    fun getCustomerData():List<Customer>?
    @Insert
    fun insertCustomer (customer: Customer):Long
}