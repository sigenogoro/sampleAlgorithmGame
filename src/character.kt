class Character(name: String, hp: Int) {
    val name = name
    var hp = hp

    fun infomation(): String{
        return("  名前:${this.name} 体力: ${this.hp}")
    }

    fun skillInfo(): String{
        return("物理攻撃: ${this.skill()["attack"]} 力を溜める: ${this.skill()["Enhance_power"]}" +
                " 必殺技: ${this.skill()["Deathblow"]} 防御: ${this.skill()["defence"]}")
    }

    private fun skill(): Map<String, Int> {
        return(mapOf("attack" to 30, "Enhance_power" to 20, "Deathblow" to 50, "defence" to -30))
    }

    fun skillDamegePoint(i: Int): Int? {
        val point = listOf(this.skill()["attack"], this.skill()["Enhance_power"], this.skill()["Deathblow"], this.skill()["defence"])
        return point[i]
    }

    fun skillnameChange(i: Int): String?{
        val entoja_change = mapOf("attack" to "物理攻撃", "Enhance_power" to "力を溜める", "Deathblow" to "必殺技", "defence" to "防御")
        val entoja_change_array = listOf(entoja_change["attack"], entoja_change["Enhance_power"], entoja_change["Deathblow"], entoja_change["defence"])
        return entoja_change_array[i]
    }



}

