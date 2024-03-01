package com.Generales;

import java.util.Scanner;

public class EjercicioNumerosAmigos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, d, sum1, sum2;
		
		sum1=0;
		sum2=0;
		
		Scanner teclado=new Scanner (System.in);
		
		System.out.println("Introduce dos valores");
		a=teclado.nextInt();
		b=teclado.nextInt();
		
		for (int i = 1; i < a; i++) {
			
			d=a%i;
			
			if (d==0) {
				
				sum1=sum1+i;
				
				//System.out.println("Los divisores de " + a + " son " + i);
			}
			
		}
		
		for (int i = 1; i < b; i++) {
			
			d=b%i;
			
			if (d==0) {
				
				sum2=sum2+i;
				
				//System.out.println("Los divisores de " + b + " son " + i);
			}
			
		}
		
		
		if (sum1==b && sum2==a) {
			
			System.out.println(a + " y " + b +  " Son amigos");
			
		}else {
				
			System.out.println(a + " y " + b + " No son amigos");	
			
			}
		
		teclado.close();
		
		
		
	}

}
