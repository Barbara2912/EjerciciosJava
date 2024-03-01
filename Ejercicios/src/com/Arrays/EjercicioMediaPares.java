package com.Arrays;

import java.util.Scanner;

public class EjercicioMediaPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Programa Java que lea 10 números enteros por teclado y los guarde en un array.
		Calcula y muestra la media de los números que estén en las posiciones pares del array.
		Considera la primera posición del array (posición 0) como par.*/
		
		double media,suma;
		int size;
		int []num; //declaración Array
		int cont=0;
		//int i; //índice para recorrer el Array
		Scanner teclado=new Scanner (System.in);
		System.out.println("Introduce el tamaño del Array");
		size=teclado.nextInt();
		num=new int[size]; //asignación memoria Array	
		
		 //inserción de datos
		for (int i = 0; i <size; i++) {
			System.out.println("Introduce el número " + (i+1) + " para calcular su media");
			num[i]=teclado.nextInt();
		}
		//media
		suma=0;
		for (int i = 0; i < size; i++) {
			
			if (i%2==0 || i==0) {
				cont++;	
				suma=suma+num[i];
			}
			
		}
		media=suma/cont;
		
		System.out.println("La media es " + media);
		teclado.close();
		
		
		
	}

}
