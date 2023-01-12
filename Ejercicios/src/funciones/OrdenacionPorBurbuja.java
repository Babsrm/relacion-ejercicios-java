package funciones;

public class OrdenacionPorBurbuja {
	public static void ordenarBurbuja (int vector[]) {
		int aux;
		
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector.length -1 -i; j++) {
				if( vector[j] > vector[j + 1]) {
					aux = vector[j];
					vector[j] = vector[j + 1];
					vector[j + 1] = aux;
				}
			}
		}
	}
	
	public static void ordenarBurbujaMejorado (int vector[]) {
		int aux;
		
		boolean hayCambios = true; //para avisarnos de que ha habido algún cambio de ordenación. Parará el bucle cuando deje de haber cambios en el orden del vector
		
		for (int i = 0; i < vector.length && hayCambios; i++) {
			hayCambios=false;
			for (int j = 0; j < vector.length -1 -i; j++) {
				if( vector[j] > vector[j + 1]) {
					aux = vector[j];
					vector[j] = vector[j + 1];
					vector[j + 1] = aux;
					hayCambios = true;
				}
			}
		}
	}
}
