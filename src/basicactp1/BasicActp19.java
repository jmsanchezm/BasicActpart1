package basicactp1;

import java.util.Scanner;

public class BasicActp19 {

	public static void main(String[] args) {
//Declaramos las variables y las constantes que necesitaremos.
				final double PESETA_VALOR = 0.006;
				int peseta;
				double euro;
//Creamos el Scanner.
			Scanner read = new Scanner(System.in);
//Solicitamos al usuario una cantidad de pesetas para pasarlas a euros.
		System.out.println("Introduzca una cantidad de pesetas que quiera transformar a euros: ");
					peseta = read.nextInt();
//Hacemos las operaciones necesarias, en este caso multiplicamos las peseta por su valor en euros. Y se le mostrará al usuario el resultado final.
				euro = peseta * PESETA_VALOR;
		System.out.println("La cantidad de pesetas introducidas, son " + euro + " euros.");
//Finalmente, cerramos el Scanner.
		read.close();
	}

}
