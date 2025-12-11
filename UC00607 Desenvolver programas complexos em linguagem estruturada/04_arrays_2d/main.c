#include <stdio.h>
/*
 *
 * arrays 2D
 * Strings 1.0
 * funcs
 *
 */
int main(void) {


    int lista[3] = {1,2,3};

    int lista2[] = {21,22,23};

    printf("%d\n", lista[0]);
    printf("%d\n", lista2[0]);

    int mtx[3][3] = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };

    // mostrar o 5

    printf("%d\n", mtx[1][1]);

    mtx[1][1] = 99;

    printf("%d\n", mtx[1][1]);

    // mostre todos os valores do array mtx (use loops)

    for (int linha = 0; linha < 3; linha++) {
        for (int coluna = 0; coluna < 3; coluna++) {
            printf("%d", mtx[linha][coluna]);
        }
        printf("\n");
    }

    return 0;
}