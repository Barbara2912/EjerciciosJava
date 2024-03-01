package com.ArraysMultidimensionales;

import java.util.Scanner;

public class EjercicioRandom {
	
	public static int generaNumAleatorio(int minimo,int maximo){
        
    return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
    
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Crear una matriz de 5 filas y n columnas (se pide al usuario). Rellenarlo con números
		aleatorios. Usa el método random de Math. */
		
		int array[][];
		int colum;
		
		Scanner teclado=new Scanner (System.in);
		
		System.out.println("Introduce el número de columnas del array");
		colum=teclado.nextInt();
		
		array= new int [5][colum];
		
		for(int i=0;i<colum;i++){
            for(int j=0;j<colum;j++){
                array[i][j]=generaNumAleatorio(0,9);
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
             
        }
		
		
		
		
		teclado.close();
	}

}
