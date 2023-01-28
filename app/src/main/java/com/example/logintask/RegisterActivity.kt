package com.example.logintask

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.logintask.databinding.ActivityHomeBinding
import com.example.logintask.dbhelper.DBHelper
import com.example.logintask.dbhelper.DBHelper.Companion.ADDRESS
import com.example.logintask.dbhelper.DBHelper.Companion.CITY
import com.example.logintask.dbhelper.DBHelper.Companion.EMAIL
import com.example.logintask.dbhelper.DBHelper.Companion.NAME
import com.example.logintask.dbhelper.DBHelper.Companion.PASSWORD
import com.example.logintask.dbhelper.DBHelper.Companion.TABLE_NAME
import com.example.logintask.model.UserModel

class RegisterActivity : AppCompatActivity() {

//    lateinit var name : EditText
//    lateinit var email : EditText
//    lateinit var city : EditText
//    lateinit var address : EditText
//    lateinit var password : EditText
//    lateinit var regbtn: Button
//    lateinit var dbHelper: DBHelper
//
//    lateinit var signInBtn : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registeration)

//        name = findViewById(R.id.regname) as EditText
//        email = findViewById(R.id.regemail) as EditText
//        city = findViewById(R.id.regcity) as EditText
//        address = findViewById(R.id.regaddress) as EditText
//        password = findViewById(R.id.regpassword) as EditText

//        regbtn = findViewById(R.id.register) as Button
//
//        regbtn.setOnClickListener {
//            val values = ContentValues()
//            values.put(NAME, name.text.toString().trim())
//            values.put(EMAIL, email.text.toString().trim())
//            values.put(CITY, city.text.toString().trim())
//            values.put(ADDRESS, address.text.toString().trim())
//            values.put(PASSWORD, password.text.toString().trim())
//            val db = dbHelper.writableDatabase
//            db.insert(TABLE_NAME, null, values)
//            db.close()
//            clear all edit texts
//            email.setText("")
//            name.setText("")
//            password.setText("")
//            address.setText("")
//            city.setText("")
//            name.requestFocus()
//            Toast.makeText(this,  "Registered Successfully", Toast.LENGTH_LONG).show()
//        }

//        regbtn.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(view: View?) {
//                var result:Boolean = dbHelper.insertUser(
//                    UserModel(
//                        name = name.text.toString().trim(),
//                        email = email.text.toString().trim(),
//                        city = city.text.toString().trim(),
//                        address = address.text.toString().trim(),
//                        password = password.text.toString().trim())
//                )
//                when{
//                    result -> Toast.makeText(applicationContext,"Success...",Toast.LENGTH_LONG).show()
//                    else -> Toast.makeText(applicationContext,"Failed...",Toast.LENGTH_LONG).show()
//                }
//
//                dbHelper.insertUser(name,email)
//
//            }
//        })
    }


//    fun addUser(){
//        if (dbHelper.checkUser(email.text.toString().trim())) {
//            var result = dbHelper.insertUser(
//                UserModel(
//                    name = name.text.toString().trim(),
//                    email = email.text.toString().trim(),
//                    city = city.text.toString().trim(),
//                    address = address.text.toString().trim(),
//                    password = password.text.toString().trim())
//            )
//
//            //clear all edittext s
//            this.email.setText("")
//            this.name.setText("")
//            this.password.setText("")
//            this.address.setText("")
//            this.city.setText("")
//            Toast.makeText(this,  "Registered Successfully", Toast.LENGTH_LONG).show()
//        }else {
//            Toast.makeText(this,  "Registration Fail", Toast.LENGTH_LONG).show()
//        }
//
//    }

    fun openLogin(view: View) {
        val intent = Intent(this@RegisterActivity,MainActivity::class.java)
        startActivity(intent)
        finish()
    }

}