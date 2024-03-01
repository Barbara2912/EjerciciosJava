package com.Funciones;

import java.util.Scanner;

public class EjercicioMenuOpciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Escriba el procedimiento void menuOpciones () que mostrará un menú utilizando un
		bucle do while que leerá un número después de mostrar las siguientes opciones:
		Introduzca una opción:
		1) Saludo
		2) Nombre
		0) Salir
		La opción 1 imprime “Hola” y vuelve a mostrar el menú.
		La opción 2 imprime “Soy Java” y vuelve a mostrar el menú.
		La opción 0 imprime “Adios” y sale del menú.*/
		
		int n;
		String nombre;
		
		Scanner teclado=new Scanner (System.in);
		
		do {
			
			System.out.println("Introduzca una opción");
			System.out.println("1)Saludo");
			System.out.println("2)Nombre");
			System.out.println("0)Salir");
			n=teclado.nextInt();
			
			switch (n) {
			case 1:
				saludo(n);
				break;
			case 2:
				System.out.println("Introduce tu nombre");
				nombre=teclado.next();
				nombre(nombre);
				break;
			}

		} while (n==1 || n==2);
				
		
		teclado.close();
	}

	public static void saludo (int n) {
		System.out.println("¡Hola!");
	} 
	
	public static void  nombre (String nombre) {
		System.out.println( "Hola, mi nombre es " + nombre);
	}
}
