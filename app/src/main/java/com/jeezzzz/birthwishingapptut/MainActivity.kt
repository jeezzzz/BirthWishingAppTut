package com.jeezzzz.birthwishingapptut

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etName=findViewById<EditText>(R.id.etName)
        var btnWish=findViewById<Button>(R.id.btnWish)
        var text=etName.text.toString()

        btnWish.setOnClickListener {
            val intent= Intent(this,WishingScreen::class.java)
            intent.putExtra("name",text)
            startActivity(intent)
        }


    }
}