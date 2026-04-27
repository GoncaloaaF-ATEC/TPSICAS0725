package pt.atec.a14_nav

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import pt.atec.a14_nav.ui.theme._14_navTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            appNav()
        }
    }
}


@Composable
fun appNav(){

    val navController = rememberNavController()


    NavHost(
        navController = navController,
        startDestination = "lista"
    ){

        composable("lista") {

            ListaAlunos(onAbrirDetalhe = {
                navController.navigate("detalhe")
            })
        }


        composable("detalhe") {

            DetalheAlunos(onVoltar = {
                navController.popBackStack()

            })
        }


    }




}


@Composable
fun ListaAlunos(onAbrirDetalhe: () -> Unit){

    val vm: ListaViewModel = viewModel()
    val alunos by vm.lista.collectAsState()

    Log.d("Aula 2", alunos.count().toString())
    LazyColumn(modifier = Modifier.fillMaxSize()
    ) {

        items(alunos){ aluno ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .clickable{
                        vm.selecionarAluno(aluno)
                        onAbrirDetalhe()
                    }
            ){
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                ) {
                    Text("Nome: ${aluno.nome}")
                    Text("Curso: ${aluno.curso}")
                    Text("Idade: ${aluno.idade}")
                }

            }
        }
    }
}


@Composable
fun DetalheAlunos(onVoltar: () -> Unit){


    val vm: DetalheViewModel = viewModel()
    val aluno by vm.alunoSelecionado.collectAsState()

    var novoNome by remember { mutableStateOf(aluno?.nome ?: "Sem nome") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        if (aluno == null) {
            Text("Nenhum aluno selecionado")
        } else {
            Text(text = "Detalhe do aluno", fontSize = 20.sp, fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 25.dp))

            Text(text = "ID: ${aluno!!.id}")
            Text(text = "Nome: ${aluno!!.nome}")
            Text(text = "Curso: ${aluno!!.curso}")
            Text(text = "Idade: ${aluno!!.idade}")


            TextField(value = novoNome,
                onValueChange = {
                    novoNome = it
                },
                placeholder = {
                    Text("Novo nome: ")
                }
            )

            Button(
                onClick = {
                    //validar se o nome é valido
                    vm.AtualizarAluno(novoNome) // mudar o nome com o nome vindo de uma TF
                    onVoltar()
                },
                modifier = Modifier.padding(top = 16.dp)
            ) {
                Text("Alterar nome")
            }


            Button(
                onClick = onVoltar,
                modifier = Modifier.padding(top = 16.dp)
            ) {
                Text("Voltar")
            }

        } // if aluno != null


    }// Column

}