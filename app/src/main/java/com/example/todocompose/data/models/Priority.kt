package com.example.todocompose.data.models

import androidx.compose.ui.graphics.Color
import com.example.todocompose.ui.theme.highPriority
import com.example.todocompose.ui.theme.lowPriority
import com.example.todocompose.ui.theme.mediumPriority
import com.example.todocompose.ui.theme.nonePriority

enum class Priority(val color: Color) {
    HIGH(highPriority),
    MEDIUM(mediumPriority),
    LOW(lowPriority),
    NONE(nonePriority)
}