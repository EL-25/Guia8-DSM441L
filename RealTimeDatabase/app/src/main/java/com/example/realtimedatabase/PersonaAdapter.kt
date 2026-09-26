package com.example.realtimedatabase

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.realtimedatabase.datos.Persona

class PersonaAdapter(private val context: Activity, var personas: List<Persona>) :
    ArrayAdapter<Persona>(context, R.layout.persona_layout, personas) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater = context.layoutInflater
        val rowView: View = convertView ?: layoutInflater.inflate(R.layout.persona_layout, parent, false)

        val tvNombre = rowView.findViewById<TextView>(R.id.tvNombre)
        val tvDUI = rowView.findViewById<TextView>(R.id.tvDUI)
        val tvFechaNacimiento = rowView.findViewById<TextView>(R.id.tvFechaNacimiento)
        val tvGenero = rowView.findViewById<TextView>(R.id.tvGenero)
        val tvPesoAltura = rowView.findViewById<TextView>(R.id.tvPesoAltura)

        val persona = personas[position]

        tvNombre.text = "Nombre: ${persona.nombre ?: ""}"
        tvDUI.text = "DUI: ${persona.dui ?: ""}"
        tvFechaNacimiento.text = "Fecha Nacimiento: ${persona.fechaNacimiento ?: ""}"
        tvGenero.text = "Género: ${persona.genero ?: ""}"
        tvPesoAltura.text = "Peso: ${persona.peso ?: ""} | Altura: ${persona.altura ?: ""}"

        return rowView
    }
}
