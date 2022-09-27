package basicactp1;

import java.util.Scanner;

public class BasicActp17 {

	public static void main(String[] args) {
//Declaramos todas las variables necesarias y creamos el Scanner para que la máquina pueda leer los datos que introducirá el usuario.
				String nombre; 
				String calle;
				int numero;
			Scanner read = new Scanner(System.in);
//Solicitamos al usuario que nos diga su nombre, dirección y número de teléfono.
		System.out.print("Por favor, introduzca su nombre: ");
					nombre = read.nextLine();
		System.out.print("Por favor, introduzca su dirección: ");
					calle = read.nextLine();
		System.out.print("Por favor, introduzca su número de teléfono: ");
					numero = read.nextInt();
//Tras esto, se le mostrará en pantalla al usuario los datos introducidos
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + calle);
		System.out.println("Número de teléfono: " + numero);
//Finalmente, cerramos el Scanner.
		read.close();
	}

}
