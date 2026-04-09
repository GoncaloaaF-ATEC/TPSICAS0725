
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
















}

