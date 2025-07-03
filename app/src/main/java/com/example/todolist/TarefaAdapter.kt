package com.example.todolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TarefaAdapter(
    private val lista: List<Tarefa>,
    private val onItemClick: (Tarefa) -> Unit
) : RecyclerView.Adapter<TarefaAdapter.TarefaViewHolder>() {

    class TarefaViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titulo = view.findViewById<TextView>(R.id.textTitulo)
        val descricao = view.findViewById<TextView>(R.id.textDescricao)
        val prioridade = view.findViewById<TextView>(R.id.textPrioridade)
        val data = view.findViewById<TextView>(R.id.textData)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_tarefa, parent, false)
        return TarefaViewHolder(view)
    }

    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {
        val tarefa = lista[position]
        holder.titulo.text = tarefa.titulo
        holder.descricao.text = tarefa.descricao
        holder.prioridade.text = "Prioridade: ${tarefa.prioridade}"
        holder.data.text = "Data: ${tarefa.data}"

        holder.itemView.setOnClickListener {
            onItemClick(tarefa)
        }
    }

    override fun getItemCount(): Int = lista.size
}
