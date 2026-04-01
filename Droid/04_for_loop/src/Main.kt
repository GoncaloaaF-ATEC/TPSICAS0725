//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val rg = 1..10
    for (i in rg) {
        print("$i ")
    }

    println()
    for (i in 0..100 step 10) {
        print("$i ")
    }

    println()
    for (i in 0..100 step 10) {
        print("$i ")
    }

    println()
    for (i in 0..<100 step 10) {
        print("$i ")
    }
    println()

    for (l in 'a'..'z'){
        print("$l ")
    }
    println()
    for (l in 'C'..'a'){
        print("$l ")
    }
    println()

    for (elm in '0'..'z') {
        print("$elm ")
    }

    println()

    for(elm in 1 until 10){ //  1..<10
        print("$elm ")
    }

    println()
    for(elm in 10 downTo 3 step 2){
        print("$elm ")
    }

    println()
    for (l in 'a' downTo 'C'){
        print("$l ")
    }

    val i: Int = 10 //  val i = 10
}


/*

idade = "10" // lido de uma api
//validar se a idade é um num
idade = int(idade)

 */