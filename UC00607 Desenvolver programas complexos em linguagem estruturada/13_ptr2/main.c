#include <stdio.h>

/*




 */



int main(void) {
    printf("---------------- demo 1 ---------------------\n");

    int x = 13;

    int *ptrx = &x;

    printf("o valor do ptr é: %d\n", *ptrx);

    int x2 = 20;

    ptrx = &x2;

    printf("o valor do ptr é: %d\n", *ptrx);


    printf("---------------- demo 2 ---------------------\n");
    // crie um ptr e uma var inteira(a var tem de ter valor), atribua o valor da var ao ptr

    int x3 = 83;
    int *ptrx3 = &x3;

    // mostre o conteudo do ptr
    printf("o valor do ptr é %d\n", *ptrx3);

    // alter o valor do ptr
    *ptrx3 = 123;

    // mostre o conteudo do ptr
    printf("o valor do ptr é %d\n", *ptrx3);


    printf("---------------- demo 3 ---------------------\n");


    int a = 19;
    int a2 = 19;

    int *ptrA = &a;
    int *ptrA2 = &a;



    printf("%p\n", ptrA);
    printf("%p\n", ptrA2);

    printf("%i\n", ptrA == ptrA2);


    *ptrA = 10;
    printf("%i\n", *ptrA);
    printf("%i\n", *ptrA2);

    printf("---------------- demo 3 ---------------------\n");
    
    int b1 = 99;

    int* ptrb1 = &b1;

    int* ptrb2 = ptrb1;


    return 0;
}