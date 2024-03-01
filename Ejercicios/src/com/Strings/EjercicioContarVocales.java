package com.Strings;

public class EjercicioContarVocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Dada una cadena, mostrar por pantalla la cantidad de vocales que tiene. Ejemplo:
		Entrada: cad = "Hola a todos"
		Salida: La cantidad de vocales es 5
		NOTA: método length() para obtener el tamaño de la cadena y método charAt(pos) para
		obtener un determinado carácter en una posición.*/
		
		int cont=0;
		
		String frase="Hola a todos";
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i)=='a' || frase.charAt(i)=='e' || frase.charAt(i)=='i' || frase.charAt(i)=='o' || frase.charAt(i)=='u') {
				cont++;
			}
		}
		
		System.out.println("<Hola a todos> tiene " + cont + " vocales");
		
	}

}
