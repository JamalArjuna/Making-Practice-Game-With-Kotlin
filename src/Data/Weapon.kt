package Data

class Weapon{
    var attackPower = 0.0
    var name = String()
    constructor(AttackPower : Double, armorName : String) {
        this.attackPower = AttackPower
        this.name = armorName
    }

    fun Display(){
        println("Senjata Yang Digunakan Adalah: ${this.name}")
    }
}
