#include <stdio.h>
#include <stdlib.h>


void demo();

void troca(int* a, int* b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}


void troca2(int* a, int* b) {
    int *temp = a;
    a = b;
    b = temp;
}

void soma(int a, int b, int *resultado) { // tem de se manter void, mas o resto pode mudar
    *resultado = a + b;
}

//typedef int inteiro;

typedef char* String;

int main(void) {

    {
        int a = 10;
        int b = 20;

        printf("%d, %d\n", a, b);

        troca(&a, &b);

        printf("%d, %d\n", a, b);

        troca2(&a, &b);

        printf("%d, %d\n", a, b);


        printf("-----------------------\n");
        int resultado;
        int v1 = 12, v2 = 20;

        soma(v1,v2, &resultado);

        printf("%d + %d = %d\n", v1, v2, resultado);
    }
    printf("-----------------------\n");

    String nome = "Gonçalo";
    printf("%s\n", nome);

    nome = "Joana";

    printf("%s\n", nome);
    printf("-----------------------\n");

    const String nome3 = "Gonçalo";

    printf("%s\n", nome3);
    /*
    nome3 = "";

    printf("%s\n", nome3);
    */

    printf("-----------------------\n");

    demo();

    return 0;
}


void demo() {

    int n;
    int *lista;
    int sum = 0;

    printf("Quantos valores queres inserir: ");
    scanf("%d", &n);


    printf("vão ser adicionados %d num\n", n);

    //Alocar memoria
    lista = (int *) malloc(n * sizeof(int));

    // verificar se aloc foi bem feita
    if (lista == NULL) {
        printf("Erro na alocacao de memoria\n");
        return;
    }




    printf("digite %d numeros: \n", n);

    /*
    for (int i = 0; i < n; i++) {
        scanf("%d", &lista[i]);
        sum += lista[i];
    }

    printf("soma = %d\n", sum);

    printf("%d\n", lista[0]);
    printf("%d\n", lista[1]);
    */

    for (int i = 0; i < n; i++) {
        scanf("%d", lista + i);
        sum += *(lista + i);

    }

    printf("soma = %d\n", sum);

    printf("%d\n", lista[0]);
    printf("%d\n", lista[1]);

    printf("-------------------\n");
    printf("%d\n", *lista);
    printf("%d\n", *(lista + 1));

    free(lista);
    lista = NULL;

    printf("-------------------\n");

    printf("%d\n", *lista);
    printf("%d\n", *(lista + 1));


}


/*
 *
 * Pessoa p = new, Pessoa();
 * p.nome = "ana"
 *
 * Pessoa j = p;
 *
 * j.nome = "Rita"
 *
 * se p -> ref
 * p.nome -> Rita
 *
 * se p ->val
 *
 * p.nome -> ana
 *
 */