package com.example.demoapp2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var buttonClickMe: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonClickMe= findViewById(R.id.buttonClickMe)
        buttonClickMe.setOnClickListener { buttonClickMe.text= "Clicked" }
        buttonClickMe.setOnLongClickListener {
            buttonClickMe.text= "Loooooooong Clicked"
            true
        }
    }
}
