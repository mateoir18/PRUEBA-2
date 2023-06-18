package basicos;

public class Facturas {

	public static void main(String[] args) {
		
		int[]codigos = {1,2,3,4,5};
		int[]litros = {3,5,2,6,4};
		double precio = 10.00;
		
		double precioFinal = 0;
		int litrosVendidos = 0;
		int contadorFacturas = 0;
		int facturaciontotal = 0;
		int n = codigos.length;
		
		for(int i=0;i<n;i++) {
			precioFinal = precio* litros[i];
			litrosVendidos += litros[i];
			facturaciontotal += precioFinal;
			if(precioFinal > 600) {
				contadorFacturas ++;
			}
			System.out.println("El precio de la factura " + (i+1) + " es de " + precioFinal + "€ ");
		}
		System.out.println("La facturación total es " + facturaciontotal + " €.");
		System.out.println("La cantidad de litros vendidos es " + litrosVendidos + " litros.");
		System.out.println("Hay " + contadorFacturas + " facturas de más de 600 €.");
		
		
		

	}

}
