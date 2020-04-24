package eng.obj;

import eng.res.TipoVeicolo;

public class Auto extends Veicolo{
	private int porte;
	private String alim; 

	public Auto(String marca, int anno, float cilindrata, int porte, String alim) {
		super(TipoVeicolo.AUTO, marca, anno, cilindrata);
		this.porte = porte;
		this.alim = alim;
	}

	public int getPorte() {
		return porte;
	}

	public void setPorte(int porte) {
		this.porte = porte;
	}

	public String getAlim() {
		return alim;
	}

	public void setAlim(String alim) {
		this.alim = alim;
	}
	
	
}
