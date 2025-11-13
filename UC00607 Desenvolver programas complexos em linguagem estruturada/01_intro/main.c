#include <stdio.h>

/*
 * tipos de dados - done
 *      int     - num int
 *      char    - letra
 *      float   - num decimal 7cd
 *      double  - num decimal 12 a 14cd
 * var - done
 * op com var - done
 * in/out -> num - done
 * if
 */


/*
 *
 * comt multi linha
 *
 */

// cmt 1 linha


int main(void) {

    // tipo nome;
    // tipo nome = valor;

    int idade = 30, ano = 2025;
    int num = 122;
    float maior = 10.31;
    double menor = 10.421;
    char letra = 'a';

    printf("a idade d é: %d\n", idade);
    printf("a idade i é: %i\n", idade);

    printf("o maior : %f\n", maior);
    printf("o maior : %.2f\n", maior);

    printf("o letra %c\n", letra);

    printf("o menor %f\n", menor);
    printf("o menor %lf\n", menor);


    // op com var num

    int soma = 1 + 4;
    printf("a soma é: %d\n", soma);

    int num1 = 10;
    int num2 = 20;

    int soma1 = num1 + num2;

    printf("%d + %d = %d\n", num1, num2, soma1);


    float num3 = 10.0;

    float div = num3 / num2;
    printf("%d / %d = %f\n", num1, num2, div);

    printf("-------- in --------\n");


    int novoNum;

    printf("Digite um num: ");
    scanf("%d", &novoNum);
    printf("num = %i\n", novoNum);

    /*
     * 0 1 2 3 4 5 6 7 8 9 <- decimal -> 10 symb
     * 0 1 2 3 4 5 6 7 <- octal
     * 0 1 <- bin - 2
     * 0 1 2 3 4 5 6 7 8 9 a b c d e f -> hexa - 16 symb
     *
     *
     *
     */
    printf("Digite um hexa: ");
    scanf("%i", &novoNum);
    printf("num = %d\n", novoNum);


    printf("Digite um octal: ");
    scanf("%i", &novoNum);
    printf("num = %d\n", novoNum);


    printf("Digite um octal (d): ");
    scanf("%d", &novoNum);
    printf("num = %d\n", novoNum);


    soma = 1233;

    printf("Nova Soma = %d\n", soma);


    int novoInt = 10;
    float novoFloat = (float)novoInt;
    int novoInt2 = 31;

    double novaDiv = (double)novoInt/novoInt2;

    //printf("Nova Int = %d\n", novaDiv);
    printf("Nova Int = %f\n", novaDiv);

    printf("char = %c\n", 97);


    const int novaIdade = 10;
    printf("Nova Idade = %d\n", novaIdade);

    // novaIdade = 41; <- se novaIdade -> const nao pode mudar
    printf("Nova Idade = %d\n", novaIdade);

    printf("----------------------------\n");

    idade = 18;

    printf("Digite a idade: " );
    scanf("%i", &idade);


    /*
     * <
     * >
     * <=
     * >=
     * ==
     * !=
     */


    /*
     *
     *  == vs =
     *
     */
    if (idade < 18) {
        printf("menor");
    }else {
        printf("Adulto");
    }

    /*
     * >= 18 - Adulto
     * > 12 e  < 17 - teen
     * <12 - crinaça
     *
     */

    printf("---------------------\n");
    printf("Digite a idade: " );
    scanf("%i", &idade);

    if (idade >= 18) {
        printf("Adulto");
    }else if (idade > 12) {
        printf("Teen");
    }else {
        printf("Crinaça");
    }

    /*
    if (idade >= 18)
        printf("Adulto");
    else if (idade > 12)
        printf("Teen");
    else
        printf("Crinaça");
    */

    printf("----------------------------------\n");
    printf("Digite a idade: " );
    scanf("%i", &idade);

    if (idade >= 18)
        printf("Adulto");

    printf("---------- switch case-----------\n");

    int mes = 10;
    switch (mes) {
        case 1:
            printf("Mes 1\n");
            break;
        case 2:
            printf("Mes 2\n");
            break;
        case 3:
            printf("Mes 3\n");
            break;
        default:
            printf("Mes invalido\n");
    }


    return 0;
}