package eng.obj;

import eng.res.TipoVeicolo;

public class Moto extends Veicolo{
	private float tempi;
	
	public Moto(String marca, int anno, float cilindrata, float tempi) {
		super(TipoVeicolo.MOTO, marca, anno, cilindrata);
		this.tempi = tempi;
	}

	public float getTempi() {
		return tempi;
	}

	public void setTempi(float tempi) {
		this.tempi = tempi;
	}
	
	
}
