package relacionEjerciciosObjetos.ejercicioHerencia;

public class Terreno extends Inmueble {
	private TipoTerreno terreno;
	private double haTerreno;
	private double haPRecio;
	
	public Terreno() {
		super();
		this.terreno = TipoTerreno.URBANO;
		this.haTerreno=0;
		this.haPRecio = 0;
	}	

	public Terreno(String refCatastral, int metros, double valor, String descripcion, double precioM2,
			TipoTerreno terreno, double haTerreno, double haPRecio) {
		super(refCatastral, metros, valor, descripcion, precioM2);
		this.setTerreno(terreno);
		this.haTerreno = haTerreno;
		this.haPRecio = haPRecio;
	}
	//constructor copia
	public Terreno (Terreno t) {
		super(t);
		this.terreno = t.terreno;
		this.haTerreno = t.haTerreno;
		this.haPRecio = t.haPRecio;
	}

	public TipoTerreno getTerreno() {
		return terreno;
	}

	public void setTerreno(TipoTerreno terreno) {
		this.terreno = terreno;
		if (getTerreno().equals(TipoTerreno.RUSTICO)) {
		this.setSuperficieM(0);	
		}
	}

	public double getHaTerreno() {
		return haTerreno;
	}

	public void setHaTerreno(double haTerreno) {
		this.haTerreno = haTerreno;
	}

	public double getHaPRecio() {
		return haPRecio;
	}

	public void setHaPRecio(double haPRecio) {
		this.haPRecio = haPRecio;
	}

	
	
	@Override
	public String toString() {
		return "Terreno [refCatastral=" + refCatastral + ", superficieM=" + superficieM + ", valor=" + valor
				+ ", descripcion=" + descripcion + ", precioM2=" + precioM2 + ", terreno=" + terreno 
				+ ", haTerreno="	+ haTerreno + ", haPRecio=" + haPRecio + "]";
	}

	@Override
	public double calculaIBI() {
		double ibi = 0;
		if (getTerreno().equals(TipoTerreno.RUSTICO)) {
			ibi = getValor()*coefRustico;
		} else if (getTerreno().equals(TipoTerreno.URBANO)) {
			ibi = getValor()*coefUrbano;
		} return ibi;
	}

	@Override
	public double calculaPrecioVenta() {
		double precio = getHaPRecio()*getHaTerreno();
		if (getTerreno().equals(TipoTerreno.URBANO)) {
			precio = precio + this.getPrecioM2()*this.getSuperficieM();
		}
		return precio;
	}

}
