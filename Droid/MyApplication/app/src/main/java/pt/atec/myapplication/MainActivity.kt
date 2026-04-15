package pt.atec.myapplication


import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        Text("Ola Mundo",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            color= Color.White,
            textDecoration= TextDecoration.Underline,
            maxLines = 1,

            modifier = Modifier
                .padding(25.dp)
                .background(
                    color= Color.Gray,
                    shape = RoundedCornerShape(25)
                    )
                .size(width=150.dp, height= 150.dp)
                .clickable{
                    Log.d("aula","Clicado no txt")
                    }
        ) // Text


        }// setContent
    }// onCreate
}// MainActivity
