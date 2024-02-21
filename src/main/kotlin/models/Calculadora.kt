package models

class Calculadora(private var resUs: String, private var operand1: Int, private var operand2: Int) {

    fun realizarOperacion(): Int {
        return when (resUs[0]) {
            '+' -> operand1 + operand2
            '-' -> operand1 - operand2
            '*' -> operand1 * operand2
            '/' -> operand1 / operand2
            else -> throw OperacionInvalidaException()
        }
    }
}

