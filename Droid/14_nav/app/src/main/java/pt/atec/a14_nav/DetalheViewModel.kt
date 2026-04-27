package pt.atec.a14_nav

import androidx.lifecycle.ViewModel

class DetalheViewModel: ViewModel() {

    val alunoSelecionado = AlunoRepository.alunoSelecionado


    fun AtualizarAluno(novoNome: String){

        val aluno = alunoSelecionado.value ?: return
        val alunoAtulizado = aluno.copy(nome= novoNome)
        AlunoRepository.AtulizarAluno(alunoAtulizado)

    }


}