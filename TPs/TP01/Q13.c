#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

char *trocando(char *string, char PL, char SL) {
  int tam = strlen(string);

  for (int i = 0; i < tam; i++) {
    char aux = string[i];
    if (aux == PL) {
      string[i] = SL;
    } else {
      string[i] = aux;
    }
  }

  return string;
}

int main() {
  char string[500];
  char primeiraLetra;
  char segundaLetra;

  while (1) {
    scanf(" %[^\n]", string);
    if (strcmp(string, "FIM") == 0) {
      break;
    }

    srand(time(NULL));
    primeiraLetra = (char)(rand() % (122 - 97 + 1) + 97);
    segundaLetra = (char)(rand() % (122 - 97 + 1) + 97);

    trocando(string, primeiraLetra, segundaLetra);
    printf("%s\n", string);
  }

  return 0;
}