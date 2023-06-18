package matrices;

public class Ejercicio3 {

	public static void main(String[] args) {
		int matriz1[][] = new int[3][3];
		int matriz2[][] = new int[3][3];
		int matrizsuma[][] = new int[3][3];
		
		
		for(int i=0;i<matriz1.length;i++) {
			for(int j=0;j<matriz1[i].length;j++) {
				int NumerosAleatorios = (int)(Math.random()*4);
				matriz1[i][j] = NumerosAleatorios;
				System.out.print(matriz1[i][j]);
			}
			System.out.println();
		}
		System.out.println("+");
		for(int i=0;i<matriz2.length;i++) {
			for(int j=0;j<matriz2[i].length;j++) {
				int NumerosAleatorios = (int)(Math.random()*4);
				matriz2[i][j] = NumerosAleatorios;
				System.out.print(matriz2[i][j]);
			}
			System.out.println();
		}
		System.out.println("=");
		
		for(int a=0; a<matrizsuma.length; a++) {
			for(int b=0; b<matrizsuma[a].length; b++) {
				matrizsuma[a][b] = matriz1[a][b] + matriz2[a][b];
				System.out.print(matrizsuma[a][b]);
			}
			System.out.println();
		}

	}

}
