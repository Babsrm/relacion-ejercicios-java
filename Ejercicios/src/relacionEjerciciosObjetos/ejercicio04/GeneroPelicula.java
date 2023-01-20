package relacionEjerciciosObjetos.ejercicio04;

public enum GeneroPelicula {
	ACCION(0, "Acción"), 
	COMEDIA (1, "Comedia"),
	DRAMA(2,"Drama"),
	CIENCIAFICCION(3,"Ciencia ficción");
	
	private int id;
	private String nombre;

	GeneroPelicula(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}
	
	public static GeneroPelicula getGenero(String nombre) {
		switch(nombre.toLowerCase()) {
		case "acción": return ACCION;
		case "comedia": return COMEDIA;
		case "drama": return DRAMA;
		case "ciencia ficción": return CIENCIAFICCION;
		default: return ACCION;
		}
	}
}

/*
 * dentro de la clase, se llama al enum de la siguiente manera:
 * se crea una nueva variable
 * private TipoPelicula tipo;
 * dentro del constructor pongo esta linea
 * this.tipo = TipoPelicula.COMEDIA;
 * debo de indicar que se le pasa como parámetro TipoPelicula tipo
 */
