package com.example.myapplication

class Planeta(var nombre: String, var tipo: String, var masa: Double) {

    fun obtenerInformacion(): String {
        return "Planeta: $nombre, Tipo: $tipo, Masa: $masa kg"
    }

    fun aumentarMasa( masaAumento :Double){

        masa+=masaAumento
    }
    fun cabiarTipo ( nuevoTipo :String){
        tipo=nuevoTipo
    }
}