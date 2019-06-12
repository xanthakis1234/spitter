package spitterPackage;

public class Spitter {
	
	private String firstname ; 
	private String lastname ;
	private String username ;
	private String password ;
	private int spitterId;
	
	
	public Spitter(String firstname, String lastname, String username, String password , int spitterId) {
		
		 this.firstname = firstname; 
		 this.lastname = lastname;
		 this.username = username;
		 this.password = password;
		 this.spitterId = spitterId;
		
	}
	
	
	public Spitter() {
		this(null, null, null, null, 0);
		
		
	}
	
	public String toString(){
		  return firstname + " " + lastname +" " + username +" " + password;  
	}
		  
		  
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	public int getSpitterId() {
		return spitterId;
	}


	public void setSpitterId(int spitterId) {
		this.spitterId = spitterId;
	}
	
	
}
