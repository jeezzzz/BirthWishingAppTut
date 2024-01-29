package com.jeezzzz.birthwishingapptut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class WishingScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wishing_screen)

        var txtWish=findViewById<TextView>(R.id.txtWish)
        var text=intent.getStringExtra("name").toString()
        txtWish.text=text
    }
}