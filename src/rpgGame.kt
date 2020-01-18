open class Character(name: String, hp: Int, offensivePower: Int){
    val name = name
    var hp = hp
    var offensivePower = offensivePower

    fun skill(): Map<String, Int> {
        return(mapOf("attack" to 30, "Enhance_power" to 20, "Deathblow" to 50, "defence" to 30))
    }

    fun infomation(): String{
        return("name: ${this.name}, hp: ${this.hp},offensivePower: ${this.offensivePower}")
    }

}



class Monster(name: String, hp: Int, offensivePower: Int): Character(name, hp, offensivePower) {

}

class Player(name: String, hp: Int, offensivePower: Int): Character(name, hp, offensivePower){


}



fun main(){
    println("バトルを始めます")
    println("-----------------------")
    var winner: String

    var player_1: Player = Player("剣者", 400, 50)
    var player_2: Player = Player("魔法者", 300, 40)
    var player_3: Player = Player("盾者", 350, 30)
    var player_4: Player = Player("素手者", 380, 60)

    var beast: Monster = Monster("ウルフ", 180, 80)
    var golem: Monster = Monster("ゴーレム", 400, 30)
    var humanoid: Monster = Monster("人型モンスター", 350, 50)
    var slime: Monster =  Monster("スライム", 100, 20)

    println(player_1.infomation())
    println(golem.infomation())
}