
fun main() {
 println("----Array---- ")
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

    println("---- List -> estatica  ---")

    var lst: List<Int> = listOf(1,2,3,4,5)

    println(lst)
    println(lst[1])
    println("---")
    for (elm in lst) {
        println(elm)
    }

    println("---")

    // lst[0] = 12
    println(lst.size)

    //println(lst[10])


    var momesLst = nome.toList()
    println(momesLst)

    println("---")

    println(nome)
    println(momesLst.javaClass.simpleName)

    println("---- mutable List ---")

    var numML = mutableListOf(1,2,3,4,5)

    println(numML)
    numML[0] = 99
    println(numML)
    numML.add(88)
    println(numML)

    numML.remove(88)
    println(numML)

    numML.removeAt(2)

    println(numML)

    println(numML.size)
    numML.clear()
    println(numML)
    println(numML.size)

    numML.sortDescending()
    println(numML)

    numML = mutableListOf(1,2,3,4,5)

    numML.sortDescending()

    println(numML)

    numML.sort()

    println(numML)

    println(numML.contains(6))
    println(numML.contains(3))

    
}// main()