package com.EstructurasDeControl2;

import java.util.Scanner;

public class EjercicioPositivoParDOWHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = 0;
		
		Scanner teclado=new Scanner (System.in);
		
		System.out.println("Introduce un número");
		n=teclado.nextInt();
		
		do {
			
			if (n>=1) {
				
				if (n%2==0) {
					System.out.println("El número " + n + " es positivo y es par");
				}
				
				if (n%2!=0) {
					System.out.println("El número " + n + " es positivo y es impar");
				}
				
			} else {
				
				if (n%2==0) {
					System.out.println("El número " + n + " es negativo y es par");
				}
				
				if (n%2!=0) {
					System.out.println("El número " + n + " es negativo y es impar");
				}
				
			}
			System.out.println(" ");
			System.out.println("Introduce un número");
			n=teclado.nextInt();	
			
			
		} while (n!=0);
		
		teclado.close();
	}

}
