package com.example.todolist

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HomeTarefas : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: TarefaAdapter
    private val listaTarefas = mutableListOf<Tarefa>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_tarefas)

        val botaoFABTask = findViewById<FloatingActionButton>(R.id.fabAddTarefa)

        botaoFABTask.setOnClickListener(
            {
                CriarTarefa()
            })


        recyclerView = findViewById(R.id.recyclerTasks)
        adapter = TarefaAdapter(listaTarefas) { tarefaClicada ->
            val intent = Intent(this, DetalhesTarefa::class.java)
            intent.putExtra("tarefa_titulo", tarefaClicada.titulo)
            intent.putExtra("tarefa_descricao", tarefaClicada.descricao)
            intent.putExtra("tarefa_prioridade", tarefaClicada.prioridade)
            intent.putExtra("tarefa_data", tarefaClicada.data)
            startActivity(intent)
        }

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        adicionarTarefasFake()
    }

    private fun CriarTarefa()
    {
        val intent = Intent(this, CriarTarefa::class.java)
        startActivity(intent)
    }

    private fun adicionarTarefasFake() {
        listaTarefas.add(Tarefa("Estudar Android", "Ver RecyclerView e Room", "Alta", "20/02/2025"))
        listaTarefas.add(Tarefa("Comemorar o Festival!!!", "Garantidoooooo!", "Alta", "30/06/2025"))
        listaTarefas.add(Tarefa("Comprar café", "Ficar sem café = caos", "Média", "20/04/2025"))
        listaTarefas.add(Tarefa("Lavar roupa", "Camisas do Garantido", "Baixa", "20/05/2025"))
        adapter.notifyDataSetChanged()
    }
}