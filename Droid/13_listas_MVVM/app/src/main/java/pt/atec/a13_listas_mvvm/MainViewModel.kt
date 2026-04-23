package pt.atec.a13_listas_mvvm

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow


data class Pessoa(val nome: String, val idade: Int)

class MainViewModel: ViewModel() {

    private val _lista = MutableStateFlow<List<Pessoa>>(emptyList())
    var lista = _lista.asStateFlow()


    fun addPessoa(nome: String, idade: String){
        val idade = idade.toIntOrNull() ?: 0
        val p = Pessoa(nome, idade)

        _lista.value += p
    }
}