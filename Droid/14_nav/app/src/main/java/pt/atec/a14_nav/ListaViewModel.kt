package pt.atec.a14_nav

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.StateFlow

class ListaViewModel: ViewModel() {

    val lista: StateFlow<List<Aluno>> = AlunoRepository.alunos


    fun selecionarAluno(aluno: Aluno){

        AlunoRepository.SelecionarAluno(aluno)

    }

}