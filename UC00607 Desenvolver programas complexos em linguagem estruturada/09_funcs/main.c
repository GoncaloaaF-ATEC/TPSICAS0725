#include <stdio.h>

#include "funcs.h"
#include "varGlobais.h"


/*
 * var
 * const
 * condições
 *      if
 *      switch
 * loops
 *      for
 *      while
 *      do-while
 * arrays
 *  1D
 *  2D
 *  multiplas dimensões
 * strings
 * in/out
 *
 *
 * 17/12/25
 * funcs
 * headers
 *
 * 18/12/25
 * intro a ptr
 *
 *
 */



int main(void) {
    printf("Contador inicial = %d\n", contador);


    nome();
    int anoC = anoCurr();
    printf("1 - Estamos no ano %d\n", anoC);
    printf("2 - Estamos no ano %d\n", anoCurr());



    // altere o codigo para fazer a de 2 num fornecidos  pelo utilizador
    int valor1 = 0, valor2 = 0;

    printf("indique o valor1: ");
    scanf("%d", &valor1);
    printf("indique o valor1: ");
    scanf("%d", &valor2);

    int mySoma = soma(valor1, valor2);
    printf("a soma de %d + %d = %d\n",valor1, valor2, mySoma);

    printf("Contador funcs = %d\n", contador);

    contador += 10;

    printf("Contador funcs + 10 = %d\n", contador);
    return 0;
}



