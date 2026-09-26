package com.example.realtimedatabase.datos

data class Persona(
    var dui: String? = null,
    var nombre: String? = null,
    var fechaNacimiento: String? = null,
    var genero: String? = null,
    var peso: String? = null,
    var altura: String? = null,
    var key: String? = null,
    var per: MutableMap<String, Boolean> = mutableMapOf()
) {
    fun toMap(): Map<String, Any?> {
        return mapOf(
            "dui" to dui,
            "nombre" to nombre,
            "fechaNacimiento" to fechaNacimiento,
            "genero" to genero,
            "peso" to peso,
            "altura" to altura,
            "per" to per
        )
    }
}
