package com.example.intentsignupassignmen

import android.annotation.SuppressLint
import android.media.tv.TvView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var resPersonCIV=findViewById<CircleImageView>(R.id.resPersonCIV)
        var resUsername=findViewById<TextView>(R.id.resUsername)
        var resName=findViewById<TextView>(R.id.resName)
        var resAge=findViewById<TextView>(R.id.resAge)
        var resEmail=findViewById<TextView>(R.id.resEmail)
        var resPass=findViewById<TextView>(R.id.resPass)
        var resAddress=findViewById<TextView>(R.id.resAddress)



        var recUserName=intent.getStringExtra("username")
        var recName=intent.getStringExtra("name")
        var recAge=intent.getStringExtra("age")
        var recEmail=intent.getStringExtra("email")
        var recPass=intent.getStringExtra("pass")
        var recAddress=intent.getStringExtra("address")


        resUsername.text=recUserName.toString()
        resName.text=recName.toString()
        resAge.text=recAge.toString()
        resEmail.text=recEmail.toString()
        resPass.text=recPass.toString()
        resAddress.text=recAddress.toString()


    }
}