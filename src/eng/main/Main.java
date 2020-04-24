package eng.main;

import java.util.Scanner;

import eng.mngr.GarageMngr;
import eng.obj.Garage;
import eng.obj.Veicolo;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Garage garage;
		Veicolo newVeicolo = new Veicolo();
		int select, select2;
		
		System.out.println("Creating new Garage...");
		garage = new Garage();
		System.out.println("Garage was successfully created");
		do{
			System.out.println("\nPlease choose one of the following...");
			System.out.println("1) Create new vehicle");
			System.out.println("2) Insert vehicle into garage");
			System.out.println("3) Extract vehicle from garage");
			System.out.println("4) View garage");
			System.out.println("0) Exit");
			System.out.printf("Your selection: ");
			select = scanner.nextInt();
			
			switch(select) {
				case 1:
					
					System.out.println("\nSelect a vehicle...");
					System.out.println("1) Moto");
					System.out.println("2) Auto");
					System.out.println("3) Furgone");
					System.out.println("0) Go back");
					System.out.println("Your selection: ");
					select2 = scanner.nextInt();
					
					System.out.println("Marca:");
					String marca = scanner.next();
					System.out.println("Anno:");
					int anno = scanner.nextInt();
					System.out.println("Cilindrata:");
					float cilindrata = scanner.nextFloat();
					
					switch(select2) {
					
						case 1:
							System.out.println("Tempi:");
							float tempi = scanner.nextFloat();
							newVeicolo = GarageMngr.createMoto(marca, anno, cilindrata, tempi);
							
							break;
						case 2:
							System.out.println("Porte:");
							int porte = scanner.nextInt();
							System.out.println("Alimentazione(Diesel/Benzina");
							String alim = scanner.next();
							newVeicolo = GarageMngr.createAuto(marca, anno, cilindrata, porte, alim);
							
							break;
						case 3:
							System.out.println("Capacita:");
							float capacita = scanner.nextFloat();
							
							newVeicolo = GarageMngr.createFurgone(marca, anno, cilindrata, capacita);
							break;
						case 0:
							break;
							
					}
					System.out.println("New Vehicle was created");
					break;
					
				case 2:
					int emptySpot = GarageMngr.searchEmpty(garage);
					
					if(emptySpot != -1) {
						System.out.println("\nSpot N."+emptySpot+" is available");
						System.out.println("Would you like to proceed with the operation? Yes(1) or No(0)");
						System.out.println("Your selection:");
						select2 = scanner.nextInt();
						
						if(select2 == 1) {
							boolean result = GarageMngr.insertVehicle(garage, newVeicolo, emptySpot);
							if(result == true) {
								System.out.println("Vehicle was successfully inserted");
							}else {
								System.out.println("Vehicle was not inserted");
							}
							
							newVeicolo = null;
						}
						
					}else {
						System.out.println("\nGarage is full");
					}
					break;
					
				case 3:
					System.out.println("\nPlease enter a garage spot: ");
					int spot = scanner.nextInt();
					
					GarageMngr.extractVehicle(garage, spot);
					
					break;
					
				case 4:
					GarageMngr.viewGarage(garage);
					break;
			}
			
		}while(select != 0);
		
		scanner.close();
	}
}
