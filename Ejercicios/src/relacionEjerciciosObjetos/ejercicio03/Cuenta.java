package relacionEjerciciosObjetos.ejercicio03;
/*Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular (que es una persona) y cantidad (puede tener decimales). El titular será obligatorio y la cantidad es opcional. Construye los siguientes métodos para la clase:
 * •Un constructor, donde los datos pueden estar vacíos.
 * •Los setters y getters para cada uno de los atributos. El atributo no se puede modificar directamente, sólo ingresando o retirando dinero.
 * •mostrar(): Muestra los datos de la cuenta.
 * •ingresar(cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
 * •retirar(cantidad): se retira una cantidad a la cuenta. La cuenta puede estar en números rojos.
 */

public class Cuenta {
	//variables
	private String titular;
	private float cantidad;
	
	//constructores
	public Cuenta (String titular) {
		this.titular = titular;
		this.cantidad = 0;
	}
	
	public Cuenta(String titular, float cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}

	
	//getters & setters 
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		if (ingresar(cantidad) || retirar(cantidad)) {
		this.cantidad = cantidad;	
		}
	}
	
	//otras funciones
	public String mostrar() {
		return "El titular " +this.titular + " tiene una cantidad de " + this.cantidad +" de euros en su cuenta corriente.";
	}
}
