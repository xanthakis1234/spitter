package spittr;

import java.util.Date;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Spittle {
	private final int ID;
	private final String MESSAGE;
	private final Date TIME;
	
	private double latitude;
	private double longtitude;
	
	public Spittle(String message, Date time, Double longtitude, Double latitude) {
		this.ID=0;
		this.MESSAGE= message;
		this.TIME = time;
		this.longtitude = longtitude;
		this.latitude = latitude;	
	}
	
	
	public long getID() {
		return ID;
	}
	
	public String getMESSAGE() {
		return MESSAGE;
	}
	
	public Date getTIME() {
		return TIME;
	}
	
	public double getLatitude() {
		return latitude;
	}


	public double getLongtitude() {
		return longtitude;
	}


	@Override
	public boolean equals(Object that) {
		return EqualsBuilder.reflectionEquals(this, that, "id", "time");
	}
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, "id", "time");
	}
	
}

