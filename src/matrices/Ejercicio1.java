package matrices;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int matriz [][] = new int [5][5];
		
		for(int f=0;f<5;f++) {
			for(int c=0;c<5;c++) {
				matriz[f][c] = f+c;
			}
		}
		for(int f=0;f<5;f++) {
			for(int c=0;c<5;c++) {
				System.out.print(matriz[f][c]);
			}
			System.out.println();
		}

	}

}
