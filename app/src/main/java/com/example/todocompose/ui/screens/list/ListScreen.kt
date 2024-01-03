package com.example.todocompose.ui.screens.list

import android.annotation.SuppressLint
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.todocompose.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ListScreen(
    navigateToTaskScreen: (Int) -> Unit
) {
    Scaffold(
        content = {

        },
        floatingActionButton = {
            ListFab(onFabClick = navigateToTaskScreen)
        }
    )
}

@Composable
fun ListFab(
    onFabClick: (Int) -> Unit
) {
    FloatingActionButton(onClick = {
        onFabClick(-1)
    }) {
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription = stringResource(id = R.string.add_button),
            tint = Color.White
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ListScreenPreview() = ListScreen(navigateToTaskScreen = {})