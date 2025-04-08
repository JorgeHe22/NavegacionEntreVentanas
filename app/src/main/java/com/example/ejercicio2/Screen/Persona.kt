package com.example.ejercicio2.Screen

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

data class Persona(
    val nombre: String,
    val correo: String,
    val profesion: String
)


class PersonasViewModel : ViewModel() {

    private val _personas = mutableStateListOf<Persona>()

    // Lista pública accesible pero inmutable
    val personas: List<Persona> = _personas

    // Función para agregar una nueva persona a la lista
    fun agregarPersona(nombre: String, correo: String, profesion: String) {
        val nuevaPersona = Persona(nombre, correo, profesion)
        _personas.add(nuevaPersona)
    }
}