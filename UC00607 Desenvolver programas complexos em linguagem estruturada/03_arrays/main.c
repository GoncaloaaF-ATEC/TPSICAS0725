#include <stdio.h>

int main(void) {

    int idades[] = {
        18,   12,  17, 14,  21
    };
                //  0x1, 0x2, 0x3, 0x4, 0x5
            // idx   0     1    2   3   4
    printf("Idades: %d\n", idades[0]);
    printf("Idades: %d\n", idades[1]);
    printf("Idades: %d\n", idades[2]);
    printf("Idades: %d\n", idades[3]);
    printf("Idades: %d\n", idades[4]);

    idades[4] = 31;

    printf("Idades: %d\n", idades[4]);

    int idades2[5];

    idades2[4] = 90;
    printf("Idades2: %d\n", idades2[0]);
    printf("Idades2: %d\n", idades2[1]);
    printf("Idades2: %d\n", idades2[2]);
    printf("Idades2: %d\n", idades2[3]);
    printf("Idades2: %d\n", idades2[4]);

    //idades2[99] = 50;
    //printf("Idades2: %d\n", idades2[99]);


    printf("---loop Idade v1---");
    int idades3[] = {
        18,   12,  17, 14,  21
    };

    int idades3_size = 5;

    for (int i = 0; i < idades3_size; i++) {
        printf("Idades3: %d\n", idades3[i]);
    }

    printf("---loop Idade v1---\n");
    int idades4[] = {
        18,   12,  17, 14,  21,
        18,   12,  17, 14,  21,
        18,   12,  17, 14,  21,
        18,   12,  17, 14,  21,
        18,   12,  17, 14,  21,
        18,   12,  17, 14,  21
    };

    printf("size %lu\n", sizeof(idades4) / sizeof(idades4[0]));
    int idades4_size = sizeof(idades4) / sizeof(idades4[0]);

    for (int i = 0; i < idades4_size; i++) {
      printf("Idades3: %d\n", idades4[i]);
  }



    int idades5[214748];
    idades5[0] = 90;
    printf("size %lu\n", sizeof(idades5));



    return 0;
}


