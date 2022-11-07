package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;

public class JetsApplication {

	private AirField airField;
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		JetsApplication jetsApp = new JetsApplication();
		
		jetsApp.launch();
		
	
	}

	private void launch() {
		airField = new AirField();
		JetsMenu();
	}
	
	public void JetsMenu() {
		boolean userMenu = true;
		while(userMenu) {
			
			System.out.println("Plese make a selection from the Sleepy Pilot Airbase Menu: ");
			System.out.println();
			System.out.println("#########################################################");
			System.out.println("#########################################################");
			System.out.println("##              1. Check Out The Fleet!                ##");
			System.out.println("##              2. Fly All Jets                        ##");
			System.out.println("##              3. Our Fastest Jet                     ##");
			System.out.println("##              4. Jet With Longest Fly Range          ##");
			System.out.println("##              5. Load Up All Cargo Jets              ##");
			System.out.println("##              6. DOGFIGHT! Deploy Fighter Jets!      ##");
			System.out.println("##              7. Add A New Jet To The Fleet          ##");
			System.out.println("##              8. Remove A Jet From The Fleet         ##");
			System.out.println("##              9. Quit                                ##");
			System.out.println("#########################################################");
			System.out.println("#########################################################");
			
			int userChoice = sc.nextInt();
			
			switch(userChoice) {
			
			case 1: 
				airField.checkOutTheFleet();
				break;
				
			case 2: 
				airField.flyAllJets();
				break;
				
			case 3:
				airField.ourFastestJet();
				break;
				
			case 4: 
				airField.longestFlyRange();
				break;
				
			case 5:
				airField.loadCargoJets();
				break;
				
			case 6:
				airField.dogFight();
				break;
				
			case 7:
				airField.addNewJet(sc);
				break;
			case 8:
				airField.removeJet(sc);
				break;
				
			case 9: 
				System.out.println("On behalf of, Area 51 Airbase - Thank you for stopping by!");
				userMenu = false;
				break;
				
				default:
				System.out.println("Invalid Selection");
				
			}
			
		}
		
		sc.close();
	}

}
