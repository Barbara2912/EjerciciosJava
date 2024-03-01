package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioMenu {

	public static void mostrar(int [] notas) {
		
		for (int i = 0; i < SIZE; i++) {
			System.out.println("La " + (i+1) + "ª nota es " + notas[i]);
		}
		
	}
	
	public static void ordenar (int [] notas) {
		
		Arrays.sort(notas);
		for (int i = 0; i < SIZE; i++) {
			System.out.println(notas[i]);
		}	
		
	}
	
	public static void buscar (int [] notas, Scanner teclado) {
		
		int cont=0;
		int n;
		System.out.println("Introduce la nota que quieres buscar");
		n=teclado.nextInt();
		for (int i = 0; i < SIZE; i++) {
			if (notas[i]==n) {
				System.out.println("La nota está en la posición " + i);
			} else {
				cont++;
			}
			if (cont>=10) {
				System.out.println("La nota introducida no aparece en el array");
			}
		}
	}
	
	public static double mostrarMedia (int [] notas) {
		
		double suma, media;
		suma=0;
		
		for (int i = 0; i < SIZE; i++) {
			suma=suma+notas[i];
		}
		media=suma/SIZE;
		return media;
	}
	
	public static int mostrarAprobados (int [] notas) {
		
		int cont=0;
		int aprobado;
		
		for (int i = 0; i < SIZE; i++) {
			
			if (notas[i]>=5) {
				cont++;
			}
		}
		
		aprobado=cont;
		return aprobado;
	}
	
	public static int mostrarNotaMasAlta (int [] notas) {
		
		int mayor=0;
		
		for (int i = 0; i < SIZE; i++) {
		
			if (notas[i]>mayor) {
				mayor=notas[i];
			}
		
		}
		return mayor;
	}
	
	public static final int SIZE=10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		int notas[];
		notas=new int [SIZE];
		
		Scanner teclado=new Scanner (System.in);
		
		
		for (int i = 0; i < SIZE; i++) {
			System.out.println("Introduce la " + (i+1) + "ª nota del Array");
			notas[i]=teclado.nextInt();
		}
		do {
			System.out.println("Elige una de las siguientes opciones:");
			System.out.println("1)Mostrar todas las notas introducidas");
			System.out.println("2)Ordenar de menor a mayor las notas");
			System.out.println("3)Buscar una nota");
			System.out.println("4)Mostrar la nota media");
			System.out.println("5)Mostrar el número de aprobados");
			System.out.println("6)Mostrar la nota más alta");
			n=teclado.nextInt();
		
			switch (n) {
			case 1:
				mostrar(notas);
				break;
			case 2:
				ordenar(notas);
				break;
			case 3:
				buscar(notas, teclado);
				break;
			case 4:
				System.out.println("La media es " + mostrarMedia(notas));
				break;
			case 5:
				System.out.println("El número de aprobados es " + mostrarAprobados (notas));
				break;
			case 6:
				System.out.println("La nota más alta es " + mostrarNotaMasAlta (notas));
				break;
			}
		} while (n==1 || n==2 || n==3 || n==4 || n==5 || n==6);
		
		
		teclado.close();
	}

}
