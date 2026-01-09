package com.example.marcelina_1.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Grade
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.School
import com.example.marcelina_1.presentacion.homeScreen.DrawerItem

val drawerItems = listOf(
    DrawerItem(
        route = "cursos",
        title = "Cursos",
        icon = Icons.Default.School
    ),
    DrawerItem(
        route = "estudiantes",
        title = "Estudiantes",
        icon = Icons.Default.People
    ),
    DrawerItem(
        route = "asistencia",
        title = "Asistencia",
        icon = Icons.Default.CheckCircle
    ),
    DrawerItem(
        route = "calificaciones",
        title = "Calificaciones",
        icon = Icons.Default.Grade
    )
)