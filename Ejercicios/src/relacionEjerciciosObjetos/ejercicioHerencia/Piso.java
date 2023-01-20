package relacionEjerciciosObjetos.ejercicioHerencia;

public class Piso extends Inmueble{

	private int numHabitaciones;
	private boolean vpo;
	private boolean atico;
	private int antiguedad;
	
	public Piso() {
		super();
		this.numHabitaciones = 0;
		this.vpo = false;
		this.atico = false;
		this.antiguedad = 0;
	}	
	
	public Piso(String refCatastral, int metros, double valor, String descripcion, double precioM2, int 		numHabitaciones, boolean vpo, boolean atico, int antiguedad) {
		super(refCatastral, metros, valor, descripcion, precioM2);
		this.setNumHabitaciones(numHabitaciones);
		this.setVPO(vpo);
		this.setAtico(atico);
		this.setAntiguedad(antiguedad);
	}
	
	//constructor de copia
	
	public Piso (Piso p) {
		super(p);
		this.setNumHabitaciones(p.numHabitaciones); 
		this.setVPO(p.vpo);
		this.setAntiguedad(p.antiguedad);
		this.setAtico(p.atico);
	}


	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public boolean isVPO() {
		return vpo;
	}

	public void setVPO(boolean vPO) {
		vpo = vPO;
	}

	public boolean isAtico() {
		return atico;
	}

	public void setAtico(boolean atico) {
		this.atico = atico;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
//	@Override  //por sobreescritura
//	public String toString() {
//		return "Piso [refCatastral=" + refCatastral + ", superficieM=" + superficieM + ", valor=" + valor
//				+ ", descripcion=" + descripcion + ", precioM2=" + precioM2 + ", numHabitaciones=" + numHabitaciones	+ ", vpo=" + vpo + ", atico=" + atico + ", antiguedad=" + antiguedad + "]";
//	}  
	
	@Override //por refinamiento
	public String toString() {
		return "Piso [toString()=" + super.toString() + "]";
	}

	@Override 
	public String getDescripcion() {
		// return "no permitido"; //esto es una sobreescritura
		return "Descripcion de refinamiento: "+ super.getDescripcion(); // refinamiento
	}

	
	@Override
	public double calculaIBI() {
		double ibi= this.getValor()*Inmueble.coefUrbano; //se puede llamar a coefurbano sin necesidad de llamar al objeto
		if (isVPO()) {
			ibi = ibi - ibi*.5;
		}
		return ibi;
	}

	@Override
	public double calculaPrecioVenta() {
		double precioVenta = this.getPrecioM2()*this.getSuperficieM();
		if (isAtico()) {
			precioVenta = precioVenta *1.06;
		}
		if (isVPO() && getAntiguedad()<25) {
			precioVenta=0;
		}
		return precioVenta;
	}

	

}
