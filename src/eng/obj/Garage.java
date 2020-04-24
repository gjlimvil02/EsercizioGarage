package eng.obj;

import java.util.HashMap;

public class Garage {
	private int maxPosti;
	private HashMap<Integer, Veicolo> posti = new HashMap<Integer, Veicolo>();
	
	public int getMaxPosti() {
		return maxPosti;
	}

	public void setMaxPosti(int maxPosti) {
		this.maxPosti = maxPosti;
	}

	public HashMap<Integer, Veicolo> getPosti() {
		return posti;
	}

	public void setPosti(HashMap<Integer, Veicolo> posti) {
		this.posti = posti;
	}

	public Garage() {
		this.maxPosti = 3;
		initGarage();
	}
	
	public Garage(int maxPosti) {
		this.maxPosti = maxPosti;
		initGarage();
	}
	
	public Garage(int maxPosti, HashMap<Integer, Veicolo> posti) {
		super();
		this.maxPosti = maxPosti;
		this.posti = posti;
	}
	
	public void initGarage() {
		for (int i = 1; i < maxPosti+1; i++) {
			posti.put(i, null);
		}
	}
}
