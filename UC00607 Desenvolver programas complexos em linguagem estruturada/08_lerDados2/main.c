#include <stdio.h>


int main(void) {

    char nome[50];

    printf("Insira o nome: \n");
    fgets(nome, 50, stdin);

    printf("nome = %s\n", nome);



    return 0;
}