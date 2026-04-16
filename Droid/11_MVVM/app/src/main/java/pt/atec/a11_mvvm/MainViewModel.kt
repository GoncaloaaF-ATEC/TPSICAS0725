package pt.atec.a11_mvvm

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow


class MainViewModel: ViewModel() {

    private val _txt = MutableStateFlow("Gonçalo")
        //  get
        //  set

    val txt: StateFlow<String> = _txt.asStateFlow()
        // get

    fun setText(novoNome: String){
        _txt.value = novoNome
    }
}