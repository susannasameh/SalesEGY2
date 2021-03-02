package com.example.salesegy

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.salesegy.database.Repository.SalesEgyRepositery
import com.example.salesegy.model.User
import com.example.salesegy.network.ApiService
import com.example.salesegy.network.Client
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Response
import retrofit2.awaitResponse

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: LoginViewModel
    private lateinit var database: SalesEgyDB
    private lateinit var repository: SalesEgyRepositery
    private lateinit var factory: LoginViewModelFactory
    lateinit var sharedPreferences: SharedPreferences

    var isRemember = false
    var loginValue  = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database = SalesEgyDB.getInstance(this)
        repository = SalesEgyRepositery(database.salesEgyDao)
        factory = LoginViewModelFactory(repository)
        viewModel = ViewModelProvider(this, factory)[LoginViewModel::class.java]


        sharedPreferences = getSharedPreferences("rememberMe", MODE_PRIVATE)
        isRemember = sharedPreferences.getBoolean("CheckBox", false)
        if (isRemember) {
            val intent = Intent(this, DashBoardActivity::class.java)
            startActivity(intent)
            finish()
        }


        buttonLogin.setOnClickListener {
            val username = editTextEmail.text.toString()
            val password = editTextPassword.text.toString()
            val checked = checkbox.isChecked


            if (editTextEmail.text != null && editTextPassword.text != null) {
                viewModel.getAllUsers()

                GlobalScope.launch(Dispatchers.IO) {
                    loginValue = viewModel.login(username, password)

                    //  viewModel.login(username, password)

                    //  Log.e("Login :" , viewModel.login(username,password).toString()  )
                }
                if(loginValue == true){
                    val editor: SharedPreferences.Editor = sharedPreferences.edit()
                    editor.putString("username", username)
                    editor.putString("password", password)
                    editor.putBoolean("CheckBox", checked)
                    editor.apply()



                    Toast.makeText(applicationContext, "Information Saved", Toast.LENGTH_LONG).show()
                    val intent = Intent(this, DashBoardActivity::class.java)
                    startActivity(intent)
//                    finish()
                }
                else{
                    Toast.makeText(applicationContext, "Please Enter a valid User Name And Password ", Toast.LENGTH_LONG).show()

                }



            }




        }
        downloadBtn.setOnClickListener {
            loadData()
        }


    }


    private fun loadData() {

        progressbar.visibility = View.VISIBLE
        GlobalScope.launch(Dispatchers.IO) {
            try {
                val apiservice: ApiService =
                    Client.getRetrofitInstance().create(ApiService::class.java)

                val response: Response<List<User>> = apiservice.getData().awaitResponse()

                if (response.isSuccessful) {
                    val data = response.body()!!
                    Log.e(" User name ", data.get(0).userNameEn.toString()+ "")

                    val userList = data


                    withContext(Dispatchers.IO) {
                        viewModel.insertUsers(userList)


                    }



                    withContext(Dispatchers.Main) {
                        progressbar.visibility = View.INVISIBLE


                    }
                }


            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    Toast.makeText(
                        applicationContext, "Something went wrong with internet connection",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
        }
    }





}
