package spitterPackage;

public class Application {
	
	public static void main(String[] args) {
		
 
		SpitterService service = new SpitterService();
		Spitter desmond = new Spitter("Desmond","Sart", "ABC","12345",5);
		//service.addSpitter(desmond);
		//service.viewAllSpitters();
		//service.deleteSpitter(dany);
		//service.viewAllSpitters();
		//service.viewSpitter(desmond);
		Spittle desmondspittle = new Spittle(desmond,"Desmonds First",2);
		service.createSpittle(desmondspittle);
		service.viewAllSpittles();
		   

	}

}