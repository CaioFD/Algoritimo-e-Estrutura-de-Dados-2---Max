#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

#define MAX_LENGTH 100

typedef char* String;

int maiusculo(String palavra) {
    int num = 0;
    for (int x = 0; x< strlen(palavra); x++) {
        if (isupper(palavra[x])) {
            num++;
        }
    }
    return num;
}

int main() {
    String p = (String)malloc(sizeof(char) * MAX_LENGTH);
    if (p == NULL) {
        printf("Erro de alocação de memória\n");
        return 1;
    }

    FILE* arq = fopen("pub.in.txt", "r");
    FILE* arqout = fopen("pub.out.txt", "w");
    if (arq == NULL || arqout == NULL) {
        printf("Erro ao abrir os arquivos\n");
        free(p);
        return 1;
    }

    while (fgets(p, MAX_LENGTH, arq) != NULL) {
        p[strcspn(p, "\n")] = '\0';

        if (strcmp(p, "FIM") == 0) {
            break;
        }

        int num = maiusculo(p);
        printf("%d\n", num);
        fprintf(arqout, "%d\n", num);
    }

    fclose(arq);
    fclose(arqout);
    free(p);
    return 0;
}
