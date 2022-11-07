package com.skilldistillery.jets.entities;

import java.util.Objects;

public abstract class Jet {
	private String make;
	private String model;
	private double speedInMph;
	private int rangeInMiles;
	private long purchasePrice;
	
	public Jet() {
		
	}

	public Jet(String make, String model, double speedInMph, int rangeInMiles, long purchasePrice) {
		this.make = make;
		this.model = model;
		this.speedInMph = speedInMph;
		this.rangeInMiles = rangeInMiles;
		this.purchasePrice = purchasePrice;
		
		//type of field 
	}
	public void fly() {
		
		}
		

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeedInMph() {
		return speedInMph;
	}

	public void setSpeedInMph(double speedInMph) {
		this.speedInMph = speedInMph;
	}

	public int getRangeInMiles() {
		return rangeInMiles;
	}

	public void setRangeInMiles(int rangeInMiles) {
		this.rangeInMiles = rangeInMiles;
	}

	public long getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(long purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	

	@Override
	public String toString() {
		return "Plane [make=" + make + ", model=" + model + ", speedInMph=" + speedInMph + ", rangeInMiles="
				+ rangeInMiles + ", purchasePrice=" + purchasePrice + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(make, model, purchasePrice, rangeInMiles, speedInMph);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jet other = (Jet) obj;
		return Objects.equals(make, other.make) && Objects.equals(model, other.model)
				&& purchasePrice == other.purchasePrice && rangeInMiles == other.rangeInMiles
				&& Double.doubleToLongBits(speedInMph) == Double.doubleToLongBits(other.speedInMph);
	}


}
