
class Monster(name: String, hp: Int, offensivePower: Int) {
    val name = name
    var hp = hp
    var offensivePower = offensivePower

    fun infomation(): String{
        return("name: ${this.name}, hp: ${this.hp}, offensivePower: ${this.offensivePower}")
    }
}

class Player(name: String, hp: Int, offensivePower: Int){
    val name = name
    var hp = hp
    var offensivePower = offensivePower

    fun infomation(): String{
        return("name: ${this.name}, hp: ${this.hp},offensivePower: ${this.offensivePower}")
    }
}



fun main(){
    println("バトルを始めます")
    println("-----------------------")
    var winner: String
    var player = Player("勇者", 250, 50)
    var monster = Monster("スライム", 300, 30)
    while (true) {
        println("${player.name}が攻撃！ ${monster.name}は${player.offensivePower}のダメージ")
        monster.hp -= player.offensivePower
        println("${monster.name}の残りHPは${monster.hp}")
        if(monster.hp <= 0){
            println("${monster.name}は倒れた")
            winner = player.name
            break
        }
        println("${monster.name}が攻撃！ ${player.name}は${monster.offensivePower}のダメージ")
        player.hp -= monster.offensivePower
        println("${player.name}の残りHPは${player.hp}")
        if(player.hp <= 0){
            println("勇者は倒れた!!!")
            winner = monster.name
            break
        }

    }
    println("バトル終了！勝者：${winner}")

}