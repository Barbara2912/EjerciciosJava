package com.Funciones;

import java.util.Scanner;

public class EjercicioBoolean1 {

	public static boolean sonIguales (int a, int b) {
		
		if (a==b) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;
		
		Scanner teclado=new Scanner (System.in);
		
		System.out.println("Introduce dos números");
		a=teclado.nextInt();
		b=teclado.nextInt();
		
		sonIguales (a, b);
		
		if (sonIguales (a, b)==true) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}
		
		teclado.close();
	}

}
