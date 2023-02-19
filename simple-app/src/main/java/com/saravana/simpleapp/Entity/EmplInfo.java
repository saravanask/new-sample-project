package com.saravana.simpleapp.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmplInfo {

	@Id
	private int emplId;
	
	private int driverId;
	
	

	public EmplInfo() {
		super();
	}

	public int getEmplId() {
		return emplId;
	}

	public void setEmplId(int emplId) {
		this.emplId = emplId;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	
	
	
	
}
