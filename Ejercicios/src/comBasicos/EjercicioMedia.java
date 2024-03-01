package comBasicos;

import java.util.Scanner;

public class EjercicioMedia {

	public static void main(String[] args) {
		// Realizar un programa que lea cuatro valores numéricos e informar su suma y
		// promedio.

		double n1, n2, n3, n4, suma, promedio;
		
		Scanner teclado = new Scanner ( System.in );
		
		System.out.println( "Introduce 4 números" );
		n1 = teclado.nextDouble();
		n2 = teclado.nextDouble();
		n3 = teclado.nextDouble();
		n4 = teclado.nextDouble();
		
		suma = n1 + n2 + n3 + n4;
		promedio = suma/4;
		
		System.out.println( "La suma de los valores es " + suma + " y el promedio es " + promedio );
		
		teclado.close();
		
	}

}
