package com.example.salesegy.model

import com.google.gson.annotations.SerializedName

data class Data (
    @SerializedName("Users")
    var users: List<User>
        )