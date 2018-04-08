package com.ecatfm;

import java.util.Scanner;

public class ExercisisArrays {

	public static void main(String[] args) {
		// 1 Crea un array con cinco nombres de persona y rec�rrelo con un 
		// bucle for mostrando el texto "Conozco a alguien llamado ".
		int i;
		String [] coneguts = {"Pere", "Anna", "Marta", "Ona", "Iu" };
		for (i = 0; i < coneguts.length; i++) {
			System.out.println("Conec alg� que es diu " + coneguts[i]);
		}
		
		// 2 Recorrer la siguiente lista con un bucle imprimiendo el doble de 
		// cada n�mero myList = {1,9,3,8,5,7}
		int [] myList = {1,9,3,8,5,7};
		for (i = 0; i < myList.length; i++) {
			System.out.println("El doble de " + myList[i] + " �s " + (2*myList[i]));
		}
		
		/* 3 Programa que lea una variable entera correspondiente a cierto mes, 
		 * compruebe si el n�mero introducido est� entre 1 y 12 y muestre el 
		 * nombre del mes. Para mostrar el nombre del mes utilizar� un array 
		 * de strings d�nde cada una de las posiciones del array ser� uno de 
		 * los meses del a�o. 
		 */
		Scanner lector = new Scanner(System.in);
		String [] mesos = {"Gener", "Febrer", "Mar�", "Abril", "Maig", "Juny", "Juliol",
				"Agost", "Setembre", "Octubre", "Novembre", "Desembre"};
		boolean valid = true;
		int mes = 0;
		while (valid) {
			System.out.println("Entra el n�mero del mes");
			mes = lector.nextInt();
			if (mes >= 1 && mes <= 12 ) {
				System.out.println("El mes " + mes + " �s " + mesos[mes-1]);
				valid = false;
			} else {
				System.out.println("El n�mero introdu�t no correspon a un mes de l'any");
			}
		}
		
		lector.close();
	}

}
