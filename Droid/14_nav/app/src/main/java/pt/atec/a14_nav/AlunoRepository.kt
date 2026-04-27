package pt.atec.a14_nav

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

object AlunoRepository {

    private val listaInicial = listOf(
        Aluno(1, "Gonçalo", "Android", 25),
        Aluno(2, "Ana", "iOS", 22),
        Aluno(3, "Pedro", "Web", 28)
    )

    private val _alunos = MutableStateFlow(listaInicial)
    val alunos: StateFlow<List<Aluno>> = _alunos.asStateFlow()

    private val _alunoSelecionado = MutableStateFlow<Aluno?>(null)
    val alunoSelecionado = _alunoSelecionado.asStateFlow()



    fun SelecionarAluno(aluno: Aluno){
        //logica de vaidação se o aluno existe
        _alunoSelecionado.value = aluno
    }


    fun AtulizarAluno(alunoAtualizado: Aluno){

        //atuliuzar lista
        _alunos.value = _alunos.value.map { alunoLista ->
            if(alunoLista.id == alunoAtualizado.id) alunoAtualizado else alunoLista
        }

        // atualizar selecionado
        if(_alunoSelecionado.value?.id == alunoAtualizado.id) {
            _alunoSelecionado.value = alunoAtualizado
        }
        //gerir o erro

    }
}