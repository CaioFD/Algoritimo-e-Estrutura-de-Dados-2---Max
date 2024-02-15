package LAB1;


import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

 
     class Lab01Q2 {
    public static int ContMaius (String palavra){
        int x, num = 0;
        for(x = 0; x<= palavra.length()-1; x++){
            if (Character.isUpperCase(palavra.charAt(x)) == true) {
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) throws IOException{
        String p = "";
        BufferedReader pubin = new BufferedReader(new FileReader("pub.in.txt"));
        BufferedWriter pubout = new BufferedWriter(new FileWriter("pub.out.txt"));

        while ((p = pubin.readLine()) != null) {
            int num = ContMaius(p);

            if (!p.equals("FIM")) {
                System.out.println(num);
                pubout.append(num+ "\n");
            }
        }
        pubin.close();
        pubout.close();
    }
}

