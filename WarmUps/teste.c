#include <stdio.h>
#include <stdlib.h>

int main() {
    int num1, num2;
    char *caractere1 = (char*) malloc(50 * sizeof(char));
    char *caractere2 = (char*) malloc(50 * sizeof(char));

    printf("Digite um numero para multiplicar: ");
    scanf("%d", &num1);

    printf("Digite um caractere para: ");
    scanf(" %s", caractere1);
    getchar();

    for (int i = 0; i < num1; i++) {
        printf("%s", caractere1);
    }
    printf("\n");

    printf("Digite outro numero para multiplicar: ");
    scanf("%d", &num2);

    printf("Digite outro caractere para: ");
    scanf(" %s", caractere2);
    getchar();

    for (int i = 0; i < num2; i++) {
        printf("%s", caractere2);
    }
    printf("\n");

    return 0;
}
