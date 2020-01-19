class Character(name: String, hp: Int, offensivePower: Int){
    val name = name
    var hp = hp
    var offensivePower = offensivePower

    fun skill(): Map<String, Int> {
        return(mapOf("attack" to 30, "Enhance_power" to 20, "Deathblow" to 50, "defence" to 30))
    }

    fun infomation(): String{
        return("  名前:${this.name} 体力: ${this.hp} 攻撃力: ${this.offensivePower}")
    }

    fun skillInfo(): String{
        return("物理攻撃: ${this.skill()["attack"]} 力を溜める: ${this.skill()["Enhance_power"]}" +
                " 必殺技: ${this.skill()["Deathblow"]} 防御: ${this.skill()["defence"]}")
    }





}

