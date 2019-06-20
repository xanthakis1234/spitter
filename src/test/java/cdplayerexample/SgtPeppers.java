package cdplayerexample;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
	
	private String title = "Sgt. Pepper's ";
	private String artist = "The Beatles";

	public void play() {
		System.out.println("playing "+ title + "by "+ artist);
		
	}

}
