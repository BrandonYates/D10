package com.yates.d10.ui.composables

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yates.d10.model.Item
import com.yates.d10.model.ItemCategory
import com.yates.d10.model.ItemWeight
import com.yates.d10.ui.theme.D10Theme

@Composable
fun ItemScreen(items: List<Item>) {
    val horizontalScrollState = rememberScrollState(0)

    val horizontalScrollModifier = Modifier.horizontalScroll(horizontalScrollState)
    LazyColumn(modifier = Modifier
        .fillMaxSize()
    ) {
        item {
            ItemHeader(modifier = horizontalScrollModifier)
        }
        items(items.size) { index ->
            Divider(
                color = Color.Black,
                modifier = Modifier
                    .height(1.dp)
                    .fillMaxWidth()
            )
            ItemRow(item = items[index], modifier = horizontalScrollModifier)
        }
    }
}

@Composable
fun ItemHeader(
    modifier: Modifier = Modifier,
) {
    Row(modifier = modifier
        .fillMaxWidth()
    ) {
        ItemHeaderField(text = "ID")
        ItemHeaderField(text = "Name")
        ItemHeaderField(text = "Str_requirement")
        ItemHeaderField(text = "Agility_requirement")
        ItemHeaderField(text = "Intelligence_requirement")
        ItemHeaderField(text = "Wield")
        ItemHeaderField(text = "Action_effect")
        ItemHeaderField(text = "Dice_roll")
        ItemHeaderField(text = "Modifiers")
        ItemHeaderField(text = "Category")
        ItemHeaderField(text = "Description")
        ItemHeaderField(text = "Range")
        ItemHeaderField(text = "Weight")
    }
}

@Composable
fun ItemHeaderField(
    modifier: Modifier = Modifier,
    text: String
) {
    Row(modifier = modifier
        .background(Color.Gray)
        .height(24.dp)
        .width(144.dp)
        .border(border = BorderStroke(1.dp, Color.Black), shape = RectangleShape)) {
        Text(
            text = text,
            modifier = modifier
                .padding(4.dp)
        )
    }
}

@Composable
fun ItemEntryField(
    modifier: Modifier = Modifier,
    text: String
) {
    Text(
        text = text,
        modifier = modifier
            .padding(start = 4.dp, end = 4.dp)
            .height(24.dp)
            .width(144.dp)
    )
}

@Composable
fun ItemRow(
    modifier: Modifier = Modifier,
    item: Item
) {
    Row(modifier = modifier.fillMaxWidth()) {
        ItemEntryField(text = item.id)
        ItemEntryField(text = item.name)
        ItemEntryField(text = item.str_requirement.toString())
        ItemEntryField(text = item.agility_requirement.toString())
        ItemEntryField(text = item.intelligence_requirement.toString())
        ItemEntryField(text = item.wield.joinToString(","))
        ItemEntryField(text = item.action_effect)
        ItemEntryField(text = item.action_effect)
        ItemEntryField(text = item.modifiers)
        ItemEntryField(text = item.modifiers)
        ItemEntryField(text = item.description)
        ItemEntryField(text = item.range)
        ItemEntryField(text = item.weight.toString())
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    D10Theme {
        val item = Item(
            id = "vmwogcv88zhozqz",
            name = "Chain Mail",
            dice_roll = "+3",
            action_effect = "Adds +3 to defense rolls",
            category = ItemCategory.ARMOR,
            weight = ItemWeight.MEDIUM,
            description = "Relatively inexpensive armor made out of interlocking " +
                    "metal rings",
            range = "N/A"
        )
        ItemScreen(items = listOf(item))
    }
}