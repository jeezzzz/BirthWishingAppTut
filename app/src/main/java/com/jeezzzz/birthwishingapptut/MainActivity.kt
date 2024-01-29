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

        val editText = findViewById<EditText>(R.id.etName)
        val button = findViewById<Button>(R.id.btnWish)

        button.setOnClickListener {
            val name: String = editText.text.toString()
            val intent = Intent(this, WishingScreen::class.java)
            intent.putExtra("Name", name)
            startActivity(intent)
        }
    }
}
