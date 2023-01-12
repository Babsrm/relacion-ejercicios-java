package funciones;

public class OrdenacionPorSeleccion {

	public static void ordenacionPorSeleccion (int vector[]) {
		int auxMenor;
		int posicionMenor;
		
		for (int i = 0; i < vector.length -1; i++) {
			auxMenor = vector[i];
			posicionMenor = i;
			
			for (int j =  i +1; j < vector.length; j++) {
				
				if (vector[j] < auxMenor) {
					auxMenor = vector[j];
					posicionMenor = j;
				}
			}
			vector[posicionMenor] = vector[i];
			vector[i] = auxMenor;
		}
	}
}
//esta funcion marca al empezar que la casilla con menor valor del array es v[0] y recorre todo el array en busca de uno que sea menor que él.
//si lo encuentra, coloca el menor valor en v[0] (intercambiando con la otra posición donde se encontraba ese menor) y pasa a comprobar v[1]. si no lo encuentra, mantiene ese valor minimo en v[0] y sigue recorriendo el array desde v[1]. 
//Y sucesivo