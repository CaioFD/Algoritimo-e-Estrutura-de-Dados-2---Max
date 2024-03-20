
import java.io.*;
import java.nio.charset.*;

class MyIO {

   private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in, Charset.forName("ISO-8859-1")));
   private static String charset = "ISO-8859-1";

   public static void setCharset(String charset_){
      charset = charset_;
      in = new BufferedReader(new InputStreamReader(System.in, Charset.forName(charset)));
   }

   public static void print(){
   }

   public static void print(int x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }
   
   public static void print(float x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }
   
   public static void print(double x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void print(String x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void print(boolean x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void print(char x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void println(){
   }

   public static void println(int x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void println(float x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }
   
   public static void println(double x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void println(String x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void println(boolean x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void println(char x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.println(x);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static void printf(String formato, double x){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.printf(formato, x);// "%.2f"
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
   }

   public static double readDouble(){
      double d = -1;
      try{
         d = Double.parseDouble(readString().trim().replace(",","."));
      }catch(Exception e){}
      return d;
   }

   public static double readDouble(String str){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
      return readDouble();
   }

   public static float readFloat(){
      return (float) readDouble();
   }

   public static float readFloat(String str){
      return (float) readDouble(str);
   }

   public static int readInt(){
      int i = -1;
      try{
         i = Integer.parseInt(readString().trim());
      }catch(Exception e){}
      return i;
   }

   public static int readInt(String str){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
      return readInt();
   }

   public static String readString(){
      String s = "";
      char tmp;
      try{
         do{
            tmp = (char)in.read();
            if(tmp != '\n' && tmp != ' ' && tmp != 13){
               s += tmp;
            }
         }while(tmp != '\n' && tmp != ' ');
      }catch(IOException ioe){
         System.out.println("lerPalavra: " + ioe.getMessage());
      }
      return s;
   }

   public static String readString(String str){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
      return readString();
   }

   public static String readLine(){
      String s = "";
      char tmp;
      try{
         do{
            tmp = (char)in.read();
            if(tmp != '\n' && tmp != 13){
               s += tmp;
            }
         }while(tmp != '\n');
      }catch(IOException ioe){
         System.out.println("lerPalavra: " + ioe.getMessage());
      }
      return s;
   }

   public static String readLine(String str){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
      return readLine();
   }

   public static char readChar(){
      char resp = ' ';
      try{
         resp  = (char)in.read();
      }catch(Exception e){}
      return resp;
   }

   public static char readChar(String str){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
      return readChar();
   }

   public static boolean readBoolean(){
      boolean resp = false;
      String str = "";

      try{
         str = readString();
      }catch(Exception e){}

      if(str.equals("true") || str.equals("TRUE") || str.equals("t") || str.equals("1") || 
            str.equals("verdadeiro") || str.equals("VERDADEIRO") || str.equals("V")){
         resp = true;
            }

      return resp;
   }

   public static boolean readBoolean(String str){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
      return readBoolean();
   }

   public static void pause(){
      try{
         in.read();
      }catch(Exception e){}
   }

   public static void pause(String str){
      try {
         PrintStream out = new PrintStream(System.out, true, charset);
         out.print(str);
      }catch(UnsupportedEncodingException e){ System.out.println("Erro: charset invalido"); }
      pause();
   }
}


 // função de ordenar INSERÇAO

   private static void InsertionSort( String[] array ) {
      for( int x = 1; x < array.length; x++ ) {
         String temp = array[x];
         int y = x - 1;
         while( (y >= 0) && (array[x].compareTo(temp) > 0) ) {
            array[y + 1] = array[y];
            y--;
         } 
         array[y + 1] = temp;
      } 
   } 


 // função de ordenar SELEÇÃO
   private static void SelectionSort( String[] array )
   {
      for(int i = 0; i<(n-1); i++){
         int menor = i;
         for(int j = (i+1); j<n; j++){
            if (array[menor] > array[j]) {
               menor = j;
            }
         }
         swap(array, menor, i);
      }
   }
            // SWAP
   public static void swap(int[] arr, int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
   }


 // função de ordenar BUBBLE
public static void bubbleSort(int[] array) {
   int n = array.length;
   for (int i = 0; i < n; i++) {
      for (int j = 1; j < n - i; j++) {
         if (array[j-1] > array[j]) {
               int temp = array[j];
               array[j] = array[j-1];
               array[j-1] = temp;
         }
      }
   }
}

 // PESQUISA SEQUENCIAL
public boolean pesquisaSequencial(int[] array, int valor)
{
   for(int i = 0; i<array.length; i++){
      if (array[i] == valor) {
         return true;         
      }
   }
   return false;
}


// PESQUISA BINARIA
public int pesquisaBinaria(int[] array, int valor, int esq, int dir)
{
   int meio = (esq+dir)/2;
   if (esq>dir) {
      return -1;
   }else if(array[meio] == valor){
      return meio;
   }else if(valor < array[meio]){
      return pesquisaBinaria(array, valor, esq, meio-1);
   }else if(valor > array[meio]){
      return pesquisaBinaria(array, valor, meio+1, dir);
   }
   return -1;
}



// Lista
/* 
import java.util.Random;

public class Lista 
{
// ---------------------------------------- atributos

   protected int[] array;     // arranjo
   protected int   size;      // tamanho real
   protected int   capacity;  // capacidade total
public Lista( ) 
{
   this(10); // capacidade padrao de 10
} // end Lista ( );

public Lista( int length ) 
{
   if( length > 0 )
   {
      this.capacity = length+4;
      this.array = new int[this.capacity];
      this.size = length;
    } // end if
} // end Lista ( )

// ---------------------------------------- GETs / SETs

public int getSize( ) 
{
   return ( this.size );
} // end getSize ( )
}

public int getCapacity( ) 
   {
      return ( this.capacity );
    } // end getCapacity ( )

   public void set( int index, int value )
   {
      this.array[index] = value;
    } // end set ( )

   public int get( int index )
   {
      int value = 0;
      if( index >= 0 && index < size )
      {
            value = this.array[index];
        } // end if
      return ( value );
    } // end get ( )

    // ----------------------------------------  Outros Metodos
   private void increaseCapacity( ) 
   {
        int newCapacity = capacity * 2; // Aumenta em 50%
      int[] newArray = new int[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size); // Copia os elementos para o novo array
        System.arraycopy(newArray, 0, array, 0, size); // Copia os elementos para o novo array
      array = newArray;
      capacity = newCapacity;
    } // end increaseCapacity ( )

   public void add( int value ) 
   {
      if( size >= capacity ) 
      {
            increaseCapacity( ); // Aumenta a capacidade se necessário
        } // end if
      array[size++] = value;
    } // end add ( )

   public void randValue( ) 
   {
      Random gerador = new Random( );
      for( int x = 0; x < size; x = x + 1 )
      {
            array[x] = Math.abs( gerador.nextInt( ) % 50 );
        } // end for
    } // end randValue ( )

   public void printLista( )
   {
      System.out.print( "[ " );
      for( int x = 0; x < size; x = x + 1 )
      {
            System.out.print( array[x] + " " );
        } // end for
      System.out.println( "]" );
    } // end printLista ( )

*/

 //REMOVER INICIO
public int RemoverInicio()
{
   int valor = 0;
   if(size > 0){
      valor = array[0];
      for(int x = 1; x < size; x++){
         array[x-1] = array[x];
      }//end for
      size--;
   }//end if
   return (valor);
}//end program


 //REMOVER FIM
public int RemoverFim()
{
   int valor = 0;
   if(size > 0){
      valor = array[size-1];
      size--;
   }//end if
   return (valor);
}//end program


 // INSERIR INICIO
public void InserirInicio(int valor)
{
if (size < capacidade) {
   for(int x = size-1; x>=0; x--){
      array[x+1] = array[x];
   }//end for
   array[0] = valor;
   size++;
   }//end if
}//end program 


 //INSERIR FIM
public void InserirFim(int valor)
{
   if (size < capacidade) {
      array[size] = valor;
      size++;
   }else{
      aumentarCapacidade();
      size++;
   }
}
