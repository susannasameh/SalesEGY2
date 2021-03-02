package com.example.salesegy.model

import android.provider.ContactsContract
import com.google.gson.annotations.SerializedName

data class AllData (
    @SerializedName("data")

    var `data`: ContactsContract.Data
)

