
public class Q3 {

    public static boolean isFim( String palavra )
    {
        return( palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I' && palavra.charAt(2) == 'M' );
    } // end isfim

    public static String JC(String pala) {
        String temp = "";
        for (int i = 0; i < pala.length(); i++) {
            temp += (char) ((int) pala.charAt(i) + 3);
        }
        return temp;
    } // end cifrar

    public static void main(String[] args) {

        String palavra = "";

        do {

            palavra = MyIO.readLine();
            palavra = JC(palavra);
            System.out.println(palavra);
        
        } while ( !isFim( palavra ) );
    } // end main
} // end class