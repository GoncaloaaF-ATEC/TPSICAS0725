package pt.atec.a13_listas_mvvm

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle

class MainActivity : ComponentActivity() {


    val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            Column(modifier = Modifier
                .padding(25.dp)){
                MainApp(viewModel)

            }

        }
    }
}

@Composable
fun MainApp(vm: MainViewModel){

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
                    if(it.all { ch -> ch.isDigit() }) {
                        idade = it
                    }
                },
                placeholder = {
                    Text("Idade")
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number
                ),

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
        lista(vm)
    }// Column

}


@Composable
fun lista(vm: MainViewModel){
    var lista = vm.lista.collectAsStateWithLifecycle()

    LazyColumn {
        items(lista.value){ pessoa ->
            PessoaRow(pessoa)
        }// items
    } // LazyColumn
} // fun lista

@Composable
fun PessoaRow(pessoa: Pessoa){

    Row(verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
        .fillMaxWidth()
        .padding(12.dp)

    ){

        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Gray)
        )

        Spacer(modifier = Modifier
            .width(12.dp))

        Column {
            Text(text = pessoa.nome)
            Text(text = "Idade: ${pessoa.idade}")
        }

    }



}
