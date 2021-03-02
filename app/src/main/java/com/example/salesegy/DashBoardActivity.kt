package com.example.salesegy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_dash_board.*

class DashBoardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)

        cardStartVisit.setOnClickListener {

                val intent = Intent(this, PickCustomerActivity::class.java)
                startActivity(intent)
            }
        cardNewCustomerRetail.setOnClickListener{
            val intent1 = Intent(this,NewCustomerActivity1::class.java)
            startActivity(intent1)
        }
    }
}