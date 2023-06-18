package basicos;

public class Abecedario {

	public static void main(String[] args) {
		
		int letra = 90;
		
		for(int i=0;i<26;i++) {
			for(int j=i;j<26;j++) {
				System.out.print((char)letra);
				letra --;
				if(letra<65) {
					letra = 90;
				}
			}
			System.out.println();
			letra = 90-(i+1);
			
		}

	}

}
