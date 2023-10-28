package com.example.medium_challenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import com.example.medium_challenge.Fragments.CartFragment
import com.example.medium_challenge.Fragments.HomeFragment
import com.example.medium_challenge.Fragments.ProfileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
lateinit var navBar:BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
switcScreen(1)
        navBar=findViewById(R.id.bottom_navigation)
        navBar.setOnItemSelectedListener { 
            when(it.itemId){
                R.id.home ->{
                    switcScreen(1)
                    return@setOnItemSelectedListener true
                }
                R.id.cart ->{
                    switcScreen(2)
                    return@setOnItemSelectedListener true
                }
                R.id.profile ->{
                    switcScreen(3)
                    return@setOnItemSelectedListener true
                }
                else ->return@setOnItemSelectedListener false
            }
        }



    }

    private fun switcScreen(screen: Int) {
        val transaction = supportFragmentManager.beginTransaction()
        when(screen){
            1 ->  {transaction.replace(R.id.frame, HomeFragment())

            }
            2 ->  {transaction.replace(R.id.frame,CartFragment())

            }
            3 ->  {transaction.replace(R.id.frame,ProfileFragment())

            }
        }
        transaction.commit()
    }
}