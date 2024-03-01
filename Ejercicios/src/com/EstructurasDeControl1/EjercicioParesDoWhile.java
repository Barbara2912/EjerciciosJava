package com.EstructurasDeControl1;

public class EjercicioParesDoWhile {

	public static void main(String[] args) {
		// Cuales son pares con el do-while o con el while
		
		int cont = 1;
				
		do {
			
			if (cont%2==0) {
				
				int pares = cont;
				
				System.out.println(pares);	
				
			}
				
			cont++;					
			
		}while (cont<=10);	
		

	}

}
