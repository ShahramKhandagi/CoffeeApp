package com.shahramkhandagi.project.coffeeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    lateinit var bottomNav: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNav = findViewById(R.id.nav_fragment)
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home_page -> {
                    Toast.makeText(this, "home", Toast.LENGTH_LONG).show()
                    true
                }
                R.id.favorite_page -> {
                    Toast.makeText(this, "favorite", Toast.LENGTH_LONG).show()
                    true
                }
                else -> false
            }
        
        }
    }
//    private fun loadFragment(fragment: Fragment){
//        val transaction = supportFragmentManager.beginTransaction()
//        transaction.replace(R.id.container,fragment)
//        transaction.addToBackStack(null)
//        transaction.commit()
//    }
}