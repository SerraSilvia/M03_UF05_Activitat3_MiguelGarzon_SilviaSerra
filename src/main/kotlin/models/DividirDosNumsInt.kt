package models
import java.util.Scanner

class DividirDosNumsInt {
    private var num:Int =0
    private var num2:Int =0
    private val scan = Scanner(System.`in`)

    constructor(num:Int, num2:Int){
        this.num=num
        this.num2=num2
    }
    fun getNum1(): Int {
        return num
    }

    fun getNum2(): Int {
        return num2
    }
    fun dividirDosInt():Int{
        println("Introdueix el número a dividir")
        num = Integer.parseInt(scan.next())

        println("Introdueix el dividend")
        num2 = Integer.parseInt(scan.next())

        return num/num2
    }
}