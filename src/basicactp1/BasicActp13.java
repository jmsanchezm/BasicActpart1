package basicactp1;

import java.util.Scanner;

public class BasicActp13 {

	public static void main(String[] args) {

// Comenzamos abriendo el Scanner para que la máquina lea todo lo que introduzca el usuario.+
			Scanner read = new Scanner (System.in);
//Pedimos al usuario que introduzca el años en el que se encuentra, además de declarar la primera variable, que en este caso será actual.
		System.out.print("Introduzca el año en el que se encuentre: ");
				int actual;
					actual = read.nextInt();
//Una vez puesto el dato anterior, pedimos al usuario que introduzca su año de nacimiento. También declaramos la varible nacimiento.
		System.out.print("Introduzca su año de nacimiento: ");
				int nacimiento;
				int edad;
					nacimiento = read.nextInt();
// Para calcular la edad del usuario se calculará la diferencia entre los años introducidos, lo que nos dará la edad de este.
					edad = actual-nacimiento;
		System.out.print("Según los datos introducidos, usted tiene " + edad + " años.");
//Finalmente, cerramos el Scanner.
		read.close();
	}

}
