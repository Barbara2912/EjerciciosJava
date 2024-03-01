package com.Arrays;

import java.util.Scanner;

public class EjemploArrays {

    public static int tamano=5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []edades; //declaraci�n array
	     
        edades=new int[5];//asignaci�n de memoria
        int i; //indice para recorrer el array
        int menores18=0;
        int mayores18=0;	       
       
        //Inserci�n de datos
        for (i=0; i<5;i++){
            System.out.printf("Introduzca la edad del alumno %d: ",i+1);
            edades[i]=new Scanner (System.in).nextInt();       
        }
        //Mostrar datos
        for (i=0; i<5;i++){
            System.out.printf("La edad del alumno %d es: %d \n",i+1,edades[i]);    
        }
        //Consulta de datos
        for (i=0; i<5;i++){
            if (edades[i]>18)
               mayores18++; 
            else
               menores18++;
        }
   
		System.out.printf("Este año hay %d alumnos mayores de 18 y %d alumnos menores de 18\n",mayores18,menores18);
		new Scanner (System.in).close();

	}
}
