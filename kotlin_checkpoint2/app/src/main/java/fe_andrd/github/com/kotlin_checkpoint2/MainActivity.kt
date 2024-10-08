package fe_andrd.github.com.kotlin_checkpoint2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import fe_andrd.github.com.kotlin_checkpoint2.ui.theme.Kotlin_checkpoint2Theme
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configurando a toolbar
        val toolbarMain: Toolbar = findViewById(R.id.toolbar_main)
        configureToolbar(toolbarMain)
    }
    private fun configureToolbar(toolbar: Toolbar) {
        setSupportActionBar(toolbar)
        toolbar.setTitleTextColor(getColor(R.color.white))
        supportActionBar?.setTitle(getText(R.string.app_title))
        supportActionBar?.setBackgroundDrawable(getDrawable(R.color.primary))

    }
}
