package com.FuncionesSINTERMINAR;

import java.util.Scanner;

public class EjercicioNumeroMayor {

	public static int mayorNumero (int n1, int n2) {
		
		if (n1>n2) {
			return n1;
		} else {
			return n2;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2;
		
		Scanner teclado=new Scanner (System.in);
		
		System.out.println("Introduce dos números para saber cuál es mayor");
		n1=teclado.nextInt();
		n2=teclado.nextInt();
		
		System.out.println("El mayor es " + mayorNumero (n1, n2));
		
		teclado.close();
		
	}

}
