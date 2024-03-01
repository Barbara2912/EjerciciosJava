package com.EstructurasDeControl1;

import java.util.Scanner;

public class EjercicioNegativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, n, cont;
		
		Scanner teclado = new Scanner (System.in);
		
		i=0;
		cont=0;
		do {
			
			System.out.println("Introduce un número");
			n=teclado.nextInt();
			
			if (n%10==2) {
				
				cont++;
				
			} else if (n<0){

				i=1;
			}
			
			
		} while (i==0);
		
		System.out.println("Hay " + cont+ " números que acaban en 2 ");
		
		teclado.close();
	}

}
