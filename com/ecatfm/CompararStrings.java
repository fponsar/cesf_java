package com.ecatfm;

public class CompararStrings {

	public static void main(String[] args) {
		// Comparar strings. String és una classe
		String cadena1 = new String("Hola");
		String cadena2 = new String("Hola");
		String cadena3 = "Adios";
		String cadena4 = "Adios";
		System.out.println("cadena1 y cadena2");
		if (cadena1.equals(cadena2)){
		   System.out.println("Son iguales usando el equals");
		}
		if (cadena1!=cadena2){
		   System.out.println("Son diferentes usando el ==");
		}
		System.out.println("cadena3 y cadena 4");
		if (cadena3==cadena4){
		   System.out.println("Son iguales usando el = cuando la cadena es creada en un pool");
		}
		
		// Per covertir Strings a integer fem
		String cadena = "3";
		Integer numero = Integer.parseInt(cadena);
		System.out.println(numero);

	}

}
