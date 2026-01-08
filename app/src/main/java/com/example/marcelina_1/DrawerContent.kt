package com.example.marcelina_1

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DrawerContent(
    items: List<DrawerItem>,
    onItemClick: (String) -> Unit
){
    ModalDrawerSheet {
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Menú",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(16.dp)
        )

        items.forEach { item ->
            NavigationDrawerItem(
                label = { Text(item.title) },
                icon = {
                    Icon(item.icon, contentDescription = item.title)
                },
                selected = false,
                onClick = {
                    onItemClick(item.route)
                },
                modifier = Modifier.padding(
                    NavigationDrawerItemDefaults.ItemPadding
                )
            )
        }
    }

}