import kotlin.random.Random

class Monster(){
    val monster_array = listOf<Character>(
        Character("ウルフ", 180, 80),
        Character("ゴーレム", 400, 30),
        Character("人型モンスター", 350, 50),
        Character("スライム", 100, 20)
    )

    fun getMonsterdata(): List<Character>{
        return monster_array
    }

    fun getMonsterOnedata(i: Int): Character{
        return monster_array[i]
    }

}

class Player(){
    val player_array = listOf<Character>(
        Character("剣者", 400, 50),
        Character("魔法者", 300, 40),
        Character("盾者", 350, 30),
        Character("素手者", 380, 60)
    )

    fun getPlayerdata(): List<Character>{
        return player_array
    }

    fun getPlayerOnedata(i: Int): Character{
        return player_array[i]
    }

}

fun main(){
    println("バトルを始めます")
    println("-----------------------")
    var winner: String

    println("あなたが選ぶプレイヤーはどれですか？")
    for((i, k) in Player().getPlayerdata().withIndex()){
        println("${i+1}: ${k.name} 攻撃力: ${k.offensivePower} 体力: ${k.hp}")
    }
    val player = Player().getPlayerOnedata(readLine()!!.toInt()-1)
    println("あなたは${player.infomation()}です")
    println("${player.name}が持っているスキルは ${player.skillInfo()}")
    println("相手は  ${Monster().getMonsterOnedata(Random.nextInt(3)).infomation()}")

}