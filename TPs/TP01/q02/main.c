#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

typedef char * String;

   bool isPalindrome(String str) {
        str = tolower(str.replaceAll("[^a-zA-Z]", ""));
        int left = 0;
        int right = strlen(str) - 1;

        while (left < right) {
            if (str[left] != str[right] {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

int main()
{
        String[] inputs = {"radar", "sei", "Ana", "Roma", "Roma e amor"};

        for (String input : inputs) {
            if (isPalindrome(input)) {
                printf("SIM\n");
            } else {
                printf("NAO\n");
            }
        }
}
