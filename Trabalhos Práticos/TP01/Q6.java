import java.util.Scanner;

public class Q6 {
    public static boolean contemSomenteVogais(String str) {
        str = str.toLowerCase(); // Converte a string para minúsculas
        return str.matches("[aeiou]+");
    }

    public static boolean contemSomenteConsoantes(String str) {
        str = str.toLowerCase(); // Converte a string para minúsculas
        return str.matches("[bcdfghjklmnpqrstvwxyz]+");
    }

    public static boolean ehNumeroInteiro(String str) {
        return str.matches("-?\\d+");
    }

    public static boolean ehNumeroReal(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String entrada = scanner.nextLine();

            if (entrada.equals("FIM")) {
                break;
            }

            boolean vogais = contemSomenteVogais(entrada);
            boolean consoantes = contemSomenteConsoantes(entrada);
            boolean inteiro = ehNumeroInteiro(entrada);
            boolean real = ehNumeroReal(entrada);

            System.out.println((vogais ? "SIM" : "NAO") + " " +
                               (consoantes ? "SIM" : "NAO") + " " +
                               (inteiro ? "SIM" : "NAO") + " " +
                               (real ? "SIM" : "NAO"));
        }

        scanner.close();
    }
}