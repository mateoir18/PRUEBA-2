package basicos;

public class Matrices {

	public static void main(String[] args) {
		
		int matriz [][] = new int [8][7];
		
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}


	}

}
