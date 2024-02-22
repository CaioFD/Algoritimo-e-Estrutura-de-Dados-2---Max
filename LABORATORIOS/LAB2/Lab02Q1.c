#include <stdio.h>
#include <string.h>

#define MAX_LEN 100

char* combinarStrings(const char *str1, const char *str2, char *resultado) {
    int comprimentoMinimo = strlen(str1) < strlen(str2) ? strlen(str1) : strlen(str2);
    int i, j = 0;
    
    for (i = 0; i < comprimentoMinimo; i++) {
        resultado[j++] = str1[i];
        resultado[j++] = str2[i];
    }
    
    if (strlen(str1) > strlen(str2)) {
        strcpy(resultado + j, str1 + comprimentoMinimo);
    } else if (strlen(str2) > strlen(str1)) {
        strcpy(resultado + j, str2 + comprimentoMinimo);
    } else {
        resultado[j] = '\0';
    }
    
    return resultado;
}

int main() {
    char str1[MAX_LEN], str2[MAX_LEN], resultado[MAX_LEN * 2];
    
    printf("Digite a primeira string: ");
    fgets(str1, sizeof(str1), stdin);
    str1[strcspn(str1, "\n")] = '\0'; 
    
    printf("Digite a segunda string: ");
    fgets(str2, sizeof(str2), stdin);
    str2[strcspn(str2, "\n")] = '\0'; 
    
    printf("Resultado da combinacao: %s\n", combinarStrings(str1, str2, resultado));
    
    return 0;
}









/*

import java.util.Scanner;

public class Lab02Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a primeira string:");
        String str1 = scanner.nextLine();
        
        System.out.println("Digite a segunda string:");
        String str2 = scanner.nextLine();
        
        String resultado = combinarStrings(str1, str2);
        
        System.out.println("Resultado da combinação: " + resultado);
        
        scanner.close();
    }
    
    public static String combinarStrings(String str1, String str2) {
        StringBuilder resultado = new StringBuilder();
        
        int comprimentoMinimo = Math.min(str1.length(), str2.length());
        
        for (int i = 0; i < comprimentoMinimo; i++) {
            resultado.append(str1.charAt(i));
            resultado.append(str2.charAt(i));
        }
        
        if (str1.length() > str2.length()) {
            resultado.append(str1.substring(comprimentoMinimo));
        } else if (str2.length() > str1.length()) {
            resultado.append(str2.substring(comprimentoMinimo));
        }
        
        return resultado.toString();
    }
}
*/