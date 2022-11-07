package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet implements CargoCarrier {
	
	
	
	public CargoPlane(String make, String model, double speedInMph, int rangeInMiles, long purchasePrice) {
		super(make, model, speedInMph, rangeInMiles, purchasePrice);
	
	}
	
	public void loadCargo() {
		CargoCarrier.loadCargo();
	}
	
	@Override
	public void fly() {
		System.out.println(toString() + "Fly Time: " + (this.getRangeInMiles() / this.getSpeedInMph()));
		
	}
}
