package matrices;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int matriz[][] = new int [5][9];
		int traspuesta[][] = new int [9][5];
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz [i][j] = (int)(Math.random()*5);
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
		System.out.println("-----------");
		for(int i=0; i<traspuesta.length; i++) {
			for(int j=0; j<traspuesta[i].length; j++) {
				traspuesta[i][j] = matriz[j][i];
				System.out.print(traspuesta[i][j]);
			}
			System.out.println();
		}

	}

}
