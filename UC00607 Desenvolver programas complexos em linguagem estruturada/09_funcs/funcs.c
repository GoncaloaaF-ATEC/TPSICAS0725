//
// Created by Gonçalo Feliciano on 17/12/2025.
//

#include <stdio.h>
#include "funcs.h"
#include "varGlobais.h"


void nome() {
    printf("Ola Mundo\n");
    contador++;
}

int anoCurr() {
    contador++;
    return 2025;
}

int soma(int a, int b) {
    contador++;
    return a + b;
}
