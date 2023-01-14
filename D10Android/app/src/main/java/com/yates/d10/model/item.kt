package com.yates.d10.model

data class Item(
    val id: String,
    val name: String,
    val str_requirement: Int = 0,
    val agility_requirement: Int = 0,
    val intelligence_requirement: Int = 0,
    val wield: Set<Wield> = emptySet(),
    val action_effect: String,
    val dice_roll: String = "",
    val modifiers: String = "",
    val category: ItemCategory,
    val description: String,
    val range: String,
    val weight: ItemWeight
)

enum class ItemCategory {
    WEAPON, ARMOR
}

enum class ItemWeight {
    LIGHT, MEDIUM, HEAVY
}
