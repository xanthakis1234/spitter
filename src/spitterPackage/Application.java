package spitterPackage;

import java.awt.List;
import java.util.ArrayList;

public class Application {
	
	public static void main(String[] args) {
		
 
		SpitterService service = new SpitterService();
		Spitter kate = new Spitter("Kate","Barry", "KB","12345",6);
		//System.out.println("--------CREATE SPITTER--------");
		//service.addSpitter(kate);
		//service.viewSpitter(kate);
		
		System.out.println("--------UPDATE----------");
		//kate.setFirstname("KATE");
		//kate.setLastname("Barry");
		//service.updateSpitter(kate);;
		List sp ;
		sp = (List) service.viewAllSpitters();
		((Iterable<Spitter>) sp).forEach(System.out::println);
		
		//service.deleteSpitter(dany);
		//service.viewAllSpitters();
		//service.viewSpitter(kate);
		//System.out.println("------Create Spittle-----");
		//Spittle katespittle = new Spittle(kate,"Kate's First",3);
		//service.createSpittle(katespittle);
		//service.viewAllSpittles();
		   

	}

}