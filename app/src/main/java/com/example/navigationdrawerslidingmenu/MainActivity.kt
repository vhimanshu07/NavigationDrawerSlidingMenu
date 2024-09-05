package com.example.navigationdrawerslidingmenu

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    lateinit var toggle: ActionBarDrawerToggle
    lateinit var drawerLayout: DrawerLayout
    lateinit var navView: NavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /**
         *
         * 1. Create a new drawer layout in XML file
         *
         */
        /**
         *
         * 2. Create a navigation view (which is hamburger or sliding view)
         *
         */
        /**
         *
         * 3. Create a header layout and menu  for navigation view
         *
         */

        /**
         *
         * 4.  Need to create action button drawer , which will open the drawer.
         *
         */
        drawerLayout = findViewById(R.id.drawerLayout)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)

        /**
         *
         * 5. Now need to attach drawer layout to toggle
         *
         */
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        // for back arrow on hamburger
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        /**
         *
         * 6. setting up listener on nav view
         *
         */
        navView = findViewById(R.id.navView)
        navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.item1 -> {
                    Toast.makeText(this, "Item 1 clicked", Toast.LENGTH_LONG).show()
                }

                R.id.item2 -> {
                    Toast.makeText(this, "Item 2 clicked", Toast.LENGTH_LONG).show()
                }

                R.id.item3 -> {
                    Toast.makeText(this, "Item 3 clicked", Toast.LENGTH_LONG).show()
                }

            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}