package relacionEjerciciosObjetos.ejercicioHerencia;

import java.util.Objects;

public abstract class Inmueble {
	
	public static final double coefUrbano = 0.85;
	public static final double coefRustico = 0.45;
	
	protected String refCatastral;
	protected int superficieM;
	protected double valor;
	protected String descripcion;
	protected double precioM2;
	
	public Inmueble() {
		this.refCatastral = "";
		this.superficieM = 0;
		this.valor = 0;
		this.descripcion = "";
		this.precioM2 = 0;
	}

	public Inmueble(String refCatastral, int metros, double valor, String descripcion, double precioM2) {
		this.refCatastral = refCatastral;
		this.setSuperficieM(metros);
		this.valor = valor;
		this.descripcion = descripcion;
		this.setPrecioM2(precioM2);
	}
	
	//constructor de copia. sirve para crear un objeto en base a otro
	public Inmueble(Inmueble i) {
		this.refCatastral = i.refCatastral;
		this.setSuperficieM(i.superficieM);
		this.valor = i.valor;
		this.descripcion = i.descripcion;
		this.setPrecioM2(i.precioM2);
	}

	public String getRefCatastral() {
		return refCatastral;
	}

	public void setRefCatastral(String refCatastral) {
		this.refCatastral = refCatastral;
	}

	public int getSuperficieM() {
		return superficieM;
	}

	public void setSuperficieM(int metros) {
		if (metros >0)
		this.superficieM = metros;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioM2() {
		return precioM2;
	}

	public void setPrecioM2(double precioM2) {
		if (precioM2 >0)
		this.precioM2 = precioM2;
	}

	@Override
	public String toString() {
		return "Inmueble [refCatastral=" + refCatastral + ", superficieM=" + superficieM + 
				", valor=" + valor	+ ", descripcion=" + descripcion + ", precioM2=" + precioM2 + "]";
	}
	
	//dos inmuebles serán iguales si sus refCatastrales son iguales
	
	
	@Override
	public int hashCode() {
		return Objects.hash(refCatastral);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inmueble other = (Inmueble) obj;
		return Objects.equals(refCatastral, other.refCatastral);
	}
	
	public abstract double calculaIBI();
	public abstract double calculaPrecioVenta();
}