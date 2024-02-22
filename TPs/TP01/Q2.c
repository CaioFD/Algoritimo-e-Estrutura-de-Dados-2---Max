#include <stdio.h>
#include <string.h>
#include <ctype.h>

int isPalindrome(char *str) {
    int left = 0, right = strlen(str) - 1;

    while (left < right) {
        if (tolower(str[left]) != tolower(str[right])) {
            return 0;
        }
        left++;
        right--;
    }
    return 1;
}

int main() {
    char *inputs[] = {"radar", "sei", "Ana", "Roma", "Roma e amor"};
    int num_inputs = sizeof(inputs) / sizeof(inputs[0]);

    for (int i = 0; i < num_inputs; i++) {
        if (isPalindrome(inputs[i])) {
            printf("SIM\n");
        } else {
            printf("NAO\n");
        }
    }

    return 0;
}
