package com.FuncionesSINTERMINAR;

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
		
		Scanner teclado=new Scanner (System.in);
		
		System.out.println("Introduzca una opción");
		System.out.println("1)Saludo");
		System.out.println("2)Nombre");
		System.out.println("0)Salir");
		
		
		
		
		teclado.close();
	}

}
