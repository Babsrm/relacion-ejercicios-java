package relacionEjerciciosObjetos.ejercicio03;

import relacionEjerciciosObjetos.ejercicio01.Persona;

/*Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular (que es una persona) y cantidad (puede tener decimales). El titular será obligatorio y la cantidad es opcional. Construye los siguientes métodos para la clase:
 * •Un constructor, donde los datos pueden estar vacíos.
 * •Los setters y getters para cada uno de los atributos. El atributo no se puede modificar directamente, sólo ingresando o retirando dinero.
 * •mostrar(): Muestra los datos de la cuenta.
 * •ingresar(cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
 * •retirar(cantidad): se retira una cantidad a la cuenta. La cuenta puede estar en números rojos.
 */

public class Cuenta {
	//variables
	private Persona titular;
	private double cantidad;
	
	//constructores
	public Cuenta () {
		this.titular = new Persona();
		this.cantidad = 0;
	}
	
	public Cuenta (Persona titular) {
		setTitular(titular);
		this.cantidad = 0;
	}
	
	public Cuenta(Persona titular, double cantidad) {
		setTitular(titular);
		this.cantidad = cantidad;
	}

	
	//getters & setters 
	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}
	
	//otras funciones
	public String mostrar() {
		return "El titular " +getTitular().getNombre() + " tiene una cantidad de " + getCantidad() +" de euros en su cuenta corriente.";
		//del titular, dentro tiene un objeto que es persona y llamo a su función para coger el nombre
	}
	
	public boolean ingresar(double d) {
		if (d >0) {
			this.cantidad = this.cantidad + d;
		} return true;
	}
	
	public boolean retirar (double cantidad) {
		if (cantidad > 0) {
			this.cantidad = this.cantidad - cantidad;
		}return true;
	}
}
