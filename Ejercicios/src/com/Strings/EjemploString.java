package com.Strings;

import java.util.Scanner;

public class EjemploString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*1.Solicito 2 cadenas al usuario*/
		/*Recojo las cadenas*/
		/*Concateno*/
		/*Muestro la concatenación*/
		String cadena1, cadena2, concat;
		
		Scanner teclado=new Scanner (System.in);
		
		System.out.println("Introduce la primera palabra");
		cadena1=teclado.next();
		
		System.out.println("Introduce la segunda palabra");
		cadena2=teclado.next();
		
		concat = cadena1.concat(" " + cadena2);
		System.out.println(concat);
		
		
		teclado.close();
	}

}
