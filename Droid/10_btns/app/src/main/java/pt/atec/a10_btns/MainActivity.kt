package pt.atec.a10_btns

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            // const [msg, setMsg] = useState("Ola Mundo") <- react
            var msg by remember { mutableStateOf("Ola Mundo") }
            var msg_tf = remember { mutableStateOf("") }

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(25.dp)
            ) {
                Text(
                    msg,
                    fontSize = 25.sp,
                )

                Spacer(modifier = Modifier.height(16.dp))

                TextField(value = msg_tf.value,
                    onValueChange = { txt ->
                        msg_tf.value = txt
                        Log.d("Aula", txt)
                    },
                    placeholder = {
                        Text("Nome:")
                    })


                Button(onClick = {
                    msg = msg_tf.value
                    msg_tf.value = ""
                    Log.d("Aula", msg)

                }) {
                    Text("Click me")
                }
            }

            fun teste(){
                msg = msg_tf.value
                msg_tf.value = ""
                Log.d("Aula", msg)

            }

        }
    }


}
