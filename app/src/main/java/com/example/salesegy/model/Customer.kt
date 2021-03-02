package com.example.salesegy.model

import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "customer_table")
class Customer (
    @NonNull
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo( name="customer_id")
    @SerializedName("customer_id")
    var customerId: String  ="",

    @NonNull
    @ColumnInfo( name="customer_name")
    @SerializedName("customer_name")
    var customerName: String ="",

    @Nullable
    @ColumnInfo( name="customer_name_ar")
    @SerializedName("customer_name_ar")
    var customerNameAr: String  ="",

    @Nullable
    @ColumnInfo( name="customer_location")
    @SerializedName("customer_location")
    var customerLocation: String ="",

    @Nullable
    @ColumnInfo( name="customer_credit_limit")
    @SerializedName("customer_credit_limit")
    var customerCreditLimit: String  ="",

    @Nullable
    @ColumnInfo( name="customer_credit_type")
    @SerializedName("customer_credit_type")
    var customerCreditType: String  ="",


    @Nullable
    @ColumnInfo( name="customer_credit_days")
    @SerializedName("customer_credit_days")
    var customerCreditDays: String  ="",

    @Nullable
    @ColumnInfo( name="customer_address")
    @SerializedName("customer_address")
    var customerAddress: String  ="",

    @Nullable
    @ColumnInfo( name="customer_country")
    @SerializedName("customer_country")
    var customerCountry: String ="",

    @Nullable
    @ColumnInfo( name="customer_city")
    @SerializedName("customer_city")
    var customerCity: String ="",

@Nullable
@ColumnInfo( name="customer_zone")
@SerializedName("customer_zone")
var customerZone: String ="",

@Nullable
@ColumnInfo( name="customer_contact_name")
@SerializedName("customer_contact_name")
var customerContactName: String ="",

@Nullable
@ColumnInfo( name="customer_phone")
@SerializedName("customer_phone")
var customerPhone: String ="",

@Nullable
@ColumnInfo( name="customer_cellphone")
@SerializedName("customer_cellphone")
var customerCellphone: String ="",
    @Nullable
    @ColumnInfo( name="customer_contact_phone")
    @SerializedName("customer_contact_phone")
    var customerContactPhone: String ="",
    @Nullable
    @ColumnInfo( name="customer_contact_cellphone")
    @SerializedName("customer_contact_cellphone")
    var customerContactCellphone: String ="",
    @Nullable
    @ColumnInfo( name="customer_contact_email")
    @SerializedName("customer_contact_email")
    var customerContactEmail: String ="",
    @Nullable
    @ColumnInfo( name="sync_status")
    @SerializedName("sync_status")
    var syncStatus: String ="",
    @Nullable
    @ColumnInfo( name="rep_customer_id")
    @SerializedName("rep_customer_id")
    var repCustomerId: String =""

)
{
    constructor() : this("",
        "","","","",""
        ,"" ,"" , "","" ,"",""
    ,"","","","","","","")

}

