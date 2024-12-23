
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState


/**
 * Main Entry of the program.
 */
fun main() = application {
    val windowState = rememberWindowState(
        size = DpSize(600.dp, 400.dp)
    )

    val viewModel = AppViewModel()

    Window(
        onCloseRequest = ::exitApplication,
        undecorated = true,
        resizable = false,
        state = windowState
    ){
        App(windowState, viewModel)
    }
}
