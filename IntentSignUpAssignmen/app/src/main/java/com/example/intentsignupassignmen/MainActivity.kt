package com.example.intentsignupassignmen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import de.hdodenhof.circleimageview.CircleImageView

class MainActivity : AppCompatActivity() {
    private lateinit var personCIV: CircleImageView
    private lateinit var username: EditText
    private lateinit var name: EditText
    private lateinit var age: EditText
    private lateinit var email: EditText
    private lateinit var pass: EditText
    private lateinit var address: EditText
    private lateinit var RegBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        personCIV = findViewById(R.id.personCIV)

        username = findViewById(R.id.username)
        name = findViewById(R.id.name)
        age = findViewById(R.id.age)
        email = findViewById(R.id.email)
        pass = findViewById(R.id.pass)
        address = findViewById(R.id.address)
        RegBtn = findViewById(R.id.RegBtn)









        RegBtn.setOnClickListener() {
            var userName=username.text.toString()
            var Name=name.text.toString()
            var Age=age.text.toString()
            var Email=email.text.toString()
            var Pass=pass.text.toString()
            var Adress=address.text.toString()


            var intent = Intent(this@MainActivity, HomeActivity::class.java)

            // Put the URI as an extra
            intent.putExtra("username",userName)
            intent.putExtra("name",Name)
            intent.putExtra("age",Age)
            intent.putExtra("email",Email)
            intent.putExtra("pass",Pass)
            intent.putExtra("address",Adress)
            startActivity(intent)
        }

    }
}