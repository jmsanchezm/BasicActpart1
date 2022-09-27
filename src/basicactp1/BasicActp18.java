package basicactp1;

import java.util.Scanner;

public class BasicActp18 {

	public static void main(String[] args) {
//Declaramos las variables correspondientes. En este caso son nombre y edad.
			String nombre;
			int edad;
//Creamos el Scanner.
		Scanner read = new Scanner (System.in);
//Pedimos al usuario introducir su nombre y, posteriormente, la edad.
	System.out.print("Introduzca su nombre: ");
				nombre = read.nextLine();
	System.out.print("Introduzca su edad: ");
				edad = read.nextInt();
//Como resultado, se le mostrará en pantalla al usuario los datos introducidos en la siguiente frase.
	System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
//Finalmente, cerramos el Scanner.
			
	read.close ();
	}

}
