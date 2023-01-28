package com.example.logintask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AlertDialog
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.logintask.adapter.RCAdapter
import com.example.logintask.model.UserDataModel
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView
import com.google.android.material.snackbar.Snackbar

class HomeActivity : AppCompatActivity() {

    lateinit var toggle : ActionBarDrawerToggle


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val drawerLayout : DrawerLayout = findViewById(R.id.drawer)
        val navView : NavigationView = findViewById(R.id.nav_view)


        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.drawname -> Toast.makeText(applicationContext,"Clicked menu Name", Toast.LENGTH_LONG).show()
                else -> Toast.makeText(applicationContext,"Clicked Something", Toast.LENGTH_LONG).show()
            }
            true
        }


        val btnFab : FloatingActionButton = findViewById(R.id.fab)

        btnFab.setOnClickListener{
            Snackbar.make(drawerLayout,"Add Data..",Snackbar.LENGTH_SHORT).show()

            val inflater = layoutInflater
            val inflate_view = inflater.inflate(R.layout.dialog_box,null)

//            val userName = inflate_view.findViewById<EditText>(R.id.diaName) as EditText
//            val userAge = inflate_view.findViewById<EditText>(R.id.diaAge) as EditText
//            val userAddress = inflate_view.findViewById<EditText>(R.id.diaAddress) as EditText
//
//            val savebtn = inflate_view.findViewById<Button>(R.id.btnSave) as Button
            val exitbtn = inflate_view.findViewById<Button>(R.id.btnExit) as Button

            val alertDialog = AlertDialog.Builder(this)
            alertDialog.setView(inflate_view)
            alertDialog.setCancelable(true)
            val dialog = alertDialog.create()
            dialog.show()


            exitbtn.setOnClickListener{

                Snackbar.make(drawerLayout,"Dismiss",Snackbar.LENGTH_SHORT).show()
                dialog.dismiss();
            }
        }







//        val user_data = mutableListOf<UserDataModel>()
//        user_data.add(UserDataModel("Sagar",22,"Nagpur"))

        val recyclerview = findViewById<RecyclerView>(R.id.rc_view)

        recyclerview.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<UserDataModel>()

        for (i in 1..20) {
            data.add(UserDataModel("Sagar",22,"Nagpur"))
        }

        val adapter = RCAdapter(data)

        recyclerview.adapter = adapter

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)

    }
}