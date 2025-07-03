package com.example.todolist

import android.app.DatePickerDialog
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import java.util.Calendar

class CriarTarefa : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_criar_tarefa)

        val editTextData = findViewById<TextInputEditText>(R.id.editTextData)

        editTextData.setOnClickListener {
            val calendario = Calendar.getInstance()
            val ano = calendario.get(Calendar.YEAR)
            val mes = calendario.get(Calendar.MONTH)
            val dia = calendario.get(Calendar.DAY_OF_MONTH)

            val datePicker = DatePickerDialog(this, { _, year, month, dayOfMonth ->
                val dataFormatada = String.format("%02d/%02d/%d", dayOfMonth, month + 1, year)
                editTextData.setText(dataFormatada)
            }, ano, mes, dia)

            datePicker.show()
        }
    }
}