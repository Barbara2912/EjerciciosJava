package com.EstructurasDeControl1;

import java.util.Scanner;

public class EjercicioCuadradoDoWhile {

	public static void main(String[] args) {
		// Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un
		// número negativo.
		
		int n, cuadrado;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println( "Introduce un número para saber el cuadrado" );
		n = teclado.nextInt();
		
		do {
			
			cuadrado= n*n;
			
			System.out.println(cuadrado);
			
			System.out.println( "Introduce otro número para saber el cuadrado" );
			n = teclado.nextInt();
			
		}while (n>=0);
		
		System.out.println( "El número introducido debe ser mayor que 0" );
		
		
		teclado.close();
		
	}

}
