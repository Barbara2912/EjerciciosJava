package com.Funciones;

import java.util.Scanner;

public class EjercicioContarOvejasFOR {

	public static void contarOvejas(int numOvejas) {
		
		for (int i = 1; i <= numOvejas; i++) {
			
			if (i==1) {
				System.out.println(i + " oveja");
			} else {
				System.out.println(i + " ovejas");
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Programa una función llamada void contarOvejas(int numOvejas), que reciba un
		número entero e imprima en pantalla el número de ovejas utilizando un bucle for:
		Por ejemplo para 3 debería devolver 1 oveja...2 ovejas...3 ovejas…
		Nota que la primera oveja debería ir en singular.*/
		
		int numOvejas;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número");
		numOvejas=teclado.nextInt();
		
		contarOvejas(numOvejas);
		
		teclado.close();
	}

}
