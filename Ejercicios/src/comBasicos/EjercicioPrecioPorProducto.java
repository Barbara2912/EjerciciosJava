package comBasicos;

import java.util.Scanner;

public class EjercicioPrecioPorProducto {

	public static void main(String[] args) {
		// Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la
		// cantidad que lleva el cliente. Mostrar lo que debe abonar el comprador.

		double precio, producto;
		int n;
		
		Scanner teclado = new Scanner ( System.in );
		
		System.out.println( "Introduce el precio del producto y la cantidad que desea" );
		precio = teclado.nextDouble();
		n = teclado.nextInt();
		
		producto = precio * n;
		
		System.out.println( "El precio total es " + producto );	
		
		teclado.close();
		
	}

	
	
}
