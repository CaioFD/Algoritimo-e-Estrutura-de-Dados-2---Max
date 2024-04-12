import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


class PersonagensHpTESTE{

    private String id ;
    private String name ;
    private String[] alternateName ;
    private String house ;
    private String ancestry ;
    private String species ;
    private String patronus ;
    private Boolean hogwartsStaff ;
    private String hogwartsStudent ;
    private String actorName ;
    private Boolean alive ;
    private LocalDate dateOfBirth ;
    private int yearOfBirth ;
    private String eyeColour ;
    private String  gender ;
    private String hairColour ;
    private Boolean wizard ;

		        //--------- Constructors ---------//
    
    PersonagensHpTESTE( ) {
        this.id = "";
        this.name = "";
        this.alternateName = NULL;
        this.house = "";
        this.ancestry = "";
        this.species = "";
        this.patronus = "";
        this.hogwartsStaff = false;
        this.hogwartsStudent = "";
        this.actorName = "";
        this.alive = false;
        this.dateOfBirth = LocalDate.of(-1, 1, 1);
        this.yearOfBirth= -1;
        this.eyeColour = "";
        this.gender = "";
        this.hairColour = "";
        this.wizard = false;
    }
		
    PersonagensHpTESTE(String id,    String name,      String[] alternateName,     String houseString,   String ancestry, 
    String species,     String patronus,    Boolean hogwartsStaff,      String hogwartsStudent, 
    String actorName,   Boolean alive,      LocalDate dateOfBirth,      int yearOfBirth, 
    String eyeColour,   String gender,      String hairColour,          Boolean wizard);

{
this.id = id;
this.name = name;
this.alternateName = alternateName;
this.house = house;
this.ancestry = ancestry;
this.species = species;
this.patronus = patronus;
this.hogwartsStaff = hogwartsStaff;
this.hogwartsStudent = hogwartsStudent;
this.actorName = actorName;
this.alive = alive;
this.dateOfBirth = dateOfBirth;
this.yearOfBirth = yearOfBirth;
this.eyeColour = eyeColour;
this.gender = gender;
this.hairColour = hairColour;
this.wizard = wizard;
}

		//get -> RETORNA o conteudo do atributo privado 
		//tem o mesmo tipo do seu atributo e nao recebe parametros

        //set -> ALTERA o conteudo do atributo privado 
		//retorna void e possui um parametro de entrada cujo tipo é o mesmo do atributo

		public int getId(){
			return this.id;
		}
		public void setId(int id){
			this.id = id;
		}
		

		public int getname(){
			return this.name;
		}
		public void setName(int name){
			this.name = name;
		}


		public int getalternateNames(){
			return this.alternateName;
		}
		public void setalternateNames(int alternateName){
			this.alternateName = alternateName;
		}


		public int gethouse(){
			return this.house;
		}
		public void sethouse(int house){
			this.house = house;
		}


		public String getancestry(){
			return this.ancestry;
		}
		public void setancestry(String ancestry){
			this.ancestry = ancestry;
		}

        
		public String getspecies(){
			return this.species;
		}
		public void setspecies(String species){
			this.species = species;
		}


		public String getpatronus(){
			return this.patronus;
		}
		public void setpatronus(String patronus){
			this.patronus = patronus;
		}


		public String gethogwartsStaff(){
			return this.hogwartsStaff;
		}
		public void sethogwartsStaff(String hogwartsStaff){
			this.hogwartsStaff = hogwartsStaff;
		}


        public String gethogwartsStudent(){
			return this.hogwartsStudent;
		}
		public void sethogwartsStudent(String hogwartsStudent){
			this.hogwartsStudent = hogwartsStudent;
		}


        public String getactorName(){
			return this.actorName;
		}
		public void setactorName(String actorName){
			this.actorName = actorName;
		}


        public String getalive(){
			return this.alive;
		}
		public void setalive(String alive){
			this.alive = alive;
		}
        

        public String getdateOfBirth(){
			return this.dateOfBirth;
		}
		public void setdateOfBirth(String dateOfBirth){
			this.dateOfBirth = dateOfBirth;
		}


        public String getyearOfBirth(){
			return this.yearOfBirth;
		}
		public void setyearOfBirth(String yearOfBirth){
			this.yearOfBirth = yearOfBirth;
		}


        public String geteyeColour(){
			return this.eyeColour;
		}
		public void seteyeColour(String eyeColour){
			this.eyeColour = eyeColour;
		}


        public String getgender(){
			return this.gender;
		}
		public void setgender(String gender){
			this.gender = gender;
		}


        public String gethairColour(){
			return this.hairColour;
		}
		public void sethairColour(String hairColour){
			this.hairColour = hairColour;
		}


        public String gewizard(){
			return this.wizard;
		}
		public void setwizard(String wizard){
			this.wizard = wizard;
		}


            //--------- Métodos ---------//


    /* public static boolean isFIM(string s){ //verifica se a entrada e' igual a "FIM" 
        boolean result = false;
        if (s.length() == 3 && s.chart(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M') {
            result = true;
        }
    }//end

    @Override
    public static ToString(){  // retorna os atributos de um objeto em forma de string
        String ToString = "";
        ToString =  getId() + "##" + getName() + "##" + getAlternateNames() + "##" + getHouse() + "##" + 
                    getAncestry() + "##" + getSpecies() + "##" + getPatronus() + "##" + getAlive() + "##" + 
                    getDateOfBirth() + "##" + getYearOfBirth() + "##" + getEyeColour() + "##" + getGender() + "##" +
                    getHairColour() + "##" + getWizard();
    }//end
    */    

public static clonar(){
    PersonagensHpTESTE clonar = new PersonagensHpTESTE();

    clonar.id = this.id;
    clonar.name = this.name;
    clonar.alternateName = this.alternateName;
    clonar.house = this.house;
    clonar.ancestry = this.ancestry;
    clonar.species = this.species;
    clonar.patronus = this.patronus;
    clonar.hogwartsStaff = this.hogwartsStaff;
    clonar.hogwartsStudent = this.hogwartsStudent;
    clonar.actorName = this.actorName;
    clonar.alive = this.alive;
    clonar.dateOfBirth = this.dateOfBirth;
    clonar.yearOfBirth = this.yearOfBirth;
    clonar.eyeColour = this.eyeColour;
    clonar.gender = this.gender;
    clonar.hairColour = this.hairColour;
    clonar.wizard = this.wizard;
    return (clonar);
}//end

		public void Ler(){
		
		try (BufferedReader arq = new BufferedReader(new FileReader("/tmp/PersonagensHpTESTE.csv"))){
			arq.readLine();
			for (int i = 0; i<3922; i++){
                String str = arq.readLine();
                String [] atributos = str.split(",", -1);
                player [i] = new Jogador();
				
                if (atributos[0]!=""){
					PersonagensHpTESTE[i].setId(Integer.valueOf(atributos[0]));
				}
				if (atributos[1]!=""){
					PersonagensHpTESTE[i].setName(atributos[1]);
				}
				if (atributos[2]!=""){
					PersonagensHpTESTE[i].setalternateNames(Integer.valueOf(atributos[2]));
				}
				if (atributos[3]!=""){
					PersonagensHpTESTE[i].sethouse(Integer.valueOf(atributos[3]));
				}
				if (atributos[4]!=""){
					PersonagensHpTESTE[i].setancestry(atributos[4]);
				}
				if (atributos[5]!=""){
					PersonagensHpTESTE[i].setspecies(Integer.valueOf(atributos[5]));
				}
				if (atributos[6]!=""){
					PersonagensHpTESTE[i].setpatronus(atributos[6]);
				}
				if (atributos[7]!=""){
					PersonagensHpTESTE[i].sethogwartsStaff(atributos[7]);
				}
                if (atributos[8]!=""){
					PersonagensHpTESTE[i].sethogwartsStudent(atributos[8]);
				}
                if (atributos[9]!=""){
					PersonagensHpTESTE[i].setactorName(atributos[9]);
				}
                if (atributos[10]!=""){
					PersonagensHpTESTE[i].setalive(atributos[10]);
				}
                if (atributos[11]!=""){
					PersonagensHpTESTE[i].setdateOfBirth(atributos[11]);
				}
                if (atributos[12]!=""){
					PersonagensHpTESTE[i].seyearOfBirth(atributos[12]);
				}
                if (atributos[13]!=""){
					PersonagensHpTESTE[i].seteyeColour(atributos[13]);
				}
                if (atributos[14]!=""){
					PersonagensHpTESTE[i].setgender(atributos[14]);
				}
                if (atributos[15]!=""){
					PersonagensHpTESTE[i].sethairColour(atributos[15]);
				}
                if (atributos[16]!=""){
					PersonagensHpTESTE[i].setwizard(atributos[16]);
				}
                
            }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
		public void Imprimir(){
			Scanner leia = new Scanner(System.in);
			String in = leia.nextLine();
			
			while(!in.equals("FIM")){
				int numid = Integer.valueOf(in);
				System.out.println("[" + PersonagensHpTESTE[numid].getId() + " ## " + PersonagensHpTESTE[numid].getname() + " ## " + 
                                        PersonagensHpTESTE[numid].getalternateNames() + " ## " + PersonagensHpTESTE[numid].gethouse() + " ## " + 
                                        PersonagensHpTESTE[numid].getancestry() + " ## " + PersonagensHpTESTE[numid].getspecies() + " ## "+ 
                                        PersonagensHpTESTE[numid].getpatronus() + " ## " + PersonagensHpTESTE[numid].gethogwartsStaff() + "##" 
                                        PersonagensHpTESTE[numid].gethogwartsStudent() + "##" + PersonagensHpTESTE[numid].getactorName() + "##" +
                                        PersonagensHpTESTE[numid].getalive() + "##" + PersonagensHpTESTE[numid].getdateOfBirth() + "##" +
                                        PersonagensHpTESTE[numid].getyearOfBirth() + "##" + PersonagensHpTESTE[numid].geteyeColour() + "##" +
                                        PersonagensHpTESTE[numid].getgender() + "##" + PersonagensHpTESTE[numid].gethairColour() + "##" +
                                        PersonagensHpTESTE[numid].getwizard() + "]");
				in = leia.nextLine();
			}
			leia.close();
		}
		public static void main(String[] args){	
			Jogador jogador = new Jogador();
			jogador.Ler();
			jogador.Imprimir();
			
		}

}