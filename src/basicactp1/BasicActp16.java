package basicactp1;

import java.util.Scanner;

public class BasicActp16 {

	public static void main(String[] args) {
		//Creamos el Scanner que permitirá a la máquina leer los valores introducidos por el usuario.
				Scanner read =new Scanner (System.in);
		//Pedimos al usuario dos valores al azar y declaramos las dos primeras variables, en este caso, "a" y "b".
			System.out.println ("Introduzca un número al azar: ");
				int a;
					a = read.nextInt();
			System.out.println ("Introduzca otra número al azar: ");
				int b;
					b = read.nextInt ();
		//Declaramos las demás variables, las cuales serán el resultado de las operaciones de los valores dados por el usuario.
					int c;
					int d;
					int e;
					int f;
				c = a + b;
				d = a - b;
				e = a * b;
				f = a / b;
		// Después de esto, se le mostrará en pantalla al usuario las operaciones llevadas a cabo con sus debidos resultados.
				System.out.println("La suma de " + a + " + " + b + " = " + c + ".");
				System.out.println("La resta de " + a + " - " + b + " = " + d + ".");
				System.out.println("La multiplicación de " + a + " * " + b + " = " + e + ".");
				System.out.println("La división de " + a + " / " + b + " = " + f + ".");
		//Finalmente cerramos el Scanner.
				read.close();

	}

}
