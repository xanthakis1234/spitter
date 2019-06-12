package spitterPackage;

public class Spittle {

	
	private String spittle = null;
	private int spittleId = 0;
	private String spitterUsername = null;
	
	
	public Spittle(Spitter spitter, String spittle, int spittleId) {
		
		this.spittle = spittle;
		this.spittleId = spittleId;
		this.spitterUsername = spitter.getUsername();
	}
	

	
	
	public String getSpittle() {
		return spittle;
	}

	public void setSpittle(String spittle) {
		this.spittle = spittle;
	}




	public int getSpittleId() {
		return spittleId;
	}




	public void setSpittleId(int spittleId) {
		this.spittleId = spittleId;
	}
	
	
	
}
