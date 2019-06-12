package spitterPackage;

public class Application {

	public static void main(String[] args) {
		SpitterService service = new SpitterService();
		Spitter george = new Spitter("George", "Lucas", "GeoLucas","GeolucasPass123",1);
		Spitter nektarios = new Spitter("Nektarios", "Xanthakis", "NekX","Nek1234",2);
		Spitter john = new Spitter("John", "Doe", "JD","JohnsPassword",3);
		//service.viewAllSpitters();
		//nektarios.setFirstname("NEKTARIOS");
		//nektarios.setPassword("updatedpass");
		//service.updateSpitter(nektarios);
		//service.viewAllSpitters();
		Spittle nekSpittle = new Spittle(nektarios,"Nektarios Spittle", 3);
		service.createSpittle(nektarios, nekSpittle);
		service.viewMySpittles(nektarios);
		service.viewAllSpittles();
		System.out.println("---UPDATE BELLOW---");
		nekSpittle.setSpittle("Updated Spittle!");
		service.updateSpittle(nekSpittle);
		service.viewMySpittles(nektarios);
		
		
		System.out.println("---DELETE---");
		
		service.deleteSpittle(nekSpittle);
		service.viewMySpittles(nektarios);
		
	}

}
