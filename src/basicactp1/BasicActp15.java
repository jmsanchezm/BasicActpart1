package basicactp1;

import java.util.Scanner;

public class BasicActp15 {

	public static void main(String[] args) {
		// Pedimos al usuario un valor el cual será el radio de una circunferencia, de la cual se quiere calcular el área y la longitud.
				System.out.print("Introduzca el valor del radio de la circunferencia para calcular la longitud y el área: ");
		//Creamos el Scanner , que nos permitirá leer el teclado.Declaramos las variables, en este caso serán el radio, el área y la longitud. De las cualés estas dos últimas serán calculadas por operaciones.
				Scanner read =new Scanner (System.in);
					double radio;
					radio = read.nextDouble();
		//Declaramos las variables del área y longitud, que serán calculadas mediante fórmulas.
					double area = Math.PI * radio * radio;
					double longitud = Math.PI * radio * 2;
		//Una vez hecho todo lo anterior, se le mostrará en pantalla al usuario los resultados.
				System.out.println("El área de la circunferencia cuyo valor es "+ radio +" , es " + area);
				System.out.println("La longitud de la circunferencia cuyo valor es "+ radio + ", es " + longitud);
		//Finalmente, cerramos el Scanner.
				read.close();
	}

}
