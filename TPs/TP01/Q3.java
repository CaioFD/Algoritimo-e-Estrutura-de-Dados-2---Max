// package TPs.TP01;

/**
 * Q3
 */
/* 
public class Q3 {
    public static String JC(String palavra){
        String temporaria = "";
        for(int i= 0; i < palavra.length(); i++){
            temporaria += (char) ((int) palavra.charAt(i)+3);
        }
        return temporaria;
     }
    public static void main(String[] args) {
        while (true) {
            String palavra = "";
            palavra = MyIO.readLine();
            if (palavra.charAt(0)== 'F' && palavra.charAt(1)== 'I' && palavra.charAt(2)== 'M') {
                System.exit(0);
            }else{
                palavra = JC(palavra);
                MyIO.println(palavra);
            }
        }
    }
}
*/
// import java.util.Scanner;

public class Q3 {

    public static boolean isFim( String s )
    {
        return( s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M' );
    } // end isfim

    public static String cifrar(String pala) {
        String temp = "";
        for (int i = 0; i < pala.length(); i++) {
            temp += (char) ((int) pala.charAt(i) + 3);
        }
        return temp;
    } // end cifrar

    public static void main(String[] args) {

        String s = "";

        do {

            s = MyIO.readLine();
            s = cifrar(s);
            System.out.println(s);
        
        } while ( !isFim( s ) );
    } // end main
} // end class