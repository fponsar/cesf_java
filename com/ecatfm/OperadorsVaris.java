package com.ecatfm;

import java.util.Scanner;

public class OperadorsVaris {

	public static void main(String[] args) {
		// Exercici operacions Pablo Monteserin
		// 1 Calcula segons d'un dia
		int segons = 60;
		int minuts = 60;
		int hores = 24;
		System.out.println("Un dia té " + (segons*minuts*hores) + " segons.");
		
		// 2 Conversor d'euros a dolars ( 1 euro = 2 dolars ).
		Scanner lector = new Scanner(System.in);
		System.out.println("Entri el valor en euros a convertir a dolars");
		float euro = lector.nextFloat();
		System.out.println(euro + " € són $" + (2*euro));
		
		// 3 El IVA para ciertos artículos es del 21%. Realiza un programa 
		// que pida un precio y calcule su precio con IVA.
		System.out.println("Introdueix la base imponible");
		float base = lector.nextFloat();
		System.out.println("El preu amb IVA és " + (base*1.21) + " €");
		
		// 4 Leer un número entero por teclado y mostrar por pantalla el doble y el triple.
		System.out.println("Entri el número a duplicar i triplicar");
		base = lector.nextFloat();		
		System.out.println("El doble de " + base + " és " + (2*base));
		System.out.println("El triple de " + base + " és " + (3*base));		
		
		// 5 Realiza un programa que recoja el ancho y el alto de un rectángulo y calcule 
		// el perímetro y el área. 
		System.out.println("Entri l'ample del rectangle");
		int ample = lector.nextInt();
		System.out.println("Entri el llarg del rectangle");
		int llarg = lector.nextInt();
		System.out.println("El perímetre del rectangle és: " + (2*ample+2*llarg));
		System.out.println("L'àrea del rectangle és : " + (ample*llarg));
		
		/* 6 Hacer un conversor de grados centígrados a grados Fahrenheit. Para ello 
		 * deberé multiplicar por 9/5 y sumar 32. Como todo el mundo sabe, 20 grados centígrados 
		 * son 68 grados Farenheit.
		 */
		System.out.println("Entri la temperatura en ºC");
		float cels = lector.nextFloat();
		System.out.println(cels + "ºC són " + (32+(9*cels)/5) + "F");
		lector.close();	
	}

}
