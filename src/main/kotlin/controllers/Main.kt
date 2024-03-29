package org.example.controllers
import models.DividirDosNumsInt


import models.Calculadora
import models.Figura
import models.OperacionInvalidaException
import java.util.Scanner


fun main() {
    val scanner = Scanner(System.`in`)
    var continuar = true

    //Exercici1:
    val dividir2 = DividirDosNumsInt(0,0)
    val resultat = dividir2.dividirDosInt()

    println("El resultat de dividir 2 numeros enters és: $resultat")
    println("El programa segueix per aquí")

    //Exercci2:
    while (continuar) {
        try {
            println("Introduzca la operación (+, -, *, /) o 'Z' para salir: ")
            val resUs = scanner.next().uppercase()

            if (resUs.length != 1 || !"+-*/Z".contains(resUs[0])) {
                throw OperacionInvalidaException()
            }

            if (resUs[0] == 'Z') {
                continuar = false
            } else {
                println("Ahora introduce los números:")
                val operand1 = scanner.nextInt()
                val operand2 = scanner.nextInt()

                val calculator = Calculadora(resUs[0].toString(), operand1, operand2)
                val result = calculator.realizarOperacion()
                println("El resultado es: $result")
            }
        } catch (e: OperacionInvalidaException) {
            println("Operación inválida. Por favor, intente de nuevo.")
        } catch (e: Exception) {
            println("Error inesperado. Por favor, intente de nuevo.")
        }
    }
//Exercici 3
    try {
        val triangle = Figura(3, 5, 7, 10)
        println("Perímetre del triangle: ${triangle.perimetre()}")

        val quadrat = Figura(4, 4, 4, 4, 4) // Això és correcte
        println("Perímetre del quadrat: ${quadrat.perimetre()}")

        // Aquesta línia llençarà una excepció ja que el nombre de costats és inferior a 3
    } catch (ex: IllegalArgumentException) {
        println("Error: ${ex.message}")
    }
}
