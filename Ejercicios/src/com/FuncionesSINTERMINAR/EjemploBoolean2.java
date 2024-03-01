package com.FuncionesSINTERMINAR;

import java.util.Scanner;

public class EjemploBoolean2 {

	public static boolean esLaborable(int dia){
		
		switch (dia) {
		case 1:
			return true;
		case 2:
			return true;
		case 3:
			return true;
		case 4:
			return true;
		case 5:
			return true;
		case 6:
			return false;
		case 7:
			return false;
		default:
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escribir una función llamada boolean esLaborable (int dia) que reciba por parámetro
		un día compruebe que está entre el 1 al 7 y devuelva true si es de lunes a viernes y
		false si es sábado o domingo. En caso de recibir un número menor de uno o mayor que
		siete devolverá false. (Utiliza la estructura switch).*/
		
		int dia;
		
		Scanner teclado=new Scanner (System.in);
		
		System.out.println("Introduce un número del 1 al 7 para saber si es laborable");
		dia=teclado.nextInt();
		
		System.out.println(esLaborable(dia));
		
		
		teclado.close();
		
	}

}
