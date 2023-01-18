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
	private double saldo;
	
	public static final double MAXCREDITO = 1000;
	//las constantes suelen nombrarse en mayúscula. la creo para que, aún en números rojos, sólo pueda retirarse con un máximo de 1000€ negativos.
	
	//constructores
	public Cuenta () {
		this.titular = new Persona();
		this.saldo = 0;
	}
	
	public Cuenta (Persona titular) {
		setTitular(titular);
		this.saldo = 0;
	}
	
	public Cuenta(Persona titular, double cantidad) {
		setTitular(titular);
		this.saldo = cantidad;
	}
	
	public Cuenta (String nombre, int edad, String dni, double saldo) { //este constructor facilita el crear una cuenta porque pide todos los datos en los parámetros. Los coge directamente aquí en vez de en la página principal
		this.saldo=saldo;
		this.titular = new Persona(nombre, edad, dni);
	}

	
	//getters & setters 
	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return saldo;
	}
	
	//otras funciones
	public String mostrar() {
		return "El titular " +getTitular().getNombre() + " tiene una cantidad de " + getCantidad() +" de euros en su cuenta corriente.";
		//del titular, dentro tiene un objeto que es persona y llamo a su función para coger el nombre
	}
	
	public void ingresar(double d) {
		if (d >0) {
			this.saldo = this.saldo + d;
		} 
	}
	
	public void retirar (double cantidad) {
		if (cantidad > 0   // si la cantidad a retirar es mayor que cero, y el resultado del saldo
				&& // menos la cantidad a retirar no se excede del máximo del crédito,
			(this.saldo- cantidad) >-MAXCREDITO) {
			this.saldo = this.saldo - cantidad; //se ejecuta la retirada
		}
	}
	public void transferenciaA(Cuenta c, double importe) {
		this.retirar(importe);; // de mi cuenta (esta) quito el importe de la transferencia
		c.ingresar(importe);; //al saldo de la otra persona se le ingresa la cantidad
		//this.saldo = this.saldo - importe; 
		//c.saldo = c.saldo + importe; 
		
	}
}
