package relacionEjerciciosObjetos.ejercicio05;
/*
Desarrolla una clase Cafetera con atributos _capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y _cantidadActual (la cantidad actual de café que hay en la cafetera). Implementa, al menos, los siguientes métodos:
•Constructor predeterminado: establece la capacidad máxima en 1000 (c.c.) y la actual en cero (cafetera vacía).
•Constructor con la capacidad máxima de la cafetera; inicializa la cantidad actual de café igual a la capacidad máxima.
•Constructor con la capacidad máxima y la cantidad actual. Si la cantidad actual es mayor que la capacidad máxima de la cafetera, la ajustará al máximo.
•Getters y setters
•llenarCafetera(): pues eso, hace que la cantidad actual sea igual a la capacidad.
•servirTaza(int): simula la acción de servir una taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
•vaciarCafetera(): pone la cantidad de café actual en cero.
•agregarCafe(int): añade a la cafetera la cantidad de café indicada.*/

public class Cafetera {
	private double capacidadMaxima;
	private double cantidadActual;
	
	//constructores
	public Cafetera() {
		setCapacidadMaxima(1000);
		setCantidadActual(0);
	}
	
	public Cafetera (double capacidadMaxima) {
		setCapacidadMaxima(capacidadMaxima);
		setCantidadActual(capacidadMaxima);
	}
	
	public Cafetera (double capacidadMaxima, double cantidadActual) {
		if (cantidadActual > capacidadMaxima) {
			setCapacidadMaxima(capacidadMaxima);
			setCantidadActual(capacidadMaxima);
		} else {
			setCapacidadMaxima(capacidadMaxima);
			setCantidadActual(cantidadActual);
		}
	}
	
	//getters & setters
	public double getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(double capacidadMaxima) {
		if (capacidadMaxima>0)
		this.capacidadMaxima = capacidadMaxima;
	}

	public double getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(double cantidadActual) {
		if (cantidadActual >=0)
		this.cantidadActual = cantidadActual;
	}
	//•llenarCafetera(): pues eso, hace que la cantidad actual sea igual a la capacidad.
	public void llenarCafetera () {
		setCantidadActual(capacidadMaxima);
	}
	//•servirTaza(int): simula la acción de servir una taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
	public void servirTaza(double capacidadTaza) {
		if (capacidadTaza > cantidadActual) {
			cantidadActual = 0;
		} else {
			cantidadActual = cantidadActual - capacidadTaza;
		}
	}
	//•vaciarCafetera(): pone la cantidad de café actual en cero.
	public void vaciarCafetera() {
		setCantidadActual(0);
	}
	//•agregarCafe(int): añade a la cafetera la cantidad de café indicada.
	public void agregarCafe (int cantidad) {
		if (cantidad > capacidadMaxima) {
			setCantidadActual(capacidadMaxima);
		} else {
			setCantidadActual(cantidad);
		}
	}
	public String mostrarCafetera() {
		return "La cafetera tiene una capacidad máxima de " +getCapacidadMaxima() +" y una cantidad actual de " +getCantidadActual();
	}
}
