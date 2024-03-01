package comBasicos;

import java.util.Scanner;

public class EjercicioProducto {

	public static void main(String[] args) {
		// Escribir un programa en el cual se ingresen cuatro números, calcular e informar la
		// suma de los dos primeros y el producto del tercero y el cuarto.
		
		int n1, n2, n3 ,n4, suma, producto;
		
		Scanner teclado = new Scanner ( System.in );
		
		System.out.println( "Introduce 4 números" );
		n1 = teclado.nextInt();
		n2 = teclado.nextInt();
		n3 = teclado.nextInt();
		n4 = teclado.nextInt();
		 
		suma = n1+n2;
		producto = n3*n4;
		 
		System.out.println( "La suma de los dos primeros números es " + suma );
		System.out.println( "y el producto de los dos últimos números es " + producto );
		 
		teclado.close();
		
	}

}
