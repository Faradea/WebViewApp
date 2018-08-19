package com.macgavrina.push

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.gms.common.GoogleApiAvailability
import com.google.firebase.iid.FirebaseInstanceId

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MyApp", "MainActivity: onCreate")
        Log.d("MyApp", "token = ${FirebaseInstanceId.getInstance().token}")
        Log.d("MyApp", "id = ${FirebaseInstanceId.getInstance().id}")
    }
}
