package eng.mngr;

import java.util.HashMap;
import java.util.Map.Entry;

import eng.obj.Auto;
import eng.obj.Furgone;
import eng.obj.Garage;
import eng.obj.Moto;
import eng.obj.Veicolo;

public interface GarageMngr {
	public static Veicolo createMoto(String marca, int anno, float cilindrata, float tempi) {
		Moto moto = new Moto(marca, anno, cilindrata, tempi);
		
		return moto;
	}
	
	public static Veicolo createAuto(String marca, int anno, float cilindrata, int porte, String alim) {
		Auto auto = new Auto(marca, anno, cilindrata, porte, alim);
		
		return auto;
	}
	
	public static Veicolo createFurgone(String marca, int anno, float cilindrata, float capacita) {
		Furgone furgone = new Furgone(marca, anno, cilindrata, capacita);
		
		return furgone;
	}
	
	public static void viewGarage(Garage g) {
		HashMap<Integer, Veicolo> posti = g.getPosti();
		
		for (Entry<Integer, Veicolo> entry : posti.entrySet()) {
			System.out.println("\nSpot N."+entry.getKey());
			if(entry.getValue() != null) {
				viewVehicle(entry.getValue());
			}else {
				System.out.println("***EMPTY***");
			}
		}
	}
	
	public static boolean insertVehicle(Garage g, Veicolo v, int spot) {
		HashMap<Integer, Veicolo> posti = g.getPosti();
		boolean result = false;
		
		for (Entry<Integer, Veicolo> entry : posti.entrySet()) {
			if(entry.getKey() == spot) {
				entry.setValue(v);
				result = true;
				break;
			}
		}
		
		return result;
	}
	
	public static void extractVehicle(Garage g, int spot) {
		HashMap<Integer, Veicolo> posti = g.getPosti();
		Veicolo v = null;
		for (Entry<Integer, Veicolo> entry : posti.entrySet()) {
			if(entry.getKey() == spot) {
				v = entry.getValue();
				viewVehicle(v);
				entry.setValue(null);
				System.out.println("\nVehicle was successfully extracted");
				break;
			}
		}
	}
	
	public static void viewVehicle(Veicolo v) {		
		System.out.println("\nTipo: " +v.getTipo());
		System.out.println("Marca: " + v.getMarca());
		System.out.println("Anno: " + v.getAnno());
		System.out.println("Cilindrata: " +v.getCilindrata());
	}
	
	public static void viewVehicle(Moto v) {
		System.out.println("Tempi: " +v.getTempi());
	}
	
	public static void viewVehicle(Auto v) {
		System.out.println("Tempi: " +v.getPorte());
		System.out.println("Alimentazione: " +v.getAlim());
	}
	
	public static void viewVehicle(Furgone v) {
		System.out.println("Tempi: " +v.getCapacita());
	}
	
	public static Integer searchEmpty(Garage g) {
		HashMap<Integer, Veicolo> posti = g.getPosti();
		int result = -1;   //-1 = garage full
		
		for (Entry<Integer, Veicolo> entry : posti.entrySet()) {
			if(entry.getValue() == null) {
				result = entry.getKey();
				break;
			}
		}
		return result;	
	}
}
