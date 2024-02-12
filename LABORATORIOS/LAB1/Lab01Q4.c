#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

typedef char* String;

int maiusculo(String palavra, int x, int num){
    if(isupper(palavra[x])){
        num++;
    }
    if (x >= strlen(palavra)){
        return num;
    }
    maiusculo (palavra, x+1, num);
}

int main(){
    String p = (String)malloc(sizeof(char) * 100);
    FILE* arq = fopen("pub.in.txt", "r");
    FILE* arqout = fopen("pub.out.txt", "w");
    if (arq == NULL) {
        printf("Erro ao abrir o arquivo\n");
        return 1;
    }
    fseek(arq, 0, SEEK_SET);
    while(strcmp(p, "FIM") != 0){
        fscanf(arq, "%[^\n]", p);
        fgetc(arq);

        int num = maiusculo(p, 0, 0);


        if (strcmp(p, "FIM") != 0){
            printf("%d\n", num);
            fprintf(arqout, "%d\n", num);
        }
    }
    fclose(arq);
    free(p);
    return 0;
}
