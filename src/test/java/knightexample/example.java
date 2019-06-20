package knightexample;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class example {

	public static void main(String[] args) {
    	FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\nxan\\eclipse-workspace\\SpitterProject\\src\\test\\java\\knightexample\\knight.xml");
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();

	}

}
