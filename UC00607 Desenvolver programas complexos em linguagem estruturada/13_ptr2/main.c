#include <stdio.h>

/*




 */



int main(void) {

    int x = 13;

    int *ptrx = &x;

    printf("o valor do ptr é: %d\n", *ptrx);

    int x2 = 20;

    ptrx = &x2;

    printf("o valor do ptr é: %d\n", *ptrx);


    printf("------------------------\n");
    // crie um ptr e uma var inteira(a var tem de ter valor), atribua o valor da var ao ptr

    int x3 = 83;
    int *ptrx3 = &x3;

    // mostre o conteudo do ptr
    printf("o valor do ptr é %d\n", *ptrx3);

    // alter o valor do ptr
    *ptrx3 = 123;

    // mostre o conteudo do ptr
    printf("o valor do ptr é %d\n", *ptrx3);

    return 0;
}