
fun main() {

    println("-1-")
    val p = Pessoa("Joao")
    println("-2-")

    println("Nome: ${p.nome}")
    println("idade: ${p.idade}")

    println(p.anoNac())

    println("---------------------")

    println("-1-")
    var p2 = Pessoa("Carlos", turma = "TPSICAS")
    println("-2-")


    println("Nome: ${p2.nome}")
    println("Idade: ${p2.idade}")
    println("Turma: ${p2.turma}")

    // p2.nome = "Novo nome"

    println("Nome: ${p2.nome}")






    println("-----")
    var p3 = Pessoa("Carlos", turma = "TPSICAS")


    println( p3.nome)

    p3.nome = "ana"
    println( p3.nome)

    println("--------------------------------------------")
    println("--------------------------------------------")
    println("--------------------------------------------")

    var p5 = Pessoa("Carlos", turma = "TPSICAS")
    var p4 = Pessoa("Carlos", turma = "TPSICAS")

    var al = Aluno("Rita", 21, 18.4)
    var al2 = Aluno("Rita", 21, 18.4)

    println(p4)
    println(al)


    println(p4 == p5)
    println(al == al2)

    // al.nome = "asas"

    println(al)

    al = al.copy(nome = "Novo Nome")

    println(al)

    println("--------------------------------------------")

    val novaP = p4

    println(novaP.nome)
    println(p4.nome)
    novaP.nome = "sadasdasdasdhdksdfhgds"
    println(novaP.nome)
    println(p4.nome)


    println("--------------------------------------------")

    val novoAluno = al.copy(nome= "nome do novo Aluno")

    println(novoAluno.nome)
    println(al.nome)
}

