package com.example.todolist

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetalhesTarefa : AppCompatActivity()
{

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_tarefa)

        val titulo = intent.getStringExtra("tarefa_titulo")
        val descricao = intent.getStringExtra("tarefa_descricao")
        val prioridade = intent.getStringExtra("tarefa_prioridade")
        val data = intent.getStringExtra("tarefa_data")

        val tituloView = findViewById<TextView>(R.id.textTituloDetalhe)
        val descricaoView = findViewById<TextView>(R.id.textDescricaoDetalhe)
        val prioridadeView = findViewById<TextView>(R.id.textPrioridadeDetalhe)
        val dataView = findViewById<TextView>(R.id.textDataDetalhe)

        tituloView.text = titulo
        descricaoView.text = descricao
        prioridadeView.text = "Prioridade: $prioridade"
        dataView.text = "Data: $data"

    }
}