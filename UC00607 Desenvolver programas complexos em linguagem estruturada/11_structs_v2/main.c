#include <stdio.h>


typedef struct dataNasc {
    int dia;
    int mes;
    int ano;
} DataNasc;

typedef struct pessoa {
    char nome[50];
    char email[50];
    DataNasc data;
} Pessoa;




int main(void) {

    //DataNasc data = {12, 12, 2000};
    Pessoa pessoa = {"Gonçalo", "goncalo@mail.com", {12, 12, 2000}};


    printf("%s\n", pessoa.nome);
    printf("%s\n", pessoa.email);
    printf("%d/%d/%d\n", pessoa.data.dia, pessoa.data.mes, pessoa.data.ano);

    // Crie uma lista com 4 Pessoas e mostre os seus dados






    return 0;
}