package matrices;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int matriz[][] = new int[3][3];
		int traspuesta[][] = new int[3][3];
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				int NumerosAleatorios =(int)(Math.random()*5);
				matriz[i][j] = NumerosAleatorios;
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
		System.out.println("Matriz traspuesta");
		for(int i=0; i<matriz.length;i++) {
			for(int j=0; j<matriz[i].length; j++) {
				traspuesta[i][j] = matriz[j][i];
				System.out.print(traspuesta[i][j]);
			}
			System.out.println();
		}

	}

}
