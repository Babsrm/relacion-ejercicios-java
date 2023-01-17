package relacionEjerciciosObjetos.ejercicio02;

/*
•Se tiene un código que modela una clase Avión que posee dos atributos: nombre del fabricante del avión (tipo String) y número de motores del avión (tipo int). La clase tiene un constructor y métodos get y set para cada atributo. Además, tiene los siguientes métodos adicionales: 
•Un método denominado imprimirFabricante(), que muestra en pantalla el nombre del fabricante de un avión. 
•Un método denominado cambiarFabricante(Avión a), que recibe como parámetro un objeto de tipo Avión y le cambia el valor de su atributo fabricante al valor del fabricante pasado como parámetro. */

public class Avion {
	//variables
	private String fabricante;
	private int numMotores;
	
	//constructores
	public Avion() {
		this.fabricante = "";
		this.numMotores = 0;
	}
	public Avion(String fabricante, int numMotores) {
		this.fabricante = fabricante;
		this.numMotores = numMotores;
	}
	
	
	//getters & setters
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public int getNumMotores() {
		return numMotores;
	}
	public void setNumMotores(int numMotores) {
		this.numMotores = numMotores;
	}
	
	//otras funciones
	public String imprimirFabricante() {
		return "El fabricante del avión es " +getFabricante() + " y tiene " + getNumMotores() +" motores.";
	}
	
	public void cambiarFabricante(Avion avion) {
		this.fabricante = avion.fabricante;
	}
	
	
}
