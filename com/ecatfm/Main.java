package com.ecatfm;

public class Main {

	public static void main(String[] args) {
		
		//Primitiva
		int a = 5;
		// Refer�ncia a objecte
		Integer j = 5;
		
		System.out.println(a*j);
		
		int x = 32767;
		int y = 32768;
		int z = 32769;
		//El rango de un dato de tipo short llega hasta 32767
		//Exemple conversi� tipus
		short xshort = (short) x;
		short yshort = (short) y;
		short zshort = (short) z;
		
		System.out.println(xshort+yshort-zshort);
		
		// Exercici 1 web
		int i = 5;
		double d =100000;
		char c = 'T';  // char una lletra unicode cometes simples
		
		System.out.println("int:" + i);
		System.out.println("double: " + d);
		System.out.println("char: " + c);
		
		// Exercici 2 web
		
		int m = 10;
		int n = 20;
		
		System.out.println("Valor inicial m : " + m);
		System.out.println("Valor inicial n : " + n);
		
		m = n;
		
		System.out.println("Valor final m : " + m);
		System.out.println("Valor final n : " + n);
		System.out.println("EXERCICIS WEB 1 i 2 ACABATS");
		
		
		// Exemple conversi� tipus
		System.out.println("1 - Conversi�n a short de 32767: " + (short)x);
		System.out.println("2 - Conversi�n a short de 32768: " + (short)y);
		System.out.println("2 - Conversi�n a short de 32769: " + (short)z);
		System.out.println("3 - Conversi�n a byte de 32767: " + (byte)x);
		System.out.println("4 - Conversi�n a byte de 32768: " + (byte)y);
		System.out.println("5 - Conversi�n a byte de 100: " + (byte)z);
		
		
		System.out.println("Hola M�n");
	}

}
