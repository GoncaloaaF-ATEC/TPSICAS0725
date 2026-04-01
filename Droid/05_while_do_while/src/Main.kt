
fun main() {
    var i = 10

    while (i > 0) {
        print("$i ")
        i--
    }
    println("\n----------")

    var j = -15

    do {
        print("$j ")
        j--
    }while (j > 0)

    println("\n----------")

    var k = 100

    while (k > 0) {
        k -= 1;
        if (k == 70) {
            break
        }

        if (k % 2 == 0) {
            continue
        }
        print("$k ")

    }

}

/*

Faça uma app que mostra a tabuada de um num fornecido pelo utilizador.

V1 - usando for
v2 - usando um while

 */
