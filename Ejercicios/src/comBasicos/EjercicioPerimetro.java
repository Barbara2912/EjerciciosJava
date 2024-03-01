package comBasicos;

import java.util.Scanner;

public class EjercicioPerimetro {

	public static void main(String[] args) {
		// Realizar la carga del lado de un cuadrado, mostrar por pantalla el perímetro del mismo
		//(El perímetro de un cuadrado se calcula multiplicando el valor del lado por cuatro)
		
		int n, perimetro;
		
		Scanner	teclado = new Scanner( System.in );
		 System.out.print( "Introduzca el valor de un lado del cuadrado" );
	        //nextInt() lee un entero por consola
	        n = teclado.nextInt();
		
	        perimetro=n*4;
	        
	        System.out.println( "El perímetro del cuadrado es " + perimetro );
	        
	        teclado.close();
	        
	}

}
