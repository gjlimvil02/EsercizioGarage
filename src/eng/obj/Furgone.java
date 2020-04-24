package eng.obj;

import eng.res.TipoVeicolo;

public class Furgone extends Veicolo{
	private float capacita;

	public Furgone(String marca, int anno, float cilindrata, float capacita) {
		super(TipoVeicolo.FURGONE, marca, anno, cilindrata);
		this.capacita = capacita;
	}

	public float getCapacita() {
		return capacita;
	}

	public void setCapacita(float capacita) {
		this.capacita = capacita;
	}
	
}
