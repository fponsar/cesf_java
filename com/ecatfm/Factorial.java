package com.ecatfm;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// Factorial d'un número introduït
		long factorial = 1;
		int i;
		Scanner lector = new Scanner(System.in);
		System.out.println("Introdueix un enter positiu menor de 21");
		int n = lector.nextInt();
		for (i = n ; i >= 1; i--) {
			factorial *= i;
		}
		System.out.println("El factorial de " + n + " és " + factorial);
		
		// Exercici entra números enters. 
		// Compar quan números acaben en 2
		// Quan s'entri -1 missatge acabar
		i = 0;
		int acaba2 = 0;
		while ( i != -1) {
			System.out.println("Entra enter, compta acabats en dos. Entrar -1 per acabar");
			i = lector.nextInt();
			if (Math.abs(i)%10 == 2) {
				acaba2++;
			}
		}
		System.out.println("Has entrat " + acaba2 + " enters acabats en 2");
		System.out.println("Programa finalitzat!");
		lector.close();
	}

}
