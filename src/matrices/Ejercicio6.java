package matrices;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int matriz[][] = new int[10][10];
		int[]sumaFila = new int[10];
		int[]sumaColumna = new int[10];
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				int numeros = (int)(Math.random()*5);
				matriz[i][j] = numeros;
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				sumaFila[i] += matriz[i][j];
			}
		}
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				sumaColumna[j] += matriz[i][j];
			}
		}
		for(int i=0; i<sumaFila.length; i++) {
			System.out.println("La suma de la fila " + (i+1) + " es" + ":" + sumaFila[i]);
		}
		for(int i=0; i<sumaColumna.length; i++) {
			System.out.println("La suma de la columna " + (i+1) + " es" + ":" + sumaColumna[i]);
		}
		
		

	}

}
