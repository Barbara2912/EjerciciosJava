package com.ArraysMultidimensionales;

import java.util.Scanner;

public class EjercicioSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar en otra
		matriz. Los valores y la longitud, seran insertados por el usuario. Mostrar las matrices
		originales y el resultado.*/
		
		int suma1[][];
		int suma2[][];
		int resultado[][];
		int n;
		
		Scanner teclado=new Scanner (System.in);
		
		System.out.println("Introduce el tamaño del array");
		n=teclado.nextInt();
		
		suma1=new int [n][n];
		suma2=new int [n][n];
		resultado=new int [n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Escriba el valor para la fila " + (i+1) + " y columna " + (j+1) + " del array 1");
                suma1[i][j]=teclado.nextInt();
                System.out.println("Escriba el valor para la fila " + (i+1) + " y columna " + (j+1) + " del array 2");
                suma2[i][j]=teclado.nextInt();
                
                resultado[i][j]=suma1[i][j]+suma2[i][j];
			} 
		}	
        
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
                System.out.println(suma1[i][j] + " + " + suma2[i][j] + " = " + resultado[i][j]);
			}
		}
		
		
		teclado.close();
	}

}
