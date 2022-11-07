package com.skilldistillery.jets.entities;

public class BomberPlane extends Jet implements CombatReady {

	public BomberPlane(String make, String model, double speedInMph, int rangeInMiles, long purchasePrice) {
		super(make, model, speedInMph, rangeInMiles, purchasePrice);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void fly() {
		System.out.println(toString() + "Fly Time: " + (this.getRangeInMiles() / this.getSpeedInMph()));
		
	}
	
}
