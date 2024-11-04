import Data.*

class Player{
var name = String()
var health: Double = 0.0

lateinit var weapon : Weapon
lateinit var armor: Armor

    constructor(BaseName : String, BaseHealth : Double) {
        this.name = BaseName
        this.health = BaseHealth
    }

    fun EquipWeapon(weapon: Weapon){
        this.weapon = weapon
    }

    fun EquipArmor(armor: Armor){
        this.armor = armor
    }

    fun Display(){
        println("Nama: ${this.name}")
        println("Health: ${this.health}")
        println(this.armor.Display())
        println(this.weapon.Display())
    }

    fun DisplayBattlefield(){
        println("Name: ${this.name}")
        println("Health: ${this.health}")
    }

    fun Attacking(Opponent: Player){
        if (weapon.attackPower > Opponent.armor.defensePower){
            var Damage = weapon.attackPower - Opponent.armor.defensePower

            Opponent.health = Opponent.health - Damage
            println("${Opponent.name} gots damage $Damage")
        } else {
            return
        }
    }
}
fun main() {
    println("=========== STATISTIK PLAYER ===========")

    var player1 = Player("Alexander", 100.0)
    var sword = Weapon(15.0, "Iron Sword")
    var ironArmor = Armor(7.0, "Iron Armor")
    player1.EquipWeapon(sword)
    player1.EquipArmor(ironArmor)
    player1.Display()
    println("\n")
    var player2 = Player("Reyes", 100.0)
    var Bow = Weapon(12.5, "Wooden Bow")
    var leatherArmor = Armor(4.5, "Leather Armor")
    player2.EquipWeapon(Bow)
    player2.EquipArmor(leatherArmor)
    player2.Display()
    println("\n")

    var battleField = true
    println("=========== BATTLEFIELD ===========")
    while (battleField) {
        player1.Attacking(player2)
        player2.DisplayBattlefield()
        println("\n")

        player2.Attacking(player1)
        player1.DisplayBattlefield()
        println("\n")

        if (player1.health < 0 || player2.health < 0){
            battleField = false
            if (player1.health < 0){
                println("${player1.name} Telah Dikalahkan!!")
            }else if (player2.health < 0){
                println("${player2.name} Telah Dikalahkan!!")
            }
        }
    }
}