import kotlin.random.Random

class Monster(){
    val monster_array = listOf<Character>(
        Character("ウルフ", 180),
        Character("ゴーレム", 400),
        Character("人型モンスター", 350),
        Character("スライム", 100)
    )


    fun getMonsterOnedata(i: Int): Character{
        return monster_array[i]
    }

}

class Player(){
    val player_array = listOf<Character>(
        Character("剣者", 400),
        Character("魔法者", 300),
        Character("盾者", 350),
        Character("素手者", 380)
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
    val winner: String
    var monster = Monster().getMonsterOnedata(Random.nextInt(3))

    println("あなたのプレイヤーはどれですか？番号を記入してください")
    for((i, k) in Player().getPlayerdata().withIndex()){
        println("${i+1}: ${k.name} 体力: ${k.hp}")
    }
    var player = Player().getPlayerOnedata(readLine()!!.toInt()-1)
    println("あなたは${player.infomation()}です")
    println("${player.name}が持っているスキルは ${player.skillInfo()}")
    println("相手は  ${monster.infomation()}")
    println("${monster.name}が持っているスキルは ${monster.skillInfo()}")
    while (true){
        println("プレイヤーの番です。何を出しますか。番号を記入してください")
        for(i in 0 until 4){
            println("${i+1}: ${player.skillnameChange(i)} 攻撃力: ${player.skillDamegePoint(i)}")
        }
        val player_select = readLine()!!.toInt() - 1
        println("${player.name}は${monster.name}を攻撃!!")
        monster.hp -= player.skillDamegePoint(player_select)!!
        println("${monster.name}は${player.skillDamegePoint(player_select)}ダメージもらった!!")
        println("-----------------------")
        println("${monster.name}は${player.name}を攻撃!!")
        println("${player.name}は${monster.skillDamegePoint(Random.nextInt(2))}ダメージもらった")
        if(player.hp <= 0){
            println("バトルを終了します。　勝者は${monster.name}")
            break
        }else if(monster.hp <= 0){
            println("バトル終了します。勝者は${player.name}")
            break
        }



    }

}