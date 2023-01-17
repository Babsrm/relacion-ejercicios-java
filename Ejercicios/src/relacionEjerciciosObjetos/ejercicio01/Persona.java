package relacionEjerciciosObjetos.ejercicio01;

/*Ejercicio 1. Vamos a crear una clase llamada Persona. Sus atributos son: nombre, edad y DNI. Construye los * siguientes métodos para la clase:
•Un constructor, donde los datos pueden estar vacíos.
•Los setters y getters para cada uno de los atributos. Hay que validar las entradas de datos.
•mostrar(): Muestra los datos de la persona.
•esMayorDeEdad(): Devuelve un valor lógico indicando si es mayor de edad.*/


public class Persona {
	//variables
	private String nombre;
	private int edad;
	private String dni;
	
	//constructores
	public Persona () {
		this.nombre = "";
		this.edad = 0;
		this.dni = "";
	}
	public Persona(String nombre, int edad, String dni) {
		this.setNombre(nombre); //usando aquí los set, valido los datos siempre y es más correcto
		this.setEdad(edad);
		this.setDni(dni);
	}
	
	public Persona (Persona p) { //constructor de copia, hace una fotocopia del objeto que se pasa por parametro
		this.setNombre(p.nombre); 
		this.setEdad(p.edad);
		this.setDni(p.dni);
	}
	
	//getters & setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
	this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		if (edad > 0) {
		this.edad = edad;}
	}
	public String getDni() {
		return dni;
	}
	public boolean setDni(String dni) {
		if (dni.length()==9 && Character.isLetter(dni.charAt(8))) {
			//que tenga una longitud de 9 caracteres y que en la posición 8 sea una letra
		this.dni = dni;
		return true;
		}	else { System.err.println("mal dni"); //no es correcto usar un syso en una función; lo correcto es usar una excepción pero aún no sé utilizarlas. por ello, dejo este mensaje como controlador de error
			return false;
		}
		}
	public String mostrar() {
			return "" +this.nombre + ", " + this.edad +" años y con dni número " +this.dni;
	}
	
	public boolean esMayorDeEdad() {
		if (this.edad >17) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
}
