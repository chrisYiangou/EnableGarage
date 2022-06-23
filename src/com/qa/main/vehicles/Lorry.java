package com.qa.main.vehicles;

public class Lorry extends Vehicle{
	


	double storageCapacity;
	
	
	public Lorry(String make) {
		super(make);
		
	}

	public double getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(double storageCapacity) {
		this.storageCapacity = storageCapacity;
	}
	
	
	
	
	// But essentially java will automatically assign the subclasses as 
	// their super class
	

}
