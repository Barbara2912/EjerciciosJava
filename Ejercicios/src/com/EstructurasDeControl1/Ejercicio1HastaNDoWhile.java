package com.EstructurasDeControl1;

import java.util.Scanner;

public class Ejercicio1HastaNDoWhile {

	public static void main(String[] args) {
		// Escribe un programa que pida por teclado el valor de un número N y muestre por
		// pantalla todos los números desde 1 hasta N.

		int n, cont; 
				
		cont = 0;
			
		Scanner teclado = new Scanner (System.in);
				
		System.out.print( "Introduce un número" );
		n = teclado.nextInt();
		
		do {
				
			cont++;
		
			System.out.print(cont + " ");
			
		}while (cont<n);
		
				
				
		teclado.close();

	}

}
