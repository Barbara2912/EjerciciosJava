package com.Strings;

public class EjercicioContarRepeticiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Dada una cadena cad, y un caracter car, verificar cuántas veces se repite el carácter car
		en la cadena cad, por ejemplo:
		Entrada: cad = "bonito dia", car = 'i'
		Salida: El caracter 'i' se repite 2 veces*/
		
		String cadena="Hola que tal";
		char caracter='a';
		int cont=0;

		for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                cont++;
            }
        }
		 
        System.out.println("El caracter '" + caracter + "' se repite " + cont + " veces en la cadena.");
    }

}
