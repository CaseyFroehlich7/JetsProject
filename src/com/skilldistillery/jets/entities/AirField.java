package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {

	public AirField() {
		this.fetchAirfieldData(fileName);
	}

	String fileName = "jets.txt";

	ArrayList<Jet> fleet = new ArrayList<>();

	public ArrayList<Jet> fetchAirfieldData(String fileName) {

		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {

			String line;

			while ((line = bufIn.readLine()) != null) {
				String[] jets = line.split(",");

				String jetType = jets[0];
				String make = jets[1];
				String model = jets[2];
				double speedInMph = Double.parseDouble(jets[3]);
				int rangeInMiles = Integer.parseInt(jets[4]);
				long purchasePrice = Long.parseLong(jets[5]);

				if (jetType.equals("Fighter Jet")) {

					FighterJet newFighter = new FighterJet(make, model, speedInMph, rangeInMiles, purchasePrice);
					fleet.add(newFighter);
				}

				else if (jetType.equals("Cargo Plane")) {

					CargoPlane newCargo = new CargoPlane(make, model, speedInMph, rangeInMiles, purchasePrice);
					fleet.add(newCargo);
				} else if (jetType.equals("Bomber Plane")) {

					BomberPlane newBomber = new BomberPlane(make, model, speedInMph, rangeInMiles, purchasePrice);
					fleet.add(newBomber);
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}

		return fleet;
	}

	public void checkOutTheFleet() {
		for (Jet jet : fleet) {
			System.out.println(jet);

		}
	}

	public void flyAllJets() {
		for (int i = 0; i < fleet.size(); i++) {
			fleet.get(i).fly();
			System.out.println();
		}
	}

	public void ourFastestJet() {
		double fastestJetMph = 0.0;
		int counter = 0;
		for (int i = 0; i < fleet.size(); i++) {
			if (fleet.get(i).getSpeedInMph() > fastestJetMph) {
				fastestJetMph = fleet.get(i).getSpeedInMph();
				counter = i;
				
			}
		}
		System.out.println(fleet.get(counter));
	}


	public void longestFlyRange() {
		int rangeMiles = 0;
		int counter = 0;
		for (int i = 0; i < fleet.size(); i++) {
			if (fleet.get(i).getRangeInMiles() > rangeMiles) {
				rangeMiles = fleet.get(i).getRangeInMiles();
				counter = i;
			}
		}
		System.out.println(fleet.get(counter));
	}

	public void loadCargoJets() {
		for (Jet jet : fleet) {
			if (jet instanceof CargoCarrier) {
				((CargoPlane) jet).loadCargo();
			}
		}
	}

	public void dogFight() {
		for (Jet jet : fleet) {
			if (jet instanceof FighterJet) {
				((FighterJet) jet).dogFight();

			}
		}
	}

	public void addNewJet(Scanner sc) {
		System.out.println("What will be the make of the jet you'd like to add?");
		String make = sc.next();
		System.out.println("What model of " + make + " is this jet?");
		String model = sc.next();

		System.out.println("How fast can the " + make + " travel in MPH?");
		double speedInMph = (long) sc.nextDouble();

		System.out.println("What is the mile range of flight for the " + make + " ?");
		int rangeInMiles = (int) sc.nextLong();

		System.out.println("How much does a " + make + " cost?");
		long purchasePrice = sc.nextLong();

		FighterJet byoJet = new FighterJet(make, model, speedInMph, rangeInMiles, purchasePrice);

		fleet.add(byoJet);
	}

	public void removeJet(Scanner sc) {
		for (int i = 0; i < fleet.size(); i++) {
			System.out.println((i + 1) + " " + fleet.get(i));
		}
		System.out.println("Please enter the number of the jet you would like to remove from the airfield");
		System.out.println();

		int numberEntered = sc.nextInt();
		fleet.remove(numberEntered - 1);
	}

}
