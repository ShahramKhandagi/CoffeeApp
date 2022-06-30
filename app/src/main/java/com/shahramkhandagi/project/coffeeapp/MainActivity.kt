package com.shahramkhandagi.project.coffeeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

import com.google.android.material.bottomnavigation.BottomNavigationView
import com.shahramkhandagi.project.coffeeapp.fragmentview.CartFragment
import com.shahramkhandagi.project.coffeeapp.fragmentview.FavoriteFragment

import com.shahramkhandagi.project.coffeeapp.fragmentview.HomeFragment
import com.shahramkhandagi.project.coffeeapp.fragmentview.ProfileFragment


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNav.setOnNavigationItemSelectedListener(navListener)

        //I added this if statement to keep the selected fragment when rotating the device

        //I added this if statement to keep the selected fragment when rotating the device
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(
                R.id.fragment_container,
                HomeFragment()
            ).commit()
        }

    }

    private val navListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            var selectedFragment: Fragment? = null
            when (item.itemId) {
                R.id.homeFragment -> selectedFragment = HomeFragment()
                R.id.favoriteFragment -> selectedFragment = FavoriteFragment()
                R.id.cartFragment -> selectedFragment = CartFragment()
                R.id.profileFragment -> selectedFragment = ProfileFragment()
            }
            supportFragmentManager.beginTransaction().replace(
                R.id.fragment_container,
                selectedFragment!!
            ).commit()
            true
        }
}