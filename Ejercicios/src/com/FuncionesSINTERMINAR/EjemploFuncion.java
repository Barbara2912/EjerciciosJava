package com.FuncionesSINTERMINAR;

public class EjemploFuncion {
	//declaración de la constante PI
	//static: no hace falta instanciarlo para llamarlo
	final static double PI = 3.1416;
	//creo la función de la long de la circunferencia
	public static double longCircunf(int radio) {
	return 2 * PI * radio;
	}
	//creo la función de la superficie del círculo
	public static double superfCirculo(int radio) {
	double superficie = PI * radio * radio;
	return superficie;
	}
	
	public static void saludar() {
	System.out.println("Bienvenido");
	System.out.println("Comenzamos...");
	}
	
	public static void escribirLongCircunf(int radio) {
	System.out.println("La longitud de la circunferencia " + "de radio " + radio + " es " + longCircunf(radio));
	}
	
	public static void main(String args[]) {
		//Hago las llamadas a las funciones
	saludar();
	escribirLongCircunf(4);
	escribirLongCircunf(6);
	escribirLongCircunf(8);
	escribirLongCircunf(10);
	escribirLongCircunf(111);
	System.out.println("La superficie del círculo " + "de radio 5 es " + superfCirculo(5));
	}
	}