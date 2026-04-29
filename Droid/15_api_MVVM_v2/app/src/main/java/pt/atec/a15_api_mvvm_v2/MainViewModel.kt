package pt.atec.a15_api_mvvm_v2

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    private val _posts = MutableStateFlow<List<Post>>(emptyList())
    val posts: StateFlow<List<Post>> = _posts.asStateFlow()

    private val _msg = MutableStateFlow("Sem Ação")
    val msg:StateFlow<String> = _msg.asStateFlow()


    fun carregarPosts(){
        viewModelScope.launch {

            try{
                val resposta = RetrofitInstance.api.getPosts()

                if(resposta.isSuccessful){
                    _posts.value = resposta.body() ?: emptyList()
                    _msg.value = "Get com sucesso: ${_posts.value.size} posts lidos"
                }else{
                    _msg.value = "Erro no GET: código  ${resposta.code()}"

                }

            }catch (e: Exception){
                _msg.value = "Falha na rede no Get: ${e.message}"
            }

        }



    }

    fun criarPost(){
        viewModelScope.launch {
            try {
                val novoPost = Post(
                    userId = 1,
                    title = "Post criado na app",
                    body = "Este post foi enviado por Retrofit",
                )

                val resposta = RetrofitInstance.api.createPost(novoPost)

                if (resposta.isSuccessful) {
                    val novoPost = resposta.body()
                    _msg.value = "Novo Post: ${novoPost?.title}"
                } else {
                    _msg.value = "Erro no POST: código  ${resposta.code()}"

                }


            } catch (e: Exception) {
                _msg.value = "Falha na rede no POST: ${e.message}"

            }
        }
    }


}