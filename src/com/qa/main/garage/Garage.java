package com.qa.main.garage;

import java.util.ArrayList;
import java.util.List;

import com.qa.main.vehicles.Car;
import com.qa.main.vehicles.Lorry;
import com.qa.main.vehicles.MotorBike;
import com.qa.main.vehicles.Vehicle;

public class Garage {

	// Dependency Inversion
	private List<Vehicle> garage;
	private float totalBill;

	public Garage() {
		this.garage = new ArrayList<>();
	}

	public Garage(List<Vehicle> garage) {
		this.garage = garage;
	}

	// Calculate Bill
	/*
	 * Create a method in Garage that iterates through each Vehicle, calculating a
	 * bill for each type of Vehicle in a different way, depending on the type of
	 * Vehicle it is (this does not need to be complex).
	 */
	
	public float calculateBill() {
		for (int i = 0; i < garage.size(); i++) {
			if (garage.get(i) instanceof Car) {
				totalBill += 50;
			} else if (garage.get(i) instanceof MotorBike) {
				totalBill += 25;
			} else if (garage.get(i) instanceof Lorry) {
				totalBill += 100;
			} else {
				totalBill += 10;
			}
		}
		System.out.println(totalBill);
		return totalBill;
	}

	// CRUD == CREATE READ UPDATE DELETE
	// Our core

	public void addVehicle(Vehicle vehicle) {
		garage.add(vehicle);
	}

	public void printGarageContents() {
		System.out.println(garage.toString());
	}

	public void printOne(int index) {
		// It throw an out of bound error
		try {
			System.out.println(garage.get(index));
		} catch (Exception e) {
			System.out.println("Yo you're out of bounds dude" + e);
		}
	}

	// Update, Delete,

}
