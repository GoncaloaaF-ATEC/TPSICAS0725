package pt.atec.a15_api_mvvm_v2

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel: ViewModel() {

    private val _posts = MutableStateFlow<List<Post>>(emptyList())
    val posts: StateFlow<List<Post>> = _posts.asStateFlow()

    private val _msg = MutableStateFlow("Sem Ação")
    val msg:StateFlow<String> = _msg.asStateFlow()


    fun carregarPosts(){}

    fun criarPost(){}


}