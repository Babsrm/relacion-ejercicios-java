package relacionEjerciciosObjetos.ejercicio04;

import java.util.Objects;

/*Realizar un programa en Java que defina una clase Película con los siguientes atributos privados: 
 * •Nombre: es el nombre de la película y es de tipo String. 
 * •Director: representa el nombre del director de la película y es de tipo String.  
 * •Género: es el género de la película, un tipo enumerado con los siguientes valores: ACCIÓN, COMEDIA, DRAMA y SUSPENSO.  
 * •Duración: duración de la película en minutos, esta es de tipo int.  
 * •Año: representa el año de realización de la película. 
 * •Calificación: es la valoración de la película por parte de sus usuarios y es de tipo double.
 * •Se debe definir un constructor público para la clase, que recibe como parámetros los valores de todos sus atributos. También se deben definir los siguientes métodos: 
 * •Métodos get y set para cada atributo y con los derechos de acceso privados para los set y públicos para los get.  
 * •Un método imprimir público que muestre en pantalla los valores de los atributos. 
 * •Un método privado boolean esPeliculaEpica(), el cual devuelve un valor verdadero si la duración de la película es mayor o igual a tres horas, en caso contrario devuelve falso.  
 * •Un método privado String calcularValoración(), el cual según la tabla 2.5 devuelve una valoración subjetiva. 
 * •El método privado boolean esSimilar() compara la película actual con otra película que se le pasa como parámetro. Si ambas películas son del mismo género y tienen la misma valoración, devuelve verdadero; en caso contrario, devuelve falso. 
 * •Un método main que construya dos películas; determinar si son películas épicas; calcular su respectiva valoración y determinar si son similares. Las dos películas están en la tabla 2.6.  
 * •Mostrar los resultados de la ejecución del método main.
 */


@SuppressWarnings("unused")
public class Pelicula {
	
	//variables
	private String nombre;
	private String director;
	private GeneroPelicula genero;
	private int duracion;
	private int year;
	private double clasificacion;
	
	//constructores
	public Pelicula () {
		this.nombre = "";
		this.director = "";
		this.genero = GeneroPelicula.ACCION;
		this.duracion = 0;
		this.year = 0000;
		this.clasificacion = 0;
	}
	
	public Pelicula(String nombre, String director, GeneroPelicula genero, int duracion, int year,
			double clasificacion) {
		setNombre(nombre);
		setDirector(director);
		setGenero(genero);
		setDuracion(duracion);
		setYear(year);
		setClasificacion(clasificacion);
	}
	
	//getters & setters
	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		if (nombre.length()>0)
		this.nombre = nombre;
	}

	public String getDirector() {
		return director;
	}

	private void setDirector(String director) {
		if (director.length()>0)
		this.director = director;
	}

	public GeneroPelicula getGenero() {
		return genero;
	}

	private void setGenero(GeneroPelicula genero) {
		this.genero = genero;
	}

	public int getDuracion() {
		return duracion;
	}

	private void setDuracion(int duracion) {
		if (duracion>0 && duracion<300)
		this.duracion = duracion;
	}

	public int getYear() {
		return year;
	}

	private void setYear(int year) {
		if (year>1895 && year<2100)
		this.year = year;
	}

	public double getClasificacion() {
		return clasificacion;
	}

	private void setClasificacion(double clasificacion) {
		if (clasificacion >= 0 && clasificacion <=10)
		this.clasificacion = clasificacion;
	}
	
	
	public String mostrarPelicula() {
		return "Pelicula: \nNombre=" + nombre + ",\ndirector=" + director + ",\ngenero=" + genero + ",\nduracion=" + duracion + ",\nyear=" + year + ",\nclasificacion=" + clasificacion;
	}
	
	public boolean esPeliculaEpica() {
		if (duracion >= 180) {
			return true;
		} else { return false;}	
}
	public String calcularValoracion () {
		if (clasificacion<=2) {
			return "muy mala";
		} else if (clasificacion<=5) {
			return "mala";
		} else if (clasificacion <=7) {
			return "regular";
		} else if (clasificacion <=8) {
			return "buena";
		} else if(clasificacion <=10) {
			return "excelente";
		}
			return "error";
	}
	
	public static boolean esSimilar(Pelicula pelicula1, Pelicula pelicula2) {
		if (pelicula1.genero.equals(pelicula2.genero)
				&&
				pelicula1.calcularValoracion().equals(pelicula2.calcularValoracion()))
			//Objects.equals(pelicula1.clasificacion, pelicula2.clasificacion)) 
				{
			return true;
		} else {
			return false;
		}
	}
// en el metodo esSimilar, lo he puesto public static porque le voy a pasar dos objetos como parámetros para que pueda compararlos. después le hago el equals de género y el equals de calcular valoración porque lo que quiero es que me compare si es buena, mala, regular... 
//	si quiero comparar las clasificaciones, deberían de ser exactamente las mismas para que me las reconociese como películas similares. así que para el equals de clasificacion, al ser de tipo double, tengo que usar el objects.equals o, en su caso, también podría haber usado ==

}
