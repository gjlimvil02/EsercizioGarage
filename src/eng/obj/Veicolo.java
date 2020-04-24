package eng.obj;

import eng.res.TipoVeicolo;

public class Veicolo {
	private TipoVeicolo tipo;
	private String marca;
	private int anno;
	private float cilindrata;
	
	public Veicolo() {
		this.tipo = null;
		this.marca = null;
		this.anno = 0;
		this.cilindrata = 0;
	}
	
	public Veicolo(TipoVeicolo tipo, String marca, int anno, float cilindrata) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.anno = anno;
		this.cilindrata = cilindrata;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public TipoVeicolo getTipo() {
		return tipo;
	}

	public void setTipo(TipoVeicolo tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(float cilindrata) {
		this.cilindrata = cilindrata;
	}
}
