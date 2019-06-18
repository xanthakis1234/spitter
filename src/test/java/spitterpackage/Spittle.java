package test.java.spitterpackage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spittle")
public class Spittle {

	@Column(name="post")
	private String spittle = null;
	
	@Id
	@Column(name="id_spittle")
	private int spittleId = 0;
	
	@Column(name="username")
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
