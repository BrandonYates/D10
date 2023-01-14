package com.yates.d10.model

class Character(
    override val id: String,
    override val name: String,
    override val strength: Int,
    override val agility: Int,
    override val durability: Int,
    override val stamina: Int,
    override val intelligence: Int,
    override val insight: Int,
    val inventory: List<Item>,
) : Creature {

}
