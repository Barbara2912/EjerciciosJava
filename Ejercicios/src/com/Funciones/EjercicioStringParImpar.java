package com.Funciones;

import java.util.Scanner;

public class EjercicioStringParImpar {

	public static String parOimpar (int n){
		
		if (n%2==0) {
			return "Par";
		} else {
			return "Impar";
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		
		Scanner teclado=new Scanner (System.in);
		
		System.out.println("Introduce un número para saber si es par o impar");
		n=teclado.nextInt();
		
		System.out.println(parOimpar (n));
	
		teclado.close();
		
	}

}
