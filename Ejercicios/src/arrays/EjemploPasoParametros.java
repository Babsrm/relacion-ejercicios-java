package arrays;

public class EjemploPasoParametros {

	public static void main(String[] args) {
		int vector [] = new int[10];
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i] + " ");
		}
		cambiaValor(vector, 0, 9);
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i] + " ");
		}

	}
	
	public static void cambiaValor (int vector[], int posicion, int valor) {
		if (posicion>=0 && posicion<vector.length) {
			vector[posicion] = valor;
		}
	}

}
