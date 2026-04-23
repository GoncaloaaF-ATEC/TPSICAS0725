package pt.atec.a13_listas_mvvm

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {


    val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            Column(modifier = Modifier
                .padding(25.dp)){
                mainApp(viewModel)

            }

        }
    }
}

@Composable
fun mainApp(vm: MainViewModel){

    var nome by remember { mutableStateOf("") }
    var idade by remember { mutableStateOf("") }

    Column(modifier =
        Modifier
            .fillMaxWidth()

    ) {
        Row(modifier =
            Modifier.fillMaxWidth()) {

            TextField(
                value = nome,
                onValueChange = {
                    nome = it
                },
                placeholder = {
                    Text("Nome")
                },
                modifier = Modifier
                    .weight(3f)
            ) // TextField Nome

            Spacer(modifier = Modifier
                .width(5.dp))
            TextField(
                value = idade,
                onValueChange = {
                    idade = it
                },
                placeholder = {
                    Text("Idade")
                },
                modifier = Modifier
                    .weight(1f)

            ) // TextField Nome


        }// Row

        Button(
            onClick = {
                // validar se a possoa pode ser add
                vm.addPessoa(nome, idade)
                nome=""
                idade = ""
            },
            modifier = Modifier
                .fillMaxWidth()

        ) {

            Text("Add")
        } // Button
    }// Column





}