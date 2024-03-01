package com.Strings;

public class EjercicioInvertirCadenaFOR {
	
	public static void main(String[] args) {
		
		String cadena = "Buen día";
		// Esta será la cadena invertida, primero está vacía
		String invertida = "";
		// Recorremos la original del final al inicio
		for (int i = cadena.length() - 1; i >= 0; i--) {
			// Y vamos concatenando cada carácter a la nueva cadena
			invertida += cadena.charAt(i);
		}
		System.out.println("Cadena original: " + cadena);
		System.out.println("Cadena invertida: " + invertida);
		
		
	}
	
}
