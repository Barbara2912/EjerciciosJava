package com.FuncionesSINTERMINAR;

import java.util.Scanner;

public class EjercicioCalculadora {

	public static double suma(double n1, double n2) {
		
		double sum=n1+n2;
		return sum;
		
	} 
	public static double resta(double n1, double n2) {
		
		double rest=n1-n2;
		return rest;
		
	} 
	
	public static double multiplicacion(double n1, double n2) {
		
		double mult=n1*n2;
		return mult;
		
	} 
	
	public static double division(double n1, double n2) {
		
		double div=n1/n2;
		return div;
		
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double n1, n2;
		int r1, r2;
		Scanner teclado=new Scanner (System.in);
		
		do {
			
			System.out.println("Introduce un valor entre 1 y 4 (1:Suma, 2:Resta, 3:Multiplicación, 4:División)");
			r1=teclado.nextInt();
			
			if (r1 !=1 && r1!=2 && r1!=3 && r1!=4) {
				System.out.println("El valor introducido es incorrecto");
			} else {
				switch (r1) {
				
				case 1:
					System.out.println("Introduce dos números para sumarlos");
					n1=teclado.nextDouble();
					n2=teclado.nextDouble();
					suma(n1, n2);
					System.out.println(n1 + " + " + n2 + " = " + suma(n1,n2));
					break;
				case 2:
					System.out.println("Introduce dos números para restarlos");
					n1=teclado.nextDouble();
					n2=teclado.nextDouble();
					resta(n1, n2);
					System.out.println(n1 + " - " + n2 + " = " + resta(n1,n2));
					break;
				case 3:
					System.out.println("Introduce dos números para multiplicarlos");
					n1=teclado.nextDouble();
					n2=teclado.nextDouble();
					multiplicacion(n1, n2);
					System.out.println(n1 + " * " + n2 + " = " + multiplicacion(n1,n2));
					break;
				case 4:
					System.out.println("Introduce dos números para dividirlos");
					n1=teclado.nextDouble();
					n2=teclado.nextDouble();
					division(n1, n2);
					System.out.println(n1 + " / " + n2 + " = " + division(n1,n2));
					break;

				default:
					break;
				}
			}
			
			System.out.println("¿Desea introducir más números?(S/N)");
			r2=teclado.next().charAt(0);
			
		} while (r2=='S' || r2=='s');
		
		teclado.close();
		
	}

}
