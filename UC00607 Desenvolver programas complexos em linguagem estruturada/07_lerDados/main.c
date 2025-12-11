#include <stdio.h>

int main(void) {

    int idade;

    printf("Insira a idade: ");
    scanf("%d", &idade);

    printf("a idade é: %d\n", idade);

    // ler uma data (dd-mm-aaaa)

    int dia;
    int mes;
    int ano;

    printf("data de hoje (dia/mes/ano): ");
    scanf("%d/%d/%d", &dia, &mes, &ano);
    printf("a data de hoje é: %.2d/%.2d/%4.d\n", dia, mes, ano);


    int cp1;
    int cp2;

    printf("Codigo postal: ");
    scanf("%3d%4d", &cp1, &cp2);

    printf("%d-%d\n", cp1, cp2);
    fflush(stdin);

    char nome[10];
    char nome2[20];
    char nome3[20];

    printf("Insira o nome: ");
    scanf("%s", nome);
    fflush(stdin);

    printf("Nome: %s\n", nome);


    printf("Insira o nome 2: ");
    scanf("%s", nome2);
    fflush(stdin);

    printf("Nome2: %s\n", nome2);


    printf("Insira o nome completo: ");
    fgets(nome3, sizeof(nome3), stdin);

    printf("nome completo: %s\n", nome3);


    return 0;
}