package relacionEjerciciosObjetos.ejercicioHerencia;

public class Principal {

	public static void main(String[] args) {
		Piso p1 = new Piso("A111", 80, 115000, "Piso céntrico", 750, 3, false, false, 10);
		System.out.println("El piso es: " +p1);
		System.out.println("Descripcion: " +p1.getDescripcion());
		
		Terreno t1 = new Terreno("R222", 200, 40000, "tierra olivos", 600, TipoTerreno.RUSTICO, 8, 350000);
		System.out.println("El terreno es:" +t1.toString());
		
		System.out.println("Ibi piso: " +p1.calculaIBI());
		System.out.println("precio-venta piso: " +p1.calculaPrecioVenta());
		System.out.println("ibi terreno: "+t1.calculaIBI());
		System.out.println("precio-venta terreno: " +t1.calculaPrecioVenta());

	}

}
