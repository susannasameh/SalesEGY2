/*
package com.example.salesegy

import android.Manifest.permission
import android.annotation.TargetApi
import android.content.DialogInterface
import android.content.pm.PackageManager
import android.location.Geocoder
import android.location.Location
import android.net.ConnectivityManager
import android.os.Build
import android.os.Build.VERSION_CODES
import android.os.Build.VERSION_CODES.*
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import java.io.IOException
import java.util.*
import com.example.salesegy.NewCustomerActivity.ALL_PERMISSIONS_RESULT as ALL_PERMISSIONS_RESULT1

private val Int.id: Any
    get() {}

class NewCustomerActivity : AppCompatActivity() {

    private var permissionsToRequest: ArrayList<String>? = null
    private val permissionsRejected = ArrayList<String>()
    private val permissions = ArrayList<String>()
    private val ALLPERMISSIONSRESULT = 101


    var latitude: Double? = null
    var longitude:kotlin.Double? = null

    var latlng: String? = null// latitude, longitude,

    // latitude, longitude,
    var v_etCustName: String? = null
    var v_etCustNameAR: String? = null
    var v_etCustphon3: String? = null
    var v_etCustphon2: String? = null
    var v_etCustphon1: String? = null
    var v_etCustphon: String? = null
    var v_etCustLocation: String? = null
    var v_etCustDisc: String? = null
    var v_etCustCountry: String? = null
    var v_etCustContactWebsite: String? = null
    var v_etCustContactphone: String? = null
    var v_etCustContactemail: String? = null
    var v_etCustContact: String? = null
    var v_etCustCity: String? = null
    var v_etCustAddress: String? = null

    var etCustName: EditText? = null
    var etCustNameAR: EditText? = null
    var etCustphon3: EditText? = null
    var etCustphon2: EditText? = null
    var etCustphon1: EditText? = null
    var etCustphon: EditText? = null
    var etCustLocation: EditText? = null
    var etCustDisc: EditText? = null
    var etCustCountry: EditText? = null
    var etCustContactWebsite: EditText? = null
    var etCustContactphone: EditText? = null
    var etCustContactemail: EditText? = null
    var etCustContact: EditText? = null
    var etCustCity: EditText? = null
    var etCustAddress: EditText? = null

    var newcuscategoury: TextView? = null
    var dataLayout: LinearLayout? = null
    var saveBTN: Button? = null
    var getLocationBTN: ImageButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_customer)

        etCustName = findViewById(R.id.etCustName)
        etCustNameAR = findViewById(R.id.etCustNameAR)

        etCustphon3 = findViewById(R.id.etCustphon3)
        etCustphon2 = findViewById(R.id.etCustphon2)
        etCustphon1 = findViewById(R.id.etCustphon1)
        //etCustphon = findViewById( R.id.etCustphon );
        //etCustphon = findViewById( R.id.etCustphon );
        etCustLocation = findViewById(R.id.etCustLocation)
        etCustDisc = findViewById(R.id.etCustDisc)
        etCustCountry = findViewById(R.id.etCustCountry)
        etCustContactWebsite = findViewById(R.id.etCustContactWebsite)
        etCustContactphone = findViewById(R.id.etCustContactphone)
        etCustContactemail = findViewById(R.id.etCustContactemail)
        etCustContact = findViewById(R.id.etCustContact)
        etCustCity = findViewById(R.id.etCustCity)
        etCustAddress = findViewById(R.id.etCustAddress)
        getLocationBTN = findViewById(R.id.btnGetCustomerLocation)

        dataLayout = findViewById(R.id.dataLayout)
        newcuscategoury = findViewById(R.id.newcuscategoury)
        //newcuscategoury.setText( R.string.customer_categoury_wholesale );


        //newcuscategoury.setText( R.string.customer_categoury_wholesale );
        this.etCustName.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            override fun afterTextChanged(editable: Editable) {
                etCustNameAR.setText(etCustName.getText())
                saveBTN!!.visibility = View.VISIBLE
            }
        })


        this.getLocationBTN.setOnClickListener(View.OnClickListener {
            ActivityCompat.shouldShowRequestPermissionRationale(
                this@NewCustomerActivity,
                permission.ACCESS_FINE_LOCATION
            )
            latlng = getCustomerlocation()
            // location1 = new String(String.format("%.6f", latitude)) +" , "+new String(String.format("%.6f", longitude)); //String.format("%.2f", loc.getLatitude());
            this.etCustLocation.setText(latlng)
            val gCoder = Geocoder(applicationContext)
            //ArrayList<Address> addresses = null;
            var addresses: List<*>? = null
            try {
                addresses = longitude?.let { it1 -> gCoder.getFromLocation(latitude!!, it1, 1) }
            } catch (e: IOException) {
                Log.e("Nabil", e.message.toString())
                e.printStackTrace()
            }
            */
/*
                    if (addresses != null && addresses.size() > 0) {
                        etCustAddress.setText( addresses.toString() );
                        //Message1.message1 (getApplicationContext(), "country: " + addresses.get(0).toString());
                    }

                     *//*

        })

        saveBTN = findViewById(R.id.btnSaveCust)

        */
/* saveBTN.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveNewCustomer();
            }
        } );
        if (isOnline()) {
            Intent intent = new Intent(this, SyncDataFromMySQL.class);
            startActivity(intent);

            Intent intent1 = new Intent(this, SyncDataToMySQL.class);
            startActivity(intent1);

            Intent intent2 = new Intent(this, SyncSalesToMySQL.class);
            startActivity(intent2);
        }
    }*//*


        */
/* public void onNewCust(View view){
        clearFields();
        dataLayout.setVisibility( View.VISIBLE );
        //saveBTN.setVisibility( View.VISIBLE );
    }

    public void saveNewCustomer() {


        HashMap<String, String> queryValues = new HashMap<>();

        queryValues.put( "etCustName", etCustName.getText().toString() );
        queryValues.put( "etCustNameAR", etCustNameAR.getText().toString() );
      //  queryValues.put( "etCustphon3", controller.getLogedUser() );
        queryValues.put( "etCustphon2", etCustphon2.getText().toString() );
        queryValues.put( "etCustphon1", etCustphon1.getText().toString() );
        //queryValues.put( "etCustphon", etCustphon.getText().toString() );
        queryValues.put( "etCustLocation", etCustLocation.getText().toString() );
        queryValues.put( "etCustDisc", etCustDisc.getText().toString() );
        queryValues.put( "etCustCountry", etCustCountry.getText().toString() );
        queryValues.put( "etCustContactWebsite", etCustContactWebsite.getText().toString() );
        queryValues.put( "etCustContactphone", etCustContactphone.getText().toString() );
        queryValues.put( "etCustContactemail", etCustContactemail.getText().toString() );
        queryValues.put( "etCustContact", etCustContact.getText().toString() );
        queryValues.put( "etCustCity", etCustCity.getText().toString() );
        queryValues.put( "etCustAddress", etCustAddress.getText().toString() );
        queryValues.put( "etcustomer_categoury", "0" );

        //Log.e( "Lojy_CustomerCategoury_0", "--This is the Data-- " +customerID);




        long id;
        id = controller.insertNewCustomer( queryValues, this );
        if (id <= 0)
            Message1.message1( getApplicationContext(), String.valueOf( id ) + " -- Error while Creating Customer" );
        else {
            Message1.message1( getApplicationContext(), "Customer Created" );
            clearFields();
            saveBTN.setVisibility( View.GONE );
            dataLayout.setVisibility( View.GONE );
        }*//*

        */
/*
        ordNo = id;
        if (id <= 0) {
            Message1.message1( getApplicationContext(), "Error while Creating Invoice" );
        } else {
            //onOrder(null,ord_date, cust, visit, txt, sign,null,"order");
            for (int i = 0; i < ordData_prod_id.length; i++) {
                //Message1.message1( getApplicationContext(),String.valueOf( id )+"**"+ String.valueOf( i + 1 )+"**"+ ordData_prod_id[i]+"**"+ ordData_qty[i]+"**"+ ordData_price[i]+"**"+ ordData_disc[i] );
                if (ordData_prod_id[i] == null) {
                    break;
                }
                long id1 = helper.insertData_2( String.valueOf( id ), String.valueOf( i + 1 ), ordData_prod_id[i], ordData_qty[i], ordData_price[i], ordData_disc[i] );
                if (id1 <= 0) {
                    Message1.message1( getApplicationContext(), "Error While Inserting Line : " + i + "For Item : " + ordData_prod[i] );
                } else {
                    Message1.message1( getApplicationContext(), "Invoice Created" );
                    clearFields();
                    Intent intent = new Intent( this, SyncDataToMySQL.class );
                    startActivity( intent );
                }
            }
        }
        *//*

    }

    fun clearFields() {
        etCustName!!.setText("")
        etCustNameAR!!.setText("")
        etCustphon3!!.setText("")
        etCustphon2!!.setText("")
        etCustphon1!!.setText("")
        etCustLocation!!.setText("")
        etCustDisc!!.setText("")
        etCustCountry!!.setText("")
        etCustContactWebsite!!.setText("")
        etCustContactphone!!.setText("")
        etCustContactemail!!.setText("")
        etCustContact!!.setText("")
        etCustCity!!.setText("")
        etCustAddress!!.setText("")
    }

    @RequiresApi(M)
    fun getCustomerlocation(): String? {
        var location1: String? = null
        val location: Location? = null
        permissions.add(permission.ACCESS_FINE_LOCATION)
        permissions.add(permission.ACCESS_COARSE_LOCATION)
        permissionsToRequest = findUnAskedPermissions(permissions)
        if (Build.VERSION.SDK_INT >= M) {
            if (permissionsToRequest!!.size > 0) requestPermissions(
                permissionsToRequest!!.toTypedArray(),
                ALL_PERMISSIONS_RESULT1
            )
        }
        val locationTrack = LocationTrack(this)
        if (locationTrack.canGetLocation()) {
            longitude = locationTrack.getLongitude()
            latitude = locationTrack.getLatitude()
            location1 = String(String.format("%.6f", latitude)) + " , " + String(
                String.format(
                    "%.6f",
                    longitude
                )
            ) //String.format("%.2f", loc.getLatitude());
        } else {
            locationTrack.showSettingsAlert()
        }
        return location1
    }

    private fun findUnAskedPermissions(wanted: ArrayList<String>): ArrayList<String> {
        val result = ArrayList<String>()
        for (perm in wanted) {
            if (!hasPermission(perm)) {
                result.add(perm)
            }
        }
        return result
    }

    private fun hasPermission(permission: String): Boolean {
        if (canMakeSmores()) {
            if (Build.VERSION.SDK_INT >= M) {
                return checkSelfPermission(permission) == PackageManager.PERMISSION_GRANTED
            }
        }
        return true
    }

    private fun canMakeSmores(): Boolean {
        return Build.VERSION.SDK_INT > LOLLIPOP_MR1
    }

    @TargetApi(M)
    fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String?>?,
        grantResults: IntArray?
    ) {
        when (requestCode) {
            ALL_PERMISSIONS_RESULT1 -> {
                for (perms in permissionsToRequest!!) {
                    if (!hasPermission(perms)) {
                        permissionsRejected.add(perms)
                    }
                }
                if (permissionsRejected.size > 0) {
                    if (Build.VERSION.SDK_INT >= M) {
                        if (shouldShowRequestPermissionRationale(permissionsRejected[0])) {
                            showMessageOKCancel(
                                "These permissions are mandatory for the application. Please allow access."
                            ) { dialog, which ->
                                if (Build.VERSION.SDK_INT >= M) {
                                    requestPermissions(
                                        permissionsRejected.toTypedArray(),
                                        com.example.salesegy.NewCustomerActivity.ALL_PERMISSIONS_RESULT
                                    )
                                }
                            }
                            return
                        }
                    }
                }
            }
        }
    }

    object ALL_PERMISSIONS_RESULT {

    }

    private fun showMessageOKCancel(message: String, okListener: DialogInterface.OnClickListener) {
        AlertDialog.Builder(this)
            .setMessage(message)
            .setPositiveButton("OK", okListener)
            .setNegativeButton("Cancel", null)
            .create()
            .show()
    }
    public boolean isOnline()
    {
        val cm = getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager
        val netInfo = cm.activeNetworkInfo
        return netInfo != null && netInfo.isConnectedOrConnecting

    }}*/
