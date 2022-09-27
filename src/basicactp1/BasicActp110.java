package basicactp1;

import java.util.Scanner;

public class BasicActp110 {

	public static void main(String[] args) {
			final int IVA= 21;
			float precio;
			float precioIva;
			float precioIvaFinal;
		Scanner read = new Scanner (System.in);
		System.out.print("Introduzca el precio del artículo sin IVA: ");
			precio = read.nextFloat();
		
		precioIva = (precio*IVA)/100;
		precioIvaFinal = precio + precioIva ;
		
		System.out.println("El precio con IVA del artículo introducido es "+ precioIvaFinal);
		
		

	}

}
