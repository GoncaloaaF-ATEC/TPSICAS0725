package pt.atec.a12_listas

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(modifier =
                Modifier.padding(top=25.dp)) {
                ListaObj()
            }
        }
    }
}

@Composable
fun ListaSimples(){
    val nomes = listOf("Ana", "Bruno", "Carlos", "Diana",)

    LazyColumn{
        items(nomes){ nome ->
            Text(nome)
        }
    }
}


@Composable
fun ListaComLayout(){
    val nomes = listOf("Ana", "Bruno", "Carlos", "Diana",) // vem de fora

    LazyColumn{
        items(nomes){ nome ->
                ListBaseRow(nome)
        }
    }
}

@Composable
fun ListBaseRow(nome: String){

    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
            .background(Color.Red)
            .padding(15.dp)
    ) {
        Text(nome,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White

        )
    }

}



@Composable
fun ListaComLayoutClick(){
    val nomes = listOf("Ana 2", "Bruno 2", "Carlos 2", "Diana 2",) // vem de fora

    LazyColumn{
        items(nomes){ nome ->
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(5.dp)
                    .clickable{
                        Log.d("Aula", nome)
                         }
                    .fillMaxWidth()

                    .background(Color.Red)
                    .padding(15.dp)
            ) {
                Text(nome,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White

                )
            }
        }
    }
}


@Composable
fun ListaComLayoutClickRow(){
    val nomes = listOf("Ana 2", "Bruno 2", "Carlos 2", "Diana 2",) // vem de fora
    var ano = 2026
    LazyColumn{
        items(nomes){ nome ->
            ListRow2(nome, onClick = { nome ->
                Log.d("Aula", "nome: $nome ano: $ano")
            })
        }
    }
}

@Composable
fun ListRow2(nome: String, onClick: (nome: String)-> Unit ){
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(5.dp)
            .clickable{
                onClick(nome)
            }
            .fillMaxWidth()

            .background(Color.Red)
            .padding(15.dp)
    ) {
        Text(nome,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White

        )
    }

}


data class Pessoa(val nome: String, val idade: Int)

@Composable
fun ListaObj(){

    val pessoas = listOf(
        Pessoa("Ana", 25),
        Pessoa("Bruno", 30),
        Pessoa("Carlos", 28)
    )
    var msg by remember { mutableStateOf("") }
    Column {
        
        LazyColumn{
            items(pessoas){ pessoa ->
                PessoaRow(pessoa, onClick = { nome, idade ->

                    Log.d("Aula", "nome: ${nome} idade: $idade")
                    msg = "nome: $nome,  idade: $idade"

                })
            }
        }
    }


    Text(msg, fontSize = 30.sp)
}

@Composable
fun PessoaRow(pessoa: Pessoa, onClick: (String, Int) -> Unit){

    Row{
        Column(modifier = Modifier
            .padding(5.dp)
            .clickable{
                onClick(pessoa.nome, pessoa.idade)
            }
            .fillMaxWidth()

            .background(Color.Red)
            .padding(15.dp)
        ) {
            Text(pessoa.nome,
                fontSize = 30.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold)

            Text("${pessoa.idade}")
        }


    }


}