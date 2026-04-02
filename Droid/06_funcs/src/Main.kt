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

    println(soma4())

    println(soma4(14,19.0))
    println("-------------")
    msg_lambda()
    println(msg2_lambda())

    println(msg3_lambda("Joana"))

    var res = calculo(v1 = 50, v2 = 4, op=soma_lambda)

    println("res: $res")
}


/*

fun demo(num:Int): Int{
    return num * 4
}

lst = [1,2,3,4,5,6,7,8,9]

for i in 0..<lst.size{
    lst[i] = demo(lst[i])
}

 */


var soma_lambda = { n1: Int, n2: Int -> n1 + n2 }


val msg_lambda = { println("Ola Mundo lambda") }
val msg2_lambda = { "Ola Mundo lambda 2" }
val msg3_lambda = {nome:String -> "Ola Mundo lambda $nome" }

fun calculo(v1: Int,
            v2: Int,
            op: (Int, Int) -> Int ): Int{

    return op(v1, v2)
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
/*

fun soma(v1: Int, v2: Int): Int {
    // codigo
    val soma = v1 + v2

    return soma
}

 */
fun soma4(v1: Int= 12, v2: Double= 12.0) = v1 + v2
fun soma5(v1: Int= 12, v2: Double= 12.0): Double{
    return v1 + v2
}

