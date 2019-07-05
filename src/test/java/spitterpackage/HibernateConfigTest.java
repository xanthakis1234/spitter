package spitterpackage;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

//@ContextConfiguration(classes=HibernateConfig.class)
public class HibernateConfigTest {
	
	    @Test 
	    public void testContext() { 
	    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpittrWebAppInitializer.class);
	    	String[] singletonNames = (String[]) context.getBeanDefinitionNames();
		    //String[] singletonNames = (String[]) context.getBean("sessionFactory");
	    	for (String singleton : singletonNames) {
	    		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		        System.out.println(singleton);
		    }   
	    }
}
