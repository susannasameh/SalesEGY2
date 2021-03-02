package com.example.salesegy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.salesegy.database.RoomAppDB
import com.example.salesegy.model.Customer
import kotlinx.android.synthetic.main.activity_new_customer1.*

class NewCustomerActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_customer1)
         saveDatainRoomDb()

    }
    fun saveDatainRoomDb(){
        btnSaveCust.setOnClickListener {
            val customername = etCustName.text.toString()
            val customernamear = etCustNameAR.text.toString()
            val customercategory = etCustCategory.text.toString()
            val customercreditlimit = etCustCreditLimit.text.toString()
            val customercredittype = etCustCreditType.text.toString()
            val customeraddres = etCustAddress.text.toString()
            val customercountry = etCustCountry.text.toString()
            val customercity = etCustCity.text.toString()
            val customercontact = etCustContact.text.toString()
            val customercontactphone = etCustContactphone.text.toString()
            val customerloction = etCustLocation.text.toString()
            val customercontactwebsite = etCustContactWebsite.text.toString()
            val customercontactemail = etCustContactemail.text.toString()
            val customerphone1 = etCustphon1.text.toString()
            val customerphone2 = etCustphon2.text.toString()
            val customerphone3 = etCustphon3.text.toString()
            val customerDao = RoomAppDB.getAppDatabase(this)?.customerDao()
            val customerEntity = Customer(0,customername,customernamear,customercategory,customercreditlimit,customercredittype,customeraddres,customercountry,
                    customercity,customercontact,customercontactphone,customerloction,customercontactwebsite,customercontactemail,
                    customerphone1,customerphone2,customerphone3)
            val customerId= customerDao?.insertCustomer(customerEntity)
              startActivity(Intent(this@NewCustomerActivity1,PickCustomerActivity::class.java))


        }
        }
}