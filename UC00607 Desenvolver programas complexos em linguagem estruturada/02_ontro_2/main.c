#include <stdio.h>

/*
 * while
 * do-while
 * for
 *  break
 *  continue
 *
 * Arrays
 *      1D
 *      2D
 *
 * func ?
 * str  ?
 *
 */



// while vs do-while

int main(void) {



    /*
     * while (data < 25/12/2025) {
     *
     * print("Ola Mundo);
     *
     * }
     *
     */
    int contador = 200;
    while (contador < 100) {
        //printf("%d\n", contador);
        contador++;
        printf("%d ", contador);
    }

    printf("\n Done while \n");


    int contador2 = 0;
    do {
        contador2++;
        continue;

        if (contador2 == 10) {
            break;
        }
        printf("%d ", contador2);

    }while (contador2 < 100);

    printf("\nDone do-while \n");


    // i = i+2 -> i += 2

    for (int i = 0; i < 25; i += 2) {
        printf("%d ", i);
    }

    printf("\\Done for v1 \n");



    // for (int i = 0; i < 50; i += 1) {
    for (int i = 0; i < 10; i++) {

        printf("%d ", i); // -> v1

        if (i == 5) {
            printf("%d ", i);
            break;
        }

         // printf("%d ", i); // -> v2
    }

    // v1 - 0 1 2 3 4 5     <- sem o prt do if
    // v1 - 0 1 2 3 4 5 5   <- run
    // v2 - 0 1 2 3 4       <- sem o prt do if
    // v2 - 0 1 2 3 4 5     <- run

    printf("\\Done for v2 \n");



    for (int i = 0; i < 20; i++) { //<- sem mexer aqui
        if ( i % 2 != 0) {
           continue;
        }



        printf("%d ", i);
        printf("\nmuito codigo\n");

    }

    return 0;
}


/*
 *
 *
 * static void funcXPTO(){
 *      if (a != 10){
 *          sai
 *      }
 *
 *      faz o cod da func
 *
 *      faz mais codigo
 * }
 *
 */