package org.example.controllers

import models.DividirDosNumsInt

fun main() {

    fun main(){
        val dividir2 = DividirDosNumsInt(0,0)
        dividir2.dividirDosInt()
        try {
            println("${dividir2}")
        } catch (e: ArrayIndexOutOfBoundsException) {
            println(e.message)
            e.printStackTrace()
        }
        println("El programa segueix per aquí")
    }

}