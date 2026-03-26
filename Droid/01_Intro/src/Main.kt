import kotlin.reflect.typeOf

fun main() {

    println("Ola Mundo")
    print("Ola Mundo2\n")
    println("Ola Mundo 3")

    println("-----------")
    var nome = "Gonçalo"
    var idade: Int = 123

    println(nome)
    nome = "Carlos"
    println(nome)

    // Olá Carlos!!

    println("Ola Mundo " + nome)

    println("Ola Mundo $nome")

    // Olá Carlos o teu nome tem 6 letras
    println("Ola Mundo " + nome + " o teu nome tem " + nome.length + " letras")

    println("Ola Mundo $nome o teu nome tem ${nome.length} letras")

    // var nome3 = readLine()
    // println("Ola Mundo $nome3")


    println("-----------")
    // cmt

    /*

    cmt
    multi
    linha
     */
    println("-----------")


    var ano = 2012  // var
    ano = 2014

    val ano2 = 2015 // const

    println("-----------")

    println(ano.javaClass.name)
    println(ano.javaClass.kotlin)
    println(ano.javaClass.kotlin.simpleName)
    println(ano.javaClass.kotlin.qualifiedName)

    println("-----------")

    var ano4 = 2015 // const

    println(ano4.javaClass.kotlin.simpleName)

    var anoStr = ano4.toString()

    println(anoStr)
    println(anoStr.javaClass.kotlin.simpleName)

    val anoStrInt = anoStr.toIntOrNull()
    println(anoStrInt)

    val myString = "The Quick Brown Fox Jumps Over a Lazy Dog"
    val myString2 = "Lazy Dog"

    println(myString.length)
    println(myString.uppercase())
    println(myString.lowercase())
    println(myString.capitalize())
    println("--------")
    println(myString.compareTo(myString2))

    println(myString.indexOf(myString2))


    /*

    1 Faça um Programa que mostre a mensagem "ola mundo" na consola.
    2 Faça um Programa que peça um número e então mostre a mensagem
        "O número informado foi [número]".

    3 Faça um Programa que peça dois números e imprima a soma.
    4 Faça um Programa que peça as 4 notas bimestrais e mostre a média.
    5 Faça um Programa que converta metros para centímetros.



     */
}
