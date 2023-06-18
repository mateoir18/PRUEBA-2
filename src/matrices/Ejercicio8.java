package matrices;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int marco[][] = new int [8][6];
		
		for(int i=0; i<marco.length; i++) {
			for(int j=0; j<marco[i].length; j++) {
				if(j==0 || i==0 || j==5 || i==7) {
					marco[i][j] = 0;
				}
				else {
					marco[i][j] = 1;
				}
				System.out.print(marco[i][j]);
				
			}
			System.out.println();
			
		}

	}

}
