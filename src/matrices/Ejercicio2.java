package matrices;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int matriz1 [][] = new int[4][4];
		boolean simetrica=true;
		
		
		for(int f=0;f<4;f++) {
			for(int c=0;c<4;c++) {
				int numerosAleatorios = (int)(Math.random()*10);
				matriz1[f][c] = numerosAleatorios;
				System.out.print(matriz1[f][c]);
			}
			System.out.println();
			}
	
		for(int i=0;i<4&& simetrica;i++) {
			for(int j=0;j<4&&simetrica;j++) {
				if(matriz1[i][j] != matriz1[j][i]) {
					simetrica=false;	
				}
				
			}
			System.out.println();
		}
		System.out.println("-------------");
		
		
		if(simetrica == true) {
			System.out.println("La matriz es simetrica");
		}
		if(simetrica == false) {
			System.out.println("La matriz no es simetrica");
		}
		}
		

	}


