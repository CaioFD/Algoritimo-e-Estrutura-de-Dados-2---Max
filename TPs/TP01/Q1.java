package TPs.TP01;
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
