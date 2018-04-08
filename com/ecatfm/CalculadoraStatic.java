package com.ecatfm;

import java.util.Scanner;

public class CalculadoraStatic {
	
	public static int suma(int a, int b) {
		return a+b;
	}
	public static int resta(int a, int b) {
		return a-b;
	}
	public static int multiplicacion(int a, int b) {
		return a*b;
	}
	public static int division(int a, int b) {
		return a/b;
	}
	public static int resto(int a, int b) {
		return a%b;
	}

	public static void main(String[] args) {
		/* Refer la calculadora amb crida a mètodes static
		   No declarem cap instància de CalculadoraStatic
		   Cridem directament les funcions des de la classe */
		Scanner lector = new Scanner(System.in);
		boolean signe = true;
		int calcRes;
		System.out.println("Entri el primer operador enter");
		int a1 = lector.nextInt();
		System.out.println("Entri el segon operador enter");
		int a2 = lector.nextInt();
		
		while (signe) {
			signe = false;
			System.out.println("Entri l'operació que vol fer ( + , - , *, /, % )");
			String operacio = lector.next();
			char ope = operacio.charAt(0);
			switch(ope){
				case '+':
					calcRes = CalculadoraStatic.suma(a1,a2);
					System.out.println(a1 + " + " + a2 + " = " + calcRes);
					break;
				case '-':
					calcRes = CalculadoraStatic.resta(a1,a2);
					System.out.println(a1 + " - " + a2 + " = " + calcRes);
					break;
				case '*':
					calcRes = CalculadoraStatic.multiplicacion(a1, a2);
					System.out.println(a1 + " * " + a2 + " = " + calcRes);
					break;
				case '/':
					calcRes = CalculadoraStatic.division(a1, a2);
					System.out.println(a1 + " / " + a2 + " = " + calcRes);
					break;
				case '%':
					calcRes = CalculadoraStatic.resto(a1, a2);
					System.out.println(a1 + " / " + a2 + " = " + calcRes);
					break;					
				default:
					System.out.println("Entri un operador correcte, si us plau");
					signe = true;
			}
		}
		
		lector.close();
	}

}
