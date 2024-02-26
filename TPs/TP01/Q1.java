/*
  public class Q1 {

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase(); 
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        
        String[] inputs = {"radar", "sei", "Ana", "Roma", "Roma e amor"};

        for (String input : inputs) {
            if (isPalindrome(input)) {
                System.out.println("SIM");
            } else {
                System.out.println("NAO");
            }
        }
    }
}

 */
 
/*  import java.util.Scanner;

public class Q1 {

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase(); 
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra ou frase:");
        String userInput = scanner.nextLine();

        if (isPalindrome(userInput)) {
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }

        scanner.close();
    }
}*/




