package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady {
	
	public FighterJet() {
		
	}


	public FighterJet(String make, String model, double speedInMph, int rangeInMiles, long purchasePrice) {
		super(make, model, speedInMph, rangeInMiles, purchasePrice);
		// TODO Auto-generated constructor stub
	}


	
	public void dogFight() {
		CombatReady.dogFight();
	}


	@Override
	public void fly() {
		System.out.println(toString() + "Fly Time: " + (this.getRangeInMiles() /this.getSpeedInMph()));
		
		
	}
	
}


