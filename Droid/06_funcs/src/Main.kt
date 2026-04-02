fun main() {

    olaMundo()
    olaMundo("Gonçalo")

    val msg = msg("Gonçalo")
    println("return: $msg")

    println(soma(2, 5))

    println(soma(v1=5, v2=5))

    println(soma(v2=14, v1=5))

    println(soma2(v2=10, v3=4, v1=12))

    println(soma2(v1=10, 32, v3=12))

    println(soma3(v1=43))
    println(soma3(1))

    println(soma3(v1=43, 47))
    println(soma3(1, 93))


    println(msg2("Gonçalo"))
    println(msg2())
}

fun olaMundo(){
    println("Ola Mundo")
}

fun olaMundo(nome: String){
    println("Ola Mundo, $nome ")
}

fun msg(nome: String): String {
    return "Ola Mundo, $nome"
}


fun soma(v1: Int, v2: Int): Int {
    // codigo
    val soma = v1 + v2

    return soma
}


fun soma2(v1: Int,
          v2: Int,
          v3: Int): Int {
    // codigo
    val soma = v1 + v2 + v3

    return soma
}

fun soma3(v1: Int, v2: Int = 0): Int {
    // codigo
    val soma = v1 + v2

    return soma
}


fun msg2(nome: String = "Desconhecido"): String {
    return "Ola Mundo, $nome"
}

