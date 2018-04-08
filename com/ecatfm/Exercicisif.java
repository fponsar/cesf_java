package com.ecatfm;

import java.util.Scanner;

public class Exercicisif {

	public static void main(String[] args) {
		/* Dada una variable que contiene la nota de un examen que va de 0 a 10...
		 * Si es mayor que cinco mostrar el texto "Aprobado".
		 * Si es igual a cinco, mostrar el texto "Aprobado por los pelos"
		 * Si es menor que cinco, mostrar el texto "Suspenso".
		 */
		boolean ok = true;
		int nota = 0;
		Scanner lector = new Scanner(System.in);
		while (ok) {
			System.out.println("Entra la nota: ");
			nota = lector.nextInt();
			if (nota <0 || nota > 10) {
				System.out.println("No has entrat una nota correcta");
				
			} else {
				ok = false;
			}
		}
		if (nota > 5 && nota <= 10) {
			System.out.println("Has aprovat");
		} else if (nota <5 && nota >= 0) {
			System.out.println("Has susp�s");
		} else {
			System.out.println("Aprovat pels pels!!");
		}
		
		/* 2 Declarar una variable 'i' de tipo entero y as�gnale un valor. 
		 * Mostrar un mensaje indicando si el valor de 'i' es positivo o negativo, 
		 * si es par o impar, si es m�ltiplo de 5, si es m�ltiplo de 10 y 
		 * si es mayor o menor que 100. Consideraremos el 0 como positivo.
		 */
		System.out.println("Entri un valor enter");
		int i = lector.nextInt();
		if ( i >= 0 ) {
			System.out.println("El n�mero " + i + " �s positiu");
		} else {
			System.out.println("El n�mero " + i + " �s negatiu");			
		}
		if ( i%2 == 0 ) {
			System.out.println("El n�mero " + i + " �s parell");
		} else {
			System.out.println("El n�mero " + i + " �s senar");			
		}
		if ( i%5 == 0 ) {
			System.out.println("El n�mero " + i + " �s m�ltiplo de 5");
		}
		if ( i%10 == 0 ) {
			System.out.println("El n�mero " + i + " �s m�ltiplo de 10");
		}
		if ( i > 100 ) {
			System.out.println("El n�mero " + i + " �s m�ltiplo major de 100");
		}
		
		// if especial. Operador ternari
		/* Declare una variable 'b' de tipo entero y asignarle un valor. 
		 * Mostrar un mensaje indicando si el valor de 'b' es positivo 
		 * o negativo. Consideraremos el 0 como positivo. Utiliza el 
		 * operador condicional (? : ) dentro del println para resolverlo.
		 */
		System.out.println("Entri un valor enter");
		int b = lector.nextInt();
		String espe = (b>=0)?"�s positiu":"�s negatiu";
		System.out.println(b + " " + espe);
		
		/* Declarar una variable 'i' de tipo entero y asignarle un valor. 
		 * Muestra un mensaje indicando si 'i' es par o impar. Utiliza el 
		 * operador condicional ( ? : ) dentro del println para resolverlo.
		 */
		System.out.println("Entri un valor enter");
		i = lector.nextInt();
		String espar = (i%2==0)?"�s parell":"�s senar";
		System.out.println(i + " �s " + espar);
		
	    lector.close();
	}

}
