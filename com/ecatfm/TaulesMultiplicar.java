package com.ecatfm;

public class TaulesMultiplicar {

	public static void main(String[] args) {
		// Exercici taula imprimir taules de multiplicar de 1 a 9
		int i = 1;
		int j = 1;
		for (i = 1 ; i < 10; i++ ) {
			System.out.println("Taula de multiplicar de " + i);
			for (j =1 ; j <= 10 ; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
		}

	}

}
