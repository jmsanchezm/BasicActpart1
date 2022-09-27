package basicactp1;

import java.util.Scanner;

public class BasicActp14 {

	public static void main(String[] args) {
//Creamos el Scanner y declaramos las variables correspondientes.
			Scanner read = new Scanner (System.in);
				float primNota;
				float segNota;
				float notaMedia;
//Solicitamos al usuario las notas y obligamos al Scanner a que lea el teclado.
			System.out.print ("Introduzca una de las dos notas: ");
					primNota = read.nextFloat();
			System.out.print ("Introduzca la segunda nota: ");
					segNota = read.nextFloat();
//Inicializamos, en este caso la nota media, la cual se dará como resuktado de la media aritmética de los datos introducidos
				notaMedia = (primNota + segNota)/2;
//Posteriormnte, se le mostrará en pantalla al usuario el resultado.
			System.out.println("Según los datos introducidos, la media aritmética es de un " + notaMedia);
//Finalmente, cerraremos el Scanner.
				read.close();

			
	}

}
