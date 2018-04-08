package com.ecatfm;

import java.util.Scanner;

public class ExerciciFuncions1 {

	final double pi = 3.1416; // A emprar per area i per�metre triangle
	
	public void cubo(int n){
		// Crear y llamar a una funci�n que recibe un n�mero y calcula su cubo.
		System.out.println("El cub de " + n + " �s " + (n*n*n));
	}
	public void kmhms(double km) {
		// Crear y llamar a una funci�n que recibe la velocidad y Km/hora y la muestra en m/s
		double ms;
		ms = km*1000.0/3600.0;
		System.out.println(km + " Km/hora s�n " + ms + " m/s");
	}
	public void perimetre(int llarg, int ample) {
		// Crear y llamar a una funci�n que recibe el ancho y el alto de un rect�ngulo y 
		// calcula su per�metro.
		System.out.println("El per�metre del rectangle " + llarg + " x " + ample + " = " + (2*(llarg+ample)));
	}
	public void areaTriangle(int base, int altura) {
		// Crear y llamar a una funci�n que recibe la base y la altura de un tri�ngulo y calcula su �rea.
		System.out.println("L'area del triangle �s " + (base*altura/2.0));
	}
	public void calculaPerimetro(int radio){
		// calculaPerimetro(int radio);
		System.out.println("El per�metre de la circunfer�ncia de radi " + radio + " �s " + (2*pi*radio));
	}
	public void calculaArea(int radio) {
		// calculaArea(int radio)
		System.out.println("L'�rea de la circunfer�ncia de radi " + radio + " �s " + (pi*radio*radio));
	}
	
	public void suma(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a+b));
	}
	public void resta(int a, int b) {
		System.out.println(a + " - " + b + " = " + (a-b));
	}
	public void multiplicacion(int a, int b) {
		System.out.println(a + " * " + b + " = " + (a*b));
	}
	public void division(int a, int b) {
		System.out.println(a + " / " + b + " = " + (a/b));
	}
	public void resto(int a, int b) {
		System.out.println(a + " % " + b + " = " + (a%b));
	}
	
	public static void main(String[] args) {
		ExerciciFuncions1 funcioCub = new ExerciciFuncions1();
		Scanner lector = new Scanner(System.in);
		System.out.println("Entri l'enter a trobar el cub");
		int c = lector.nextInt();
		funcioCub.cubo(c);
		
		ExerciciFuncions1 funcioKm = new ExerciciFuncions1();
		System.out.println("Entri els km/hora");
		double km = lector.nextDouble();
		funcioKm.kmhms(km);
		
		ExerciciFuncions1 funcioPeri = new ExerciciFuncions1();
		System.out.println("Entri l'ample del rectangle");
		int ample = lector.nextInt();
		System.out.println("Entri el llarg del rectangle");
		int llarg = lector.nextInt();		
		funcioPeri.perimetre(llarg, ample);
		
		ExerciciFuncions1 areaTriangle = new ExerciciFuncions1();
		System.out.println("Entri la base del triangle");
		int base = lector.nextInt();
		System.out.println("Entri l'altura del triangle");
		int h = lector.nextInt();
		areaTriangle.areaTriangle(base, h);
		
		ExerciciFuncions1 cercle = new ExerciciFuncions1();
		System.out.println("Entri el radi del cercle");
		int r = lector.nextInt();
		cercle.calculaPerimetro(r);
		cercle.calculaArea(r);
		
		/* Repetir el ejercicio de la calculadora utilizando funciones para las 
		 * operaciones aritm�ticas. Debemos declarar 4 funciones con dos par�metros 
		 * de entrada cada una: 
		 * suma(int a, int b) 
		 * resta(int a, int b,) 
		 * multiplicacion(int a, int b) 
		 * division(int a, int b)
		 */
		ExerciciFuncions1 calculadora = new ExerciciFuncions1();
		boolean signe = true;
		System.out.println("Entri el primer operdor enter");
		int a1 = lector.nextInt();
		System.out.println("Entri el segon operador enter");
		int a2 = lector.nextInt();
		
		while (signe) {
			signe = false;
			System.out.println("Entri l'operaci� que vol fer ( + , - , *, /, % )");
			String operacio = lector.next();
			char ope = operacio.charAt(0);
			switch(ope){
				case '+':
					calculadora.suma(a1,a2);
					break;
				case '-':
					calculadora.resta(a1,a2);
					break;
				case '*':
					calculadora.multiplicacion(a1, a2);
					break;
				case '/':
					calculadora.division(a1, a2);
					break;
				case '%':
					calculadora.resto(a1, a2);
					break;					
				default:
					System.out.println("Entri un operador correcte, si us plau");
					signe = true;
		}
			
		}
		
		lector.close();
	}

}
