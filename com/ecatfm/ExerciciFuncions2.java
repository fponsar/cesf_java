package com.ecatfm;

import java.util.Scanner;

public class ExerciciFuncions2 {
	// Aquestes funcions son les de 1 però amb retorn de valors
	final double PI = 3.1416; // A emprar per area i perímetre triangle
	
	public long cubo(int n){
		// Crear y llamar a una función que recibe un número y calcula su cubo.
		return n*n*n;
	}
	public double kmhms(double km) {
		// Crear y llamar a una función que recibe la velocidad y Km/hora y la muestra en m/s
		double ms;
		ms = km*1000.0/3600.0;
		return ms;
		
	}
	public int perimetre(int llarg, int ample) {
		// Crear y llamar a una función que recibe el ancho y el alto de un rectángulo y 
		// calcula su perímetro.
		return 2*(llarg+ample);
	}
	public double areaTriangle(int base, int altura) {
		// Crear y llamar a una función que recibe la base y la altura de un triángulo y calcula su área.
		return base*altura/2.0;
	}
	public double calculaPerimetro(int radio){
		// calculaPerimetro(int radio);
		return 2*PI*radio;
	}
	public double calculaArea(int radio) {
		// calculaArea(int radio)
		return PI*radio*radio;
	}
	
	public int suma(int a, int b) {
		return a+b;

	}
	public int resta(int a, int b) {
		return a-b;
	}
	public int multiplicacion(int a, int b) {
		return a*b;
	}
	public int division(int a, int b) {
		return a/b;
	}
	public int resto(int a, int b) {
		return a%b;
	}
	
	public static void main(String[] args) {
		ExerciciFuncions2 funcioCub = new ExerciciFuncions2();
		long c3;
		Scanner lector = new Scanner(System.in);
		System.out.println("Entri l'enter a trobar el cub");
		int c = lector.nextInt();
		c3 = funcioCub.cubo(c);
		System.out.println("El cub de " + c + " és " + c3);
		
		ExerciciFuncions2 funcioKm = new ExerciciFuncions2();
		double ms;
		System.out.println("Entri els km/hora");
		double km = lector.nextDouble();
		ms = funcioKm.kmhms(km);
		System.out.println(km + " Km/hora són " + ms + " m/s");
		
		ExerciciFuncions2 funcioPeri = new ExerciciFuncions2();
		int perimetro;
		System.out.println("Entri l'ample del rectangle");
		int ample = lector.nextInt();
		System.out.println("Entri el llarg del rectangle");
		int llarg = lector.nextInt();		
		perimetro = funcioPeri.perimetre(llarg, ample);
		System.out.println("El perímetre del rectangle " + llarg + " x " + ample + " = " + perimetro);
		
		ExerciciFuncions2 areaTriangle = new ExerciciFuncions2();
		double arT;
		System.out.println("Entri la base del triangle");
		int base = lector.nextInt();
		System.out.println("Entri l'altura del triangle");
		int h = lector.nextInt();
		arT = areaTriangle.areaTriangle(base, h);
		System.out.println("L'area del triangle és " + arT);
		
		ExerciciFuncions2 cercle = new ExerciciFuncions2();
		double per360;
		double area360;
		System.out.println("Entri el radi del cercle");
		int r = lector.nextInt();
		per360 = cercle.calculaPerimetro(r);
		area360 = cercle.calculaArea(r);
		System.out.println("El perímetre de la circunferència de radi " + r + " és " + per360);
		System.out.println("L'Àrea de la circunferència de radi " + r + " és " + area360);
		
		/* Repetir el ejercicio de la calculadora utilizando funciones para las 
		 * operaciones aritméticas. Debemos declarar 4 funciones con dos parámetros 
		 * de entrada cada una: 
		 * suma(int a, int b) 
		 * resta(int a, int b,) 
		 * multiplicacion(int a, int b) 
		 * division(int a, int b)
		 */
		
		ExerciciFuncions2 calculadora = new ExerciciFuncions2();
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
					calcRes = calculadora.suma(a1,a2);
					System.out.println(a1 + " + " + a2 + " = " + calcRes);
					break;
				case '-':
					calcRes = calculadora.resta(a1,a2);
					System.out.println(a1 + " - " + a2 + " = " + calcRes);
					break;
				case '*':
					calcRes = calculadora.multiplicacion(a1, a2);
					System.out.println(a1 + " * " + a2 + " = " + calcRes);
					break;
				case '/':
					calcRes = calculadora.division(a1, a2);
					System.out.println(a1 + " / " + a2 + " = " + calcRes);
					break;
				case '%':
					calcRes = calculadora.resto(a1, a2);
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
