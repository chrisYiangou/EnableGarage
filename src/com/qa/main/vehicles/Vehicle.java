package com.qa.main.vehicles;

public class Vehicle {

	String make;
	int noOfWheels;
	String colour;
	float engineSize;
	boolean isRoadLegal;
	boolean headLightsOn;
	
	
	public Vehicle(String make) {
		this.make = make;
	}
	
	public Vehicle(String make, int noOfWheels, String colour, float engineSize, boolean isRoadLegal,
			boolean headLightsOn) {
		this.make = make;
		this.noOfWheels = noOfWheels;
		this.colour = colour;
		this.engineSize = engineSize;
		this.isRoadLegal = isRoadLegal;
		this.headLightsOn = headLightsOn;
	}


	public void startHeadLights() {
		System.out.println("Engine Started");
		headLightsOn = true;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public int getNoOfWheels() {
		return noOfWheels;
	}


	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public float getEngineSize() {
		return engineSize;
	}


	public void setEngineSize(float engineSize) {
		this.engineSize = engineSize;
	}


	public boolean isRoadLegal() {
		return isRoadLegal;
	}


	public void setRoadLegal(boolean isRoadLegal) {
		this.isRoadLegal = isRoadLegal;
	}


	public boolean isHeadLightsOn() {
		return headLightsOn;
	}


	public void setHeadLightsOn(boolean headLightsOn) {
		this.headLightsOn = headLightsOn;
	}
	
	
	
	
	
	
}
