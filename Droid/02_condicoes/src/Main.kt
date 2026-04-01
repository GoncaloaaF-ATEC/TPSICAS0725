//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val altura_float: Float = 0f
    val altura_Double: Double = 0.0


    var idade = 31

   // idade = IO.readln("Idade: ").toInt()

    if (idade >= 18) {
        println("Adulto")
    }else if (idade > 12) {
        println("Teen")
    }else{
        println("Criança")
    }

    // var mes = IO.readln("mes: ").toInt()

    var mes = 10
    when (mes){
        1 -> println("Jan")
        2 -> println("Feb")
        3 -> println("Mar")
        4 -> println("Abril")
        5 -> println("May")
        6 -> println("Jun")
        7 -> println("Jul")
        8 -> println("Aug")
        9 -> println("Sep")
        10 -> println("Oct")
        11 -> println("Nov")
        12 -> println("Dec")
        else -> println("Mês invalido")
    }


 //   var mes2 = IO.readln("mes2: ").toInt()
    val mes2 = 12
    val resp = when (mes2) {
        1 -> "Jan"
        2 -> "Feb"
        3 -> "Mar"
        4 -> "Abril"
        5 -> "May"
        6 -> "Jun"
        7 -> "Jul"
        8 -> "Aug"
        9 -> "Sep"
        10 -> "Oct"
        11 -> "Nov"
        12 -> "Dec"
        else -> "Unknown"
    }

    println(resp)

    var num = 5
    var resp2 = when (num) {
        1,2,3,6,9 -> "Bloco 1"
        5,4,7 -> "Bloco 2"
        else -> "Bloco 3"
    }


    println(resp2)
    println("-----------------")

    var num2 = IO.readln("mes2: ").toFloat()

    when (num2) {
        in 0f..5f -> println("Bloco 1")
        in 5f..10f -> println("Bloco 2")
        else -> println("Bloco 3")
    }

    println("-----------------")
    println("-----------------")
    var x = 10
    var j = 21

    when {
        x % 2 == 1 || j % 2 == 1 -> println("Impar")
        x % 2 == 0 -> println("Par")
        else -> println("Bloco 6")
    }

    if (idade >= 18) {
        println("Adulto")
    }else if (idade > 12) {
        println("Teen")
    }else{
        println("Criança")
    }
    println("-----------------")
    println("-----------------")

    idade = 12
    var resp5 = when {
        idade >= 18 -> {
            println("Adulto")
            println("msg2")
        }
        idade >= 12 -> println("Teen")
        else -> println("Criança")
    }

    println("----")

    println("----")



}