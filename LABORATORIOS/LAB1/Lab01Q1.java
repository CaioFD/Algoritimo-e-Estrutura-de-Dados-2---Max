package LAB1;


import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;


     class Lab01Q2 {
    public static int ContMaius (String palavra){
      
    }

    public static void main(String[] args) throws IOException{
        String p = "";
        BufferedReader pubin = new BufferedReader(new FileReader("pub.in.txt"));
        BufferedWriter pubout = new BufferedWriter(new FileWriter("pub.out.txt"));

        while ((p = pubin.readLine()) != null) {
            int num = ContMaius(p,0,0);

            if (!p.equals("FIM")) {
                System.out.println(num);
                pubout.append(num+ "\n");
            }
        }
        pubin.close();
        pubout.close();
    }
}

