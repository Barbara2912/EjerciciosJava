package com.Strings;

public class EjercicioInvertirCadenaSTRINGBUILDER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Dada una cadena invertir la misma y mostrar por pantalla. Ejemplo:
		Entrada: "bonito dia"
		Salida: "aid otinob"
		NOTA: método nextLine() sirve para leer la cadena.*/
		
		String frase="bonito día";
		
		StringBuilder invertir=new StringBuilder(frase);
		
		String invertida=invertir.reverse().toString();
		
		System.out.println("Cadena original: " + frase);
		System.out.println("Cadena invertida: " + invertida);
		
	}

}
