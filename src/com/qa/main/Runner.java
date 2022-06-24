package com.qa.main;

import com.qa.main.garage.Garage;
import com.qa.main.vehicles.Car;
import com.qa.main.vehicles.MotorBike;

public class Runner {

	public static void main(String[] args) {
		
		Garage garage = new Garage();
		
		Car car = new Car("BMW");
		MotorBike mb = new MotorBike("Harley Davidson");
		
		garage.addVehicle(car);
		garage.addVehicle(mb);
		
		garage.printGarageContents();
		
		garage.printOne(5);
		
		System.out.println("Hello Boss");
		
		garage.calculateBill();
			
		
	}
}
