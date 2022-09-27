package basicactp1;

import java.util.Scanner;

public class BasicActp12 {

	public static void main(String[] args) {
//Primeramente, le pedimos al usuario su edad y declaramos la variable.
		System.out.print ("Por favor, introduzca su edad: ");
				int edad;
//Creamos el Scanner para que lea lo que introduzca el usuario en el teclado.
			Scanner read = new Scanner (System.in);
					edad= read.nextInt();
//Según al dato introducido, en este caso la edad, se le sumará uno, que será la edad que el usuario cumplirá el año posterior.
					edad++;
		System.out.print("La edad que tendrá el año que viene serán " + edad + " años." );
//Finalmente, cerramos el Scanner.
	read.close();

	}

}
