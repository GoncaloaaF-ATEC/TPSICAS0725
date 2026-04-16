package pt.atec.a11_mvvm

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    val vm: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Home(vm)
        }
    }
}


@Composable
fun Home(vm: MainViewModel){
    val myTxt = vm.txt.collectAsState()

    // desafio - Colocar esta var no lado do VM
    var nomeTF by remember { mutableStateOf("") }

    Column{
        Spacer(Modifier.height(25.dp))

        Text(myTxt.value,
            fontSize = 20.sp
        )

        TextField(value = nomeTF,
            onValueChange = {
                nomeTF = it
            })

        Button(onClick = {
            vm.setText(nomeTF)
            nomeTF = ""
        }) {
            Text("Mudar nome")
        }
    }


}