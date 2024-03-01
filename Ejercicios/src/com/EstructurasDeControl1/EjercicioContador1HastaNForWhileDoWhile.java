package com.EstructurasDeControl1;

import java.util.Scanner;

public class EjercicioContador1HastaNForWhileDoWhile {

	public static void main(String[] args) {
		// Escribe un programa que pida por teclado el valor de un número N y muestre por
		// pantalla todos los números desde 1 hasta N.
		// Resuelve este ejercicio de tres formas
		// distintas:
		// 1. Utilizando la estructura for
		// 2. Utilizando la estructura while
		// 3. Utilizando la estructura do .. while

		int n, cont;
		cont = 0;
		//BUCLE FOR
		Scanner teclado = new Scanner (System.in);
		
		System.out.println( "Introduce un número" );
		n = teclado.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.print( i + " " );
			
		}
		
		teclado.close();
		
		
		//BUCLE WHILE
		
		Scanner teclado2 = new Scanner (System.in);
		
		System.out.print( "Introduce un número" );
		n = teclado2.nextInt();
		
		while (cont<n) {
			
			cont++;
			
			System.out.print(cont + " ");
			
		}
		
		teclado2.close();
		
		
		//BUCLE DO-WHILE
			
		Scanner teclado3 = new Scanner (System.in);
				
		System.out.print( "Introduce un número" );
		n = teclado3.nextInt();
		
		do {
				
			cont++;
		
			System.out.print(cont + " ");
			
		}while (cont<n);
		
				
				
		teclado3.close();

		
	}

}
