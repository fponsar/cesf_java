package com.ecatfm;

import java.util.Scanner;

public class ComptaLletra {

	public static void main(String[] args) {
		// Primer programa amb mètodes. Objecte String
		int i = 0;
		int compta = 0;
		String lletra = null;
		String frase = "DABALE ARROZ A LA ZORRA EL ABAD";
		Scanner lector = new Scanner(System.in);
		System.out.println("Entra la lletra de la frasse que vulguis comptar");
		lletra = lector.nextLine();
		for ( i = 0; i < frase.length(); i++) {
			if ((frase.substring(i, i+1).equals(lletra.toUpperCase()))){
				compta++;
			}
		}
		System.out.println("Hi ha " + compta + " lletres '" + lletra + "' a la frase");
		lector.close();	

	}

}
