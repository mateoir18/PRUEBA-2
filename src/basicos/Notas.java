package basicos;

public class Notas {

	public static void main(String[] args) {
		
		int notas[] = {3,7,9,8,4,5};
		int aprobados = 0;
		int suspensos = 0;
		int condicionados = 0;
		int numeroNotas = notas.length;
		
		for(int i=0;i<numeroNotas;i++) {
			if(notas[i]==4) {
				condicionados ++;
				suspensos ++;
			}
			else if(notas[i]>=5) {
				aprobados ++;
			}
			else {
				suspensos ++;
			}
		}
		System.out.println("Han suspendido " + suspensos + " alumnos");
		System.out.println("Han aprobado " + aprobados + " alumnos");
		System.out.println("Estan condicionados " + condicionados + " alumnos");



	}

}
