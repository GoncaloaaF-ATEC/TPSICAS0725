#include <stdio.h>

int main(void) {
    int i = 10;

    int *i_ptr;  // não devem ter ptr sem valor
    int* i_ptr2; // não devem ter ptr sem valor
    // int i_ptr3*;

    int *novo_ptr = &i;  // * -> usado para criar o ptr
    // & -> usado aceder ao endereço de memoria onde esta a var

    printf("%d\n", i);
    printf("%d\n", novo_ptr); // devolve lixo <- não fazer
    printf("%d\n", *novo_ptr); // * esta a dereference a ptr

    printf("%p\n", novo_ptr); // devolve lixo <- não fazer


    int i2 = *novo_ptr;
    printf("%d\n", i2);

    i2 = 20;
    printf("%d\n", i2);
    printf("%d\n", i);
    printf("%d\n", *novo_ptr);

    /*
     *
     *
     *   arr[2] -> pos 0 -> desloca 2
     *
     */

    printf("-------------------------\n\n");
    int novoInt = 10;
    int *novoInt_ptr = &novoInt;

    char novoChar = 'a';
    char *novoChar_ptr = &novoChar;

    printf("%zu\n", sizeof(novoInt));
    printf("%zu\n", sizeof(novoInt_ptr));
    printf("---\n");
    printf("%zu\n", sizeof(novoChar));
    printf("%zu\n", sizeof(novoChar_ptr));


    char novoChar2[10] = "Ola mundo";

    printf("%zu\n", sizeof(novoChar2));


    char *novoChar3 = novoChar2;

    printf("%zu\n", sizeof(novoChar3));

    // int *num <- endereço de memoria de um int
    // int num  <- um int


    // 1830743576
    // 1799220760
    // 1806413336

    int *novoInt_ptr2 = 0;

    printf("%zu\n", sizeof(novoInt_ptr2));

    printf("1 - %d\n", novoInt_ptr2);
    printf("2 - %p\n", novoInt_ptr2);

    printf("-------------------------------------\n");

    int n = 10;
    float nf = (float)n;


    void *novoPtr; // sem tipo definido e pode fazer cast para qq tipo

    int x1 = 123;

    novoPtr = &x1;

    printf("%zu\n", sizeof(novoPtr));

    printf("void   - %p\n", novoPtr);
    printf("(int*) - %p\n", (int *)novoPtr);

    printf("(int*) - %d\n", * (int *)novoPtr);

    float f = 3.14f;

    novoPtr = &f;

    printf("f - void     - %p\n", novoPtr);
    printf("f - (float*) - %p\n", (float *)novoPtr);
    printf("f - (float*) - %.2f\n", *(float *)novoPtr); //qd fazem o cast devem garantir que o tipo e valido

    printf("f - void     - %d\n", novoPtr);
    printf("f - void     - %p\n", novoPtr);


    /*
     * %d
     * %i
     * %f
     * %s
     * %c
     * %p
     * %zu
     *
     */


    int *nullPtr = NULL;
    printf("size nullPtr - %zu\n", sizeof(nullPtr));
    printf("size nullPtr - %p\n", nullPtr);
    int x3 = 12;

    nullPtr = &x3;
    printf("size nullPtr - %p\n", nullPtr);
    if (nullPtr == NULL) {
        printf("null pointer");
    }else {
        printf("%d\n", *nullPtr);
    }

    nullPtr = NULL;

    if (!nullPtr) {
        printf("null pointer");
    }else
    {
        printf("%d\n", *nullPtr);
    }

    return 0;
}