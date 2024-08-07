/*
 *  //--------- Documentação ---------//
 *  
 *  TP02Q01 - 27 / 04 / 2024
 *  Author: Caio Faria Diniz
 *  
*/


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.time.format.DateTimeFormatter;

/**
 *  Classe Log : Analise de Complexidade
 */
class Log{
    protected int comparacoes;
    protected int movimentacoes;
    protected double tempo;
    protected String fileName;
    
    Log( ) {
        this.comparacoes = -1;
        this.movimentacoes = -1;
        this.tempo = -1.0; 
        this.fileName = null;
    }

    Log( String fileName )
    {
        this.comparacoes = -1;
        this.movimentacoes = -1;
        this.tempo = -1.0; 
        this.fileName = fileName;
    }

    int getComp ( ) 
    { 
        return( this.comparacoes ); 
    }

    int getMov ( ) 
    { 
        return( this.movimentacoes ); 
    }

    double getTime ( ) 
    { 
        return( this.tempo ); 
    }
    
    void setComp ( int comp ) 
    { 
        this.comparacoes = comp; 
    }

    void setMov ( int mov ) 
    { 
        this.movimentacoes = mov ; 
    }

    void   setTime ( double time ) 
    { 
        this.tempo = time; 
    }

    public void incrementarComp( )
    { 
        this.comparacoes++ ; 
    }

    public void incrementarMov( ) 
    { 
        this.movimentacoes++; 
    }

    public void registro( )
    {
        try {
            FileWriter writer = new FileWriter(this.fileName);
            writer.write( "793605\t" + "Comparacoes: "+getComp()+"\t" + "Movimentacoes: "+getMov()+"\t" 
            + "Tempo de Execucao (ms): "+getTime()+"\n" );
            writer.close();
        }  
        catch( Exception e ) {
            System.out.println("Erro ao escrever o log no arquivo: " + e.getMessage());
        }
    }
}
/**
 *  Classe Personagem : Modelo Personagem de Harry Potter
 */
class Personagem 
{

    //-------Atributos-------//

    
    private String    id  ; 
    private String    name  ; 
    private String[]  alternateNames  ; 
    private String    house ; 
    private String    ancestry ; 
    private String    species ; 
    private String    patronus ; 
    private Boolean   hogwartsStaff ;  
    private Boolean   hogwartsStudent ;  
    private String    actorName ; 
    private Boolean   alive ;
    private String[]  alternateActors ;
    private LocalDate dateOfBirth ; 
    private int       yearOfBirth ; 
    private String    eyeColour  ; 
    private String    gender ; 
    private String    hairColour  ; 
    private Boolean   wizard  ; 

    // ---------------------------------- Construtores

    /**
     *  Construtor Padrao.
     *  Inicializando todos os atributos com "0".
     */
    Personagem ( )
    {
        this.id  = "" ;              
        this.name  = "" ;            
        this.alternateNames  = null  ; 
        this.house  = "" ;           
        this.ancestry  = ""  ;        
        this.species  = "" ;         
        this.patronus  = "" ;        
        this.hogwartsStaff   = false ;   
        this.hogwartsStudent = false ; 
        this.actorName = "" ;       
        this.alive  = false ;
        this.alternateActors = null ;           
        this.dateOfBirth = LocalDate.of(-1, 1, 1);
        this.yearOfBirth = -1 ;     
        this.eyeColour  = "" ;       
        this.gender = "" ;          
        this.hairColour = "" ;      
        this.wizard   = false ;          
    } 

    /**
     *  Construtor Alternativo.
     *  Inicializando todos os atributos com os valores passados.
     */
    Personagem ( String    id         , String  name         , String[]  alternateNames , 
                 String    house      , String  ancestry     , String    species        , 
                 String    patronus   , Boolean hogwartsStaff, Boolean   hogwartsStudent, 
                 String    actorName  , Boolean alive        , String[]  alternateActors,
                 LocalDate dateOfBirth, int     yearOfBirth  , String    eyeColour      , 
                 String    gender     , String  hairColour   , Boolean   wizard )
    {
        this.id              = id              ;
        this.name            = name            ;
        this.alternateNames  = alternateNames  ;
        this.house           = house           ;
        this.ancestry        = ancestry        ;
        this.species         = species         ;
        this.patronus        = patronus        ;
        this.hogwartsStaff   = hogwartsStaff   ;
        this.hogwartsStudent = hogwartsStudent ;
        this.actorName       = actorName       ;
        this.alive           = alive           ;
        this.alternateActors = alternateActors ;
        this.dateOfBirth     = dateOfBirth     ;
        this.yearOfBirth     = yearOfBirth     ;
        this.eyeColour       = eyeColour       ;
        this.gender          = gender          ;
        this.hairColour      = hairColour      ;
        this.wizard          = wizard          ;
    } // end Personagem ( )

    //--------- GET ---------//

    public String getId( ) 
    { 
        return ( this.id );
    }

    public String getName( ) 
    { 
        return ( this.name); 
    }

    public String[] getAlternateNames  ( ) 
    { 
        return ( this.alternateNames ); 
    }

    public String[] getAlternateActors  ( ) 
    { 
        return ( this.alternateActors ); 
    }

    public String getHouse( ) 
    { 
        return ( this.house ); 
    }

    public String getAncestry( ) 
    { 
        return ( this.ancestry ); 
    }

    public String getSpecies( ) 
    { 
        return ( this.species ); 
    }

    public String getPatronus( ) 
    { 
        return ( this.patronus ); 
    }

    public Boolean getHogwartsStaff( ) 
    { 
        return ( this.hogwartsStaff ); 
    }

    public Boolean getHogwartsStudent( ) 
    {
        return ( this.hogwartsStudent ); 
    }

    public String getActorName( ) 
    { 
        return ( this.actorName ); 
    }

    public Boolean getAlive( ) 
    { 
        return ( this.alive ); 
    }

    public LocalDate getDateOfBirth( ) 
    { 
        return ( this.dateOfBirth ); 
    }

    public int getYearOfBirth( ) 
    { 
        return ( this.yearOfBirth ); 
    }

    public String getEyeColour( ) 
    { 
        return ( this.eyeColour ); 
    }

    public String getGender( ) 
    { 
        return ( this.gender ); 
    }

    public String getHairColour( ) 
    { 
        return ( this.hairColour ); 
    }

    public Boolean getWizard( ) 
    { 
        return ( this.wizard ); 
    }

    
   //--------- SET ---------//
    

    public void setId( String id ) 
    { 
        this.id = id ; 
    }

    public void setName( String name ) 
    { 
        this.name = name ; 
    }

    public void setAlternateNames( String[] alternateNames ) 
    { 
        this.alternateNames  = alternateNames ; 
    }

    public void setAlternateActors( String[] alternateActors ) 
    { 
        this.alternateActors  = alternateActors ; 
    }

    public void setHouse( String house )
    {
        this.house  = house ; 
    }

    public void setAncestry( String ancestry ) 
    { 
        this.ancestry = ancestry ; 
    }

    public void setSpecies( String species ) 
    {
        this.species  = species  ; 
    }

    public void setPatronus( String patronus ) 
    { 
        this.patronus = patronus ; 
    }

    public void setHogwartsStaff( Boolean hogwartsStaff ) 
    { 
        this.hogwartsStaff  = hogwartsStaff ; 
    }

    public void setHogwartsStudent( Boolean hogwartsStudent ) 
    { 
        this.hogwartsStudent = hogwartsStudent ; 
    }
    
    public void setActorName( String actorName ) 
    { 
        this.actorName = actorName ; 
    }

    public void setAlive( Boolean alive ) 
    {
        this.alive  = alive ; 
    }

    public void setDateOfBirth( LocalDate dateOfBirth ) 
    { 
        this.dateOfBirth = dateOfBirth ; 
    }

    public void setYearOfBirth( int YearOfBirth ) 
    { 
        this.yearOfBirth  = yearOfBirth ; 
    }
    
    public void setEyeColour( String eyeColour ) 
    { 
        this.eyeColour = eyeColour ; 
    }

    public void setGender( String gender ) 
    { 
        this.gender = gender ; 
    }

    public void setHairColour( String hairColour ) 
    { 
        this.hairColour = hairColour ; 
    }

    public void setWizard( Boolean wizard ) 
    { 
        this.wizard = wizard ; 
    }
    
    public void set(String    id         , String  name         , String[] alternateNames , 
    String    house      , String  ancestry     , String   species        , 
    String    patronus   , Boolean hogwartsStaff, Boolean  hogwartsStudent, 
    String    actorName  , Boolean alive        , String[] alternateActors,
    LocalDate dateOfBirth, int     yearOfBirth  , String   eyeColour      , 
    String    gender     , String  hairColour   , Boolean  wizard)
{
setId              ( id );
setName            ( name );
setAlternateNames  ( alternateNames );
setHouse           ( house );
setAncestry        ( ancestry );
setSpecies         ( species );
setPatronus        ( patronus );
setHogwartsStaff   ( hogwartsStaff );
setHogwartsStudent ( hogwartsStudent );
setActorName       ( actorName );
setAlive           ( alive );
setAlternateActors ( alternateActors );
setDateOfBirth     ( dateOfBirth );
setYearOfBirth     ( yearOfBirth );
setEyeColour       ( eyeColour );
setGender          ( gender );
setHairColour      ( hairColour );
setWizard          ( wizard );
} //end


    // ---------------------------------- Metodos Úteis

    public String[] tratamentoArrayString ( String str ) 
    {  
        String [] array = null;
        if( str == null ) {
            array = null;
        }
        else
        {
            String tratada = "";
            for( int x = 0; x < str.length( ); x = x + 1 )
            {
                if( str.charAt(x) == '[' ) {
                    tratada = tratada + '{';
                } else if( str.charAt(x) == ']' ) {
                    tratada = tratada + '}';
                } else if ( str.charAt(x) == '\'' ) {
                    tratada = tratada + "";
                } else {
                    tratada = tratada + str.charAt(x);
                } // end if
            } // end for
            array = tratada.split( "," );
        } // end if
        return ( array );
    } // tratamentoArrayString ( )

    public LocalDate tratamentoDate ( String str ) 
    {        
        return ( LocalDate.parse( str, DateTimeFormatter.ofPattern("dd-M-yyyy") ) );
    } // end tratamentoDate ( )

    public Boolean tratamentoBool( String str )
    {
        if( str.equals("VERDADEIRO") || str.equals("true") || str.equals("1") )
            return ( true );
        else
            return ( false );
    } // tratamentoBool ( )

    public int tratamentoInt( String str ) {
        return ( Integer.parseInt( str ) );
    } // tratamentoInt ( )

    public String altNamesToString ( ) 
    {
        String result = "";
        if( alternateNames == null ) {
            result = "{}";
        }
        else
        {
            for( int x = 0; x < this.alternateNames.length; x++ )
            {
                if( x < this.alternateNames.length-1 ) {
                    result = result + this.alternateNames[x] + ",";
                }
                else {        
                    result = result + this.alternateNames[x];
                }
            } // end for
        } // end if
        return( result );
    } // end altNamesToString ( )

    public String dateBirthToString ( )
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = this.dateOfBirth.format(formatter);
        return ( date );
    } // end dateBirthToString ( )
    
    // ---------------------------------- Metodos Gerais

    public static boolean isFim( String s )
    {
        boolean result = false;
        if( s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M' )
        {
            result = true;
        } // end if
        return ( result );
    } // end isFim ( )

    /**
     *  Metodo para retornar os atributos de um objeto em forma de string. 
     */
    @Override
    public String toString( ) 
    {
        String toString = "";
        toString =  getId         ( ) + " ## " + getName         ( ) + " ## " + altNamesToString  ( ) + " ## " + 
                    getHouse      ( ) + " ## " + getAncestry     ( ) + " ## " + getSpecies        ( ) + " ## " + 
                    getPatronus   ( ) + " ## " + getHogwartsStaff( ) + " ## " + getHogwartsStudent( ) + " ## " + 
                    getActorName  ( ) + " ## " + getAlive        ( ) + " ## " + dateBirthToString ( ) + " ## " + 
                    getYearOfBirth( ) + " ## " + getEyeColour    ( ) + " ## " + getGender         ( ) + " ## " + 
                    getHairColour ( ) + " ## " + getWizard       ( ); 
		return ( toString );
	} // end toString ( )

    /**
     *  Metodo para clonar o personagem.
     *  @return Clone do Personagem.
     */
    public Personagem clone ( )
    {
        Personagem clone = new Personagem( );
        clone.setId             ( getId              ( ) );       
        clone.setName           ( getName            ( ) );         
        clone.setAlternateNames ( getAlternateNames  ( ) );  
        clone.setHouse          ( getHouse           ( ) );           
        clone.setAncestry       ( getAncestry        ( ) );        
        clone.setSpecies        ( getSpecies         ( ) );         
        clone.setPatronus       ( getPatronus        ( ) );        
        clone.setHogwartsStaff  ( getHogwartsStaff   ( ) );   
        clone.setHogwartsStudent( getHogwartsStudent ( ) );
        clone.setActorName      ( getActorName       ( ) );       
        clone.setAlive          ( getAlive           ( ) );           
        clone.setDateOfBirth    ( getDateOfBirth     ( ) );     
        clone.setYearOfBirth    ( getYearOfBirth     ( ) );     
        clone.setEyeColour      ( getEyeColour       ( ) );       
        clone.setGender         ( getGender          ( ) );          
        clone.setHairColour     ( getHairColour      ( ) );      
        clone.setWizard         ( getWizard          ( ) );
        return ( clone );
    } // clone ( )

    /**
     *  Metodo para imprimir personagem.
     */
    public void imprimir ( )
    {
        System.out.println( "[" + toString( ) + "]" );
    } // end imprimir ( )

    /**
     *  Metodo para ler atributos dos personagem do arquivo.
     */
    public Personagem ler ( String id )
    {
        Personagem perso = new Personagem( );
        String path = "/tmp/characters.csv";

        try 
        { 
            File file = new File( path );
            Scanner scan = new Scanner( file );
            
            scan.nextLine( ); // Ignorar o cabeçalho do arquivo
            
            boolean found = false;
            while( scan.hasNextLine() && !found )
            {
                String input = scan.nextLine( );
                if( id.equals( input.substring( 0, input.indexOf( ";" ) ) ) )
                {
                    found = true;
                    String [] atributos = input.split( ";" );
                    perso.set(  atributos[0], atributos[1], tratamentoArrayString(atributos[2]),
                                atributos[3], atributos[4], atributos[5], atributos[6],
                                tratamentoBool(atributos[7]), tratamentoBool(atributos[8]), atributos[9], 
                                tratamentoBool(atributos[10]), tratamentoArrayString(atributos[11]),
                                tratamentoDate(atributos[12]) , tratamentoInt(atributos[13]),
                                atributos[14],atributos[15], atributos[16], tratamentoBool(atributos[17])  );
                } // end if
            } // end while

            if( !found ) {
                System.out.println( "Character Not Found." );
            } // end if

            scan.close( );
        } // end try
        catch( FileNotFoundException e ) {
            System.out.println( "ERROR: File Not Found." );
        } // end catch
        return ( perso );
    } // end ler ( )

    public static void swap( int i, int j, List<Personagem> perso, Log log ) 
    {
        Personagem temp = perso.get(i);
        perso.set( i, perso.get(j) );
        perso.set( j, temp );
        log.incrementarMov(); log.incrementarMov(); log.incrementarMov();
    } // end swap ( )

    public static void sortByName( List<Personagem> perso, Log log )
    {
        int n = perso.size( );
        for( int i = 0; i < n; i = i + 1 )
        {
            int menor = i;
            for( int j = i + 1; j < n; j = j + 1 )
            {
                if( perso.get(menor).getActorName( ).equals( perso.get(j).getActorName( ) ) && 
                    perso.get(menor).getName().compareTo(perso.get(j).getName()) > 0 ) {
                    menor = j;
                    log.incrementarComp( );
                } // end if
            } // end for
            swap(menor, i, perso, log);
        } // end for
    } // end sortByName ( )

    public static void intercalar( int esq, int meio, int dir, List<Personagem> perso, Log log ) 
    {
        int n1 = meio - esq+1;
        int n2 = dir  - meio;
    
        List<Personagem> L = new ArrayList<>(n1);
        List<Personagem> R = new ArrayList<>(n2);
    
        for( int i = 0; i < n1; i = i + 1 ) {
            L.add( perso.get(esq+i) );
        } // end for
        for( int j = 0; j < n2; j = j + 1 ) {
            R.add( perso.get(meio+j+1) );
        } // end for
    
        int i = 0, j = 0, k = esq;
        while( i < n1 && j < n2 ) 
        {
            if( L.get(i).getActorName( ).compareTo( R.get(j).getActorName( ) ) <= 0 ) {
                perso.set( k++, L.get(i++) );
            } else {
                perso.set( k++, R.get(j++) );
            } // end if
            log.incrementarComp( );
            log.incrementarMov( );
        } // end while
    
        while( i < n1 ) 
        {
            perso.set(k++, L.get(i++));
            log.incrementarMov();
        } // end while
        while( j < n2 ) 
        {
            perso.set(k++, R.get(j++));
            log.incrementarMov();
        } // end while
    } // end intercalar ( )

    private static void mergeSort( int esq, int dir, List<Personagem> perso, Log log ) 
    {
        if( esq < dir ) 
        {
            int meio = (esq + dir) / 2;
            mergeSort( esq, meio, perso, log );
            mergeSort( meio + 1, dir, perso, log );
            intercalar( esq, meio, dir, perso, log );
            // sortByName(perso, log);
        } // end if
    } // end mergeSort ( )

    public static void callMerge( List<Personagem> perso, Log log ) {
        mergeSort( 0, perso.size( )-1, perso, log );
        sortByName( perso, log );
    } // end callMerge ( )

} // end class


public class Merge extends Personagem
{
    public static void main ( String [] args )
    {
        Scanner scan = new Scanner( System.in );
        
        Log log = new Log( "793605_mergesort.txt" );
        Personagem perso = new Personagem( );
        List<Personagem> arranjo = new ArrayList<>( );

        // fazer a leitura dos dados
        String input = scan.nextLine( );
        while( !isFim( input ) )
        {
            arranjo.add( perso.ler( input ) );
            input = scan.nextLine( );
        } // end while

        
        long startTime = System.nanoTime();
        callMerge( arranjo, log );
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        double time = totalTime / 1_000_000.0;
        log.setTime( time );
        log.registro();
        scan.close( );

        // imprimir os personagens
        for( Personagem personagem : arranjo ) {
            personagem.imprimir( );
        } // end for
    } // end main ( )
} // end class 
