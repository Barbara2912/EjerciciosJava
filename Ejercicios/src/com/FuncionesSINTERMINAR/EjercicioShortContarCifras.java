package com.FuncionesSINTERMINAR;

import java.util.Scanner;

public class EjercicioShortContarCifras {
	
	public static short contarcifras(short n){
		
		short cifras=0;
		
        while(n!=0){
        	
            n=(short) (n/10);
            cifras++;   
        }
		return cifras;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crear una función llamada short contarCifras (short numero) que reciba un número
		short y devuelva el número de cifras que tiene, en caso de recibir un número menor a 0 o
		mayor a 9999 devolverá -1.*/
		
		short n;
		
		Scanner teclado=new Scanner (System.in);
		
		System.out.println("Introduce un número para saber sus cifras");
		n=teclado.nextShort();
		
		if (n<0 || n>9999) {
			System.out.println(-1);
	
		}else {
			System.out.println("El número de cifras total es de " + contarcifras (n));
		}
		
		teclado.close();
		
	}

}
