package com.ecatfm;

import java.util.Scanner;

public class ArrayAhorcado {
	
	public static void main(String[] args) {
		/* 1.- Al iniciar el programa, este deberá escoger una palabra al azar entre 3. 
		 * Esta será la palabra secreta que el usuario deberá adivinar.
		 * 2.- El programa contará la cantidad de letras de la palabra escogida y creará 
		 * ese número de letras (inicialmente con guiones bajos). 
		 * El usuario deberá ir introduciendo letra a letra hasta adivinar la palabra secreta.
		 * 3.- Si el usuario acierta alguna de las letras de la palabra, su correspondiente 
		 *  guión bajo será sustituido por la letra correspondiente.
		 */
		
		/* NOTES: Para generar un número aleatorio de tipo double entre 0 y 1:
		 * Math.random()
		 * Si quiero comparar dos arrays, no utilizaré el método equals, sino el método 
		 * Arrays.equals(array1, array2) 
		 * cadena.indexOf(“a“) devuelve la primera posición de la letra a en la cadena. 
		 * En caso de no encontrar coincidencia, nos devolverá -1. 
		 * Métodos de la clase String: 
		 * charAt(int index) Returns the char value at the specified index.
		 * toCharArray() Converts this string to a new character array.
		*/
		
		String [] paraules = {"estufa", "nevera", "ventilador"};
		int nParaula = (int)(Math.random()*paraules.length);
		
		String paraulaSecreta = paraules[nParaula];
		int nLletres = paraulaSecreta.length();
		char [] lletres = paraulaSecreta.toCharArray(); 
		
		for (int i = 0; i < paraulaSecreta.length(); i++) {
			lletres[i] = '_';
		}
		System.out.println(lletres);
		
		char lletra;
		boolean hasGuanyat = false;
		int intents = 10;
		Scanner lector = new Scanner(System.in);
		while (!hasGuanyat && intents > 0) {
			System.out.println("Entra una lletra minúscula. Tens " + intents + " intents");
			intents --;
			lletra = lector.next().charAt(0);
			
			for (int i = 0; i < nLletres; i++ ) {
				if (lletra==paraulaSecreta.charAt(i)) {
					lletres[i] = lletra;
				}
			}
			System.out.println(lletres);
			
			hasGuanyat = true;
			for(int i = 0;  i < nLletres; i++ ) {
				if (lletres[i]=='_') {
					hasGuanyat = false;
				}
			}
		}
		if (hasGuanyat) {
			System.out.println("Has guanyat!!!");
		} else {
			System.out.println("La propera hi haurà més sort");
		}
		lector.close();
	}

}
