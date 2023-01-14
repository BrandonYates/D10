package com.yates.d10.model

interface Creature: Entity {
    val name: String
    val strength: Int
    val agility: Int
    val durability: Int
    val stamina: Int
    val intelligence: Int
    val insight: Int
}
