package com.Arrays;

import java.util.Scanner;

public class EjercicioMedia {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Usando arrays crea un programa en Java que calcule la media de una serie de números
		que se leen por teclado.*/
		
		float media;
		int suma;
		int t;
		int []num; //declaración Array
		//int i; //índice para recorrer el Array
		Scanner teclado=new Scanner (System.in);
		System.out.println("Introduce el tamaño del Array");
		t=teclado.nextInt();
		num=new int[t]; //asignación memoria Array	
		
		 //inserción de datos
		for (int i = 0; i <t; i++) {
			System.out.println("Introduce el número " + (i+1) + " para calcular su media");
			num[i]=teclado.nextInt();
		}
		//media
		suma=0;
		for (int i = 0; i < t; i++) {
			suma=suma+num[i];
		}
		media=suma/t;
		
		System.out.println("La media es " + media);
		teclado.close();
				
	}

}
