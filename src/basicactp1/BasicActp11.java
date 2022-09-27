package basicactp1;

import java.util.Scanner;

public class BasicActp11 {

	public static void main(String[] args) {
		//Comenzamos pidiendo al usuario un número al azar.
		System.out.print("Introduzca un número al azar: ");
		//Creamos el Scanner porque el que se leeran todos los datos introducidos en el teclado. Además  declaramos o inicializamos la variable
			Scanner read =new Scanner (System.in);
			int num;
			num = read.nextInt();
		// Como respuesta, la máquina le devolverá la cifra introducida por el usuario.
		System.out.print("El número introducido es " + num);
		//Finalmente, cerramos el Scanner.
			read.close();
	}

}
