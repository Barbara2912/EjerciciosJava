package com.Arrays;

import java.util.Scanner;

public class EjercicioPositivosNegativos {

	public static final int SIZE=10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Programa Java que guarda en un array 10 números enteros que se leen por
		teclado. A continuación, se recorre el array y calcula cuántos números son
		positivos, cuántos negativos y cuántos ceros.*/
		
		int num[];
		num=new int [SIZE];
		int cont0=0;
		int contp=0;
		int contn=0;
		Scanner teclado=new Scanner (System.in);
		
		for (int i = 0; i < SIZE; i++) {
			System.out.println("Introduce el número " + (i+1) + " del Array");
			num[i]=teclado.nextInt();
		}
		
		for (int i = 0; i < SIZE; i++) {
			if (num[i]==0) {
				cont0++;
			} else {
				if (num[i]>=1) {
					contp++;
				} else {
					contn++;
				}
			}
		}
		
		System.out.println("Hay " + cont0 + " ceros");
		System.out.println("Hay " + contp + " positivos");
		System.out.println("Hay " + contn + " negativos");
		
		teclado.close();
	}

}
