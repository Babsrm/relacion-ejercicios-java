package relacionEjerciciosObjetos.ejercicio05;

public class Ejercicio05 {

	public static void main(String[] args) {
		Cafetera c1 = new Cafetera();
		Cafetera c2 = new Cafetera(1200);
		Cafetera c3 = new Cafetera(750, 224.85);
		Cafetera c4 = new Cafetera(500, 880);
		
		System.out.println(c1.mostrarCafetera());
		System.out.println(c2.mostrarCafetera());
		System.out.println(c3.mostrarCafetera());
		System.out.println(c4.mostrarCafetera());// la cant actual es mayor que la capacidad
		
		System.out.println("lleno la cafetera 3");
		c3.llenarCafetera();
		System.out.println(c3.mostrarCafetera());
		
		System.out.println("sirvo taza en cafetera 4");
		c4.servirTaza(22.75);
		System.out.println(c4.mostrarCafetera());
		
		System.out.println("vacio la cafetera 2");
		c2.vaciarCafetera();
		System.out.println(c2.mostrarCafetera());
		
		System.out.println("agrego café 130 cafetera 1");
		c1.agregarCafe(130);
		System.out.println(c1.mostrarCafetera());
	}

}
