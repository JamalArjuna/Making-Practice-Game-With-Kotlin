package Data

class Armor{
    var defensePower = 0.0
    var name = String()
    constructor(DefensePower : Double, armorName: String) {
        this.defensePower = DefensePower
        this.name = armorName
    }
    fun Display(){
        println("Senjata Yang Digunakan Adalah: ${this.name}")
    }
}