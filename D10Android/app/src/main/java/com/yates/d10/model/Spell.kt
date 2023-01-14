package com.yates.d10.model

data class Spell(
    override val id: String,
    val name: String,
    val actionEffect: String,
    val diceRoll: String,
    val modifier: String,
    val intelligenceRequirement: Int,
    val range: String,
    val description: String
) : Entity