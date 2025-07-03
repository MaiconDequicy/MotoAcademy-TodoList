package com.example.todolist

import android.content.Intent
import android.os.Bundle
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val handler = android.os.Handler(Looper.getMainLooper())

        handler.postDelayed(
            {
                irTelaLogin()
            }, 2000
        )
    }

    private fun irTelaLogin()
    {
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
        finish()
    }
}