#include <stdio.h>

int main(void) {

    char ch = 'l';

    printf("%c\n", ch);


    char nome[] = "Gonçalo";
    printf("%s\n", nome);

    // idx max = 6
    char nome2[8] = "Goncalo";
    printf("%s\n", nome2);

    char nome3[8] = {'G','o','n', 'c','a','l','o'};
    printf("%s\n", nome3);

    char nome4[] = "Gonçalo";
    printf("%c\n", nome4[0]);

    nome4[0] = 'F';
    printf("%s\n", nome4);





    return 0;
}