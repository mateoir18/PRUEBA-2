package basicos;

public class Edad_Altura {

	public static void main(String[] args) {
		
		int A1_edad = 10;
		double A1_altura =1.75;
		
		int A2_edad = 13;
		double A2_altura =1.70;
		
		int A3_edad = 15;
		double A3_altura =1.80;
		
		int A4_edad = 18;
		double A4_altura =1.82;
		
		int A5_edad = 20;
		double A5_altura =1.90;
		
		double sumaAlturas = A1_altura + A2_altura + A3_altura + A4_altura + A5_altura;
		int sumaEdades = A1_edad + A2_edad + A3_edad + A4_edad + A5_edad;
		
		int mayores_18 = 0;
		int mas_de_175 = 0;
		
		double mediaEdad = sumaEdades/5;
		double alturaMedia = sumaAlturas/5;
		
		if(A1_edad > 18) {
			mayores_18++;
		}
		if(A2_edad > 18) {
			mayores_18++;
		}
		if(A3_edad > 18) {
			mayores_18++;
		}
		if(A4_edad > 18) {
			mayores_18++;
		}
		if(A5_edad > 18) {
			mayores_18++;
		}
		
		
		
		if(A1_altura> 1.75) {
			mas_de_175++;
		}
		if(A2_altura> 1.75) {
			mas_de_175++;
		}
		if(A3_altura> 1.75) {
			mas_de_175++;
		}
		if(A4_altura> 1.75) {
			mas_de_175++;
		}
		if(A5_altura> 1.75) {
			mas_de_175++;
		}
		
		System.out.println(" Altura Media = "+ alturaMedia + " Media Edad= " + mediaEdad + " Mayores de 18 = " + mayores_18 + " miden mas de 1.75= " + mas_de_175);
		

		
		
		

	}

}
