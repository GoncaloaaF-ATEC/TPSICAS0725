
fun main() {

    val nome = arrayOf("Ana", "Joana", "Diana")

    println(nome[1])

    nome[1] = "Carlos"
    println(nome[1])

    println("-------")

    for (elm in nome) {
        println(elm)
    }
    println("-------")

    println(nome.get(1)) // nome[1]

   // println(nome[91])


    nome.set(0, "Maria")

    println(nome[0])

    println("-------")

    println(nome.size)
    println("-------")

    nome.forEach { nome ->
        println(nome)
    }

    println("-------")

    nome.forEach {
        println(it)
    }

    println("-------")


    var nums = Array(10) {0}

    nums.forEach {
        println(it)
    }
    var numsD = Array<Double>(10) {0.0}

    println("-------")

    var size = 10
    var inum = IntArray(size){-1}

   inum.forEach {
       println(it)
   }

    println("-------")

    
}// main()