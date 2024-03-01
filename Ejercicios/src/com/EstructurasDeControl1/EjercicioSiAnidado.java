package com.EstructurasDeControl1;

import java.util.Scanner;

public class EjercicioSiAnidado {

	public static void main(String[] args) {
		// Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un
		// número negativo.
		
		int n1, n2;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println( "Introduce dos números para saber cuál es el mayor y cuál es el menor" );
		
		n1 = teclado.nextInt();
		n2 = teclado.nextInt();
		
		if (n1==n2) {
			
			System.out.println( "Los dos son iguales" );
			
		}else {
			
			if (n1>n2) {
				
				System.out.println( n1 + " Es mayor que " + n2 );
				
			}
			else {
					System.out.println( n2 + " Es mayor que " + n1 );}
		}
		
		teclado.close();
		
	}
				
				
}

