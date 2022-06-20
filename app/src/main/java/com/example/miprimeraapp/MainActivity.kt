package com.example.miprimeraapp

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_MESSAGE = "com.example.miprimeraapp.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    /**Called then the user taps the send button */
    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)

    }
}