package com.example.todolist

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        val botaoFazerCadastro = findViewById<AppCompatButton>(R.id.botaoTelaCadastro)
        val botaoFazerLogin = findViewById<AppCompatButton>(R.id.botaoLogin)

        botaoFazerCadastro.setOnClickListener {
            irTelaCadastro()
        }

        botaoFazerLogin.setOnClickListener {
            irTelaPrincipal()
        }


    }

    private fun irTelaCadastro()
    {
        val intent = Intent(this, Cadastro::class.java)
        startActivity(intent)
    }

    private fun irTelaPrincipal()
    {
        val intent = Intent(this, HomeTarefas::class.java)
        startActivity(intent)

    }

}