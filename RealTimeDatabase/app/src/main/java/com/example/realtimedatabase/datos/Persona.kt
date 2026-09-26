package com.example.realtimedatabase.datos

data class Persona(
    var dui: String? = null,
    var nombre: String? = null,
    var key: String? = null, // Usado como clave generada por Firebase
    var per: MutableMap<String, Boolean> = mutableMapOf()
) {
    fun toMap(): Map<String, Any?> {
        return mapOf(
            "dui" to dui,
            "nombre" to nombre,
            "per" to per
        )
    }
}
