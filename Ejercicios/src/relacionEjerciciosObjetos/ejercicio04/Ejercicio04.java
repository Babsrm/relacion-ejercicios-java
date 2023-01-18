package relacionEjerciciosObjetos.ejercicio04;

public class Ejercicio04 {

	public static void main(String[] args) {
		//pruebas clase Pelicula
		Pelicula p1 = new Pelicula("Ghandi", "Richard Attenborough", GeneroPelicula.DRAMA, 191, 1982, 8.1);
		Pelicula p2 = new Pelicula("Thor", "Kenneth Branagh",GeneroPelicula.ACCION, 115, 2011, 7.0);
		Pelicula ComprobacionesControl = new Pelicula ("clasifficacion negativa", "año y duracion fuera rango", GeneroPelicula.SUSPENSO, 999, 3000, -8);
		Pelicula ps1 = new Pelicula("Similar1", "aaaaa", GeneroPelicula.COMEDIA, 191, 1982, 9.0);
		Pelicula ps2 = new Pelicula("Similar2", "Keeeee",GeneroPelicula.COMEDIA, 115, 2011, 8.2);
		
		System.out.println(p1.mostrarPelicula());
		System.out.println(ComprobacionesControl.mostrarPelicula());
		
		if (p1.esPeliculaEpica()) {
			System.out.println("pelicula epica " + p1.getNombre());
		} else {
			System.out.println("película no épica " + p1.getNombre());
		}
		if (p2.esPeliculaEpica()) {
			System.out.println("pelicula epica " + p2.getNombre());
		} else {
			System.out.println("película no épica " + p2.getNombre());
		}
		
		System.out.println("La valoración de "+p1.getNombre() + " es " +p1.getClasificacion());
		System.out.println("La valoración de "+p2.getNombre() + " es " +p2.getClasificacion());

		if (Pelicula.esSimilar(ps1, ps2)) {
			System.out.println(ps1.getNombre() +" y " +ps2.getNombre() +" son películas similares");
		};
	}
}
