package br.com.cogna.pegasus_showcase.navigation

import androidx.annotation.StringRes
import br.com.cogna.ui.pegasus_showcase.R

sealed class PegasusScreen(val route: String, @StringRes val resourceId: Int) {
    object Main : PegasusScreen(route = "main", resourceId = R.string.screen_main)
    object Buttons : PegasusScreen(route = "buttons", resourceId = R.string.screen_buttons)
    object Typography : PegasusScreen(route = "text", resourceId = R.string.screen_typography)
}