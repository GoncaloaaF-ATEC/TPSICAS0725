package pt.atec.a15_api_mvvm_v2


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.flow.take


class MainActivity : ComponentActivity() {
    private val vm: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainApp(vm)
        }
    }
}

@Composable
fun MainApp(vm: MainViewModel){
    val posts by vm.posts.collectAsState()
    val msg by vm.msg.collectAsState()

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        verticalArrangement = Arrangement.Top
    ) {

        Button(onClick = {

        },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("GET Posts")
        }

        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {

        },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("POST novo Post ")
        }
        Spacer(modifier = Modifier.height(16.dp))

        Text(msg,
            style = MaterialTheme.typography.titleMedium
            )

        LazyColumn {
            items(posts){ post ->

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp)
                ) {
                    Column(modifier = Modifier.padding(12.dp)) {
                        Text(
                            text = post.title,
                            style = MaterialTheme.typography.titleMedium
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = post.body,
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                }


            }



        }


    }


}
