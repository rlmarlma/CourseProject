package com.example.courseproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null){
            addRecipiesFragment()
        }
    }

    private fun addRecipiesFragment(){
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer, RecipiesFragment())
            .commit()
    }
}