package com.qa.main.garage;

import java.util.ArrayList;
import java.util.List;

import com.qa.main.vehicles.Vehicle;

public class Garage {

	//Dependency Inversion
	private List<Vehicle> garage;
	
	public Garage() {
		this.garage = new ArrayList<>();
	}
	
	public Garage(List<Vehicle> garage) {
		this.garage = garage;
	}
	//CRUD == CREATE READ UPDATE DELETE 
	//Our core
	
	public void addVehicle(Vehicle vehicle) {
		garage.add(vehicle);
	}
	
	public void printGarageContents() {
		System.out.println(garage.toString());
	}
	
	public void printOne(int index) {
		System.out.println(garage.get(index));
	}
	
	//Update, Delete, 
	
	
}
