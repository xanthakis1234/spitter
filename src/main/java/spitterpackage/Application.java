package spitterpackage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spitterpackage.dao.SpitterService;
import spitterpackage.model.Spitter;

public class Application {
	
	public static void main(String[] args) {
		//SpitterService spserv = new SpitterService();	 	
		//Spitter test =  new Spitter("SPRING","SPRING","SPRING","SPRING",10);
		//service.insert(test);
		Spitter William = new Spitter("William","Carter", "WC","1234523",11);
		//System.out.println("--------CREATE SPITTER--------");
		//service.addSpitter(kate);
		//service.viewSpitter(kate);
		
		//System.out.println("--------UPDATE----------");
		//kate.setFirstname("KATE");
		//kate.setLastname("Barry");
		//service.updateSpitter(kate);;
		//System.out.println(service.viewSpitter(kate));
		//System.out.println(service.viewAllSpitters());
		//service.deleteSpitter(dany);
		//System.out.println(service.viewSpitter(kate));
		//System.out.println("------Create Spittle-----");
		//Spittle katespittle = new Spittle(kate,"Kate's First",3);
		//service.createSpittle(katespittle);
		//service.viewAllSpittles();
		   

	}

}