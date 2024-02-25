package models

class Figura (numCostats: Int, vararg costats: Int) {
    val numCostats: Int = if (numCostats >= 3 && numCostats == costats.size) numCostats
    else throw IllegalArgumentException("Nombre de costats incorrecte")

    val costats: IntArray = costats

    fun perimetre(): Int {
        return costats.sum()
    }
}