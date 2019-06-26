package spitterpackage;

import java.awt.List;
import java.util.ArrayList;

import spitterpackage.dao.SpitterDao;
import spitterpackage.dao.SpitterService;

public class Application {
	
	public static void main(String[] args) {
		
		
		SpitterDao service = new SpitterDao();
		Spitter test =  new Spitter("TEST","TEST","TESTTEST","12345",10);
		test.setFirstname("UPDATE");
		test.setLastname("UPDATE");
		service.update(test);
		//Spitter kate = new Spitter("Kate","Barry", "KB","12345",6);
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