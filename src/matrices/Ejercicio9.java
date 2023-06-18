package matrices;

public class Ejercicio9 {

	public static void main(String[] args) {
		  
		        int n = 5; // Número de columnas
		        if (n % 2 == 0 || n < 3) {
		            System.out.println("El número de columnas debe ser impar y mayor que 3");
		            return;
		        }
		        int[][] matriz = new int[n][n];
		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < matriz[i].length; j++) {
		                if (i == j || i == n - j - 1) {
		                    matriz[i][j] = 5;
		                }
		            }
		        }
		        for (int[] fila : matriz) {
		            for (int elemento : fila) {
		                System.out.print(elemento);
		            }
		            System.out.println();
		        }
		    }

	}


