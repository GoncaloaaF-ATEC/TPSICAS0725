#include <stdio.h>


/*
 *  array[3] = {nome, email, telefone}
 *
 *  array[500] = {
 *  {nome, email, telefone},
 *  {nome, email, telefone},
 *  {nome, email, telefone},
 *  {nome, email, telefone}
 *  }
 *
 *
 */


struct contacto {
    char nome[30];
    char mail[150];
    char telefone[30];
    int idade;
};

void printContacto(struct contacto ct);

int main(void) {


    struct contacto ct1 = {"Gonçalo",
                           "goncalo@mail.com",
                           "12456780",
                           40};

    printContacto(ct1);

    ct1.idade = 29;

    printContacto(ct1);


    //alterar o nome


    printContacto(ct1);

    return 0;
}

void printContacto(struct contacto ct) {
    printf("\n");
    printf("Nome: %s\n", ct.nome);
    printf("Mail: %s\n", ct.mail);
    printf("Telefone: %s\n", ct.telefone);
    printf("Idade: %d\n", ct.idade);
}