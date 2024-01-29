package com.jeezzzz.birthwishingapptut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class WishingScreen : AppCompatActivity() {
    private lateinit var greet: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wishing_screen)

        val get_name = intent.getStringExtra("Name")
        greet = findViewById<TextView>(R.id.txtWish)
        greet.text = get_name
    }
}
