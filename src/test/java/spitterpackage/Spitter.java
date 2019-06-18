package test.java.spitterpackage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spitter")
public class Spitter {
	
	@Column(name="firstname")
	private String firstname ; 
	
	@Column(name="lastname")
	private String lastname ;
	
	@Column(name="username")
	private String username ;
	
	@Column(name="passwrd")
	private String password ;
	
	@Id
	@Column(name="id_spitter")
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
		  return "ID : " + spitterId + "\n" + "Firstname : " + firstname + "\n" + "Lastname : " + lastname + "\n" + "Username : "+ username + "\n" + "Password : " + password + "\n" ;  
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