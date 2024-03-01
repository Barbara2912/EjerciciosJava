package com.EstructurasDeControl2;

import java.util.Scanner;

public class EjercicioPositivoParDOWHILE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		char n2;
		
		Scanner teclado=new Scanner (System.in);
		
			do {
				System.out.println("Introduce un número");
				n=teclado.nextInt();
				
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
				
				System.out.println("¿Desea introducir más números?(S/N)");
				n2=teclado.next().charAt(0);
				
			} while (n2=='S' || n2=='s');
			
			teclado.close();		
	
	}
	
}
