package com.qa.main.vehicles;

public class Car extends Vehicle {

	public Car(String make) {
		super(make);
		// TODO Auto-generated constructor stub
	}

	public void reverse() {
		System.out.println("Going back");
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", noOfWheels=" + noOfWheels + ", colour=" + colour + ", engineSize=" + engineSize
				+ ", isRoadLegal=" + isRoadLegal + ", headLightsOn=" + headLightsOn + "]";
	}
	
	
}
