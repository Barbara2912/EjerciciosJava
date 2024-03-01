package com.Generales;

import java.util.Scanner;

public class EjercicioNumerosPerfectos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, d, suma;
		
		suma=0;
		
		Scanner teclado=new Scanner (System.in);
		
		System.out.println("Introduce un número");
		n=teclado.nextInt();
		
		for (int i = 1; i < n; i++) {
			
			d=n%i;
			
			if (d==0) {
				
				suma=suma+i;
				System.out.println(i);
			}
			
		}
		
		if (suma==n) {
			
			System.out.println("El número " + n + " es perfecto");
			
		}else {
			
			System.out.println("El número " + n + " no es perfecto");
			
		}
	
		
		teclado.close();
		
		
		
	}

}
