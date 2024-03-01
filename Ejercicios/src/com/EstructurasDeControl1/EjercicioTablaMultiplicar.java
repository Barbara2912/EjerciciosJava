package com.EstructurasDeControl1;

import java.util.Scanner;

public class EjercicioTablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número para mostrar su tabla de multiplicar");
		n = teclado.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(n + "*" + i + "=" + n*i);
		}
		
		teclado.close();
		
	}

}
