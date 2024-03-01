package com.Generales;

import java.util.Scanner;

public class EjercicioIntercambiar2Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c;
		
		Scanner teclado=new Scanner (System.in);
		
		System.out.println("Introduce dos valores");
		c=teclado.nextInt();
		b=teclado.nextInt();
		
		
		a=c;
		
		a=b;
		b=c;
		
		System.out.println("Ahora el primer número es " + a + " y ahora el segundo número es " + b);
	
		
		teclado.close();
		
	}

}
