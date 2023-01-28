package com.example.logintask


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.logintask.dbhelper.DBHelper


class MainActivity : AppCompatActivity() {

//    private lateinit var email : EditText
//    private lateinit var password : EditText
//    private lateinit var loginbtn: Button
//    lateinit var dbHelper: DBHelper
//
//    lateinit var signUpBtn : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        email = findViewById(R.id.loginemail)
//        password = findViewById(R.id.loginpassword)




//        val helper = DBHelper(applicationContext)
//        val db = helper.readableDatabase
//        val result = db.rawQuery("SELECT * FROM USERS WHERE EMAIL = ''", null)
//
//        if (result.moveToNext())
//            Toast.makeText(applicationContext,result.getString(1),Toast.LENGTH_LONG).show()

//        loginbtn.setOnClickListener{
//            val isExist: Boolean = helper.checkUserExist(
//                email.getText().toString(),
//                password.getText().toString()
//            )
//            if (isExist) {
//                val intent = Intent(this@MainActivity, HomeActivity::class.java)
//                intent.putExtra("username", email.getText().toString())
//                startActivity(intent)
//            } else {
//                password.setText(null)
//                Toast.makeText(this@MainActivity, "Login failed. Invalid username or password.", Toast.LENGTH_SHORT).show()
//            }
//        }
    }

    fun openRegister(view: View) {
        val intent = Intent(this@MainActivity,RegisterActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun gotoHome(view: View) {
        val intent = Intent(this@MainActivity,HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
}