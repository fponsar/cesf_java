package com.ecatfm;

import java.util.Scanner;

public class CosteViaje {
	
	public int costeHotel(int nits) {
		// Cost per nit 140 €
		return nits*140;
	}
	
	public int costeAvion(String desti) {
		// Cost avió per ciutat variable
		String destimin = desti.toLowerCase();
		int costDesti;
		switch(destimin){
		case "oviedo":
			costDesti = 15;
			break;
		case "tokyo":
			costDesti = 700;
			break;
		case "madrid":
			costDesti = 90;
			break;
		case "barcelona":
			costDesti = 90;
			break;
		default:
			costDesti = -1;
		}
		return costDesti;
	}
	
	public int costeAlquilerCoche(int dias) {
		// Cost lloguer cotxe en funció dels dies
		int costCotxe = 40 * dias;
		if (dias >= 7) {
			costCotxe = costCotxe -50;
		} else if ( dias >= 3) {
			costCotxe = costCotxe - 20;
		}
		return costCotxe;
	}
	
	public static void main(String[] args) {
		// Fem una instància de la Classe CosteViaje
		CosteViaje cv = new CosteViaje();
		// Quantes nits i cost d l'Hotel
		Scanner lector = new Scanner(System.in);
		int costTotal = 0;
		int costNits = 0;
		System.out.println("Introdueix quantes nits passaràs: ");
		int numNits = lector.nextInt();
		costNits = cv.costeHotel(numNits); 
		
		// Quin és el cost del destí en funció de la ciutat
		int costCiutat = 0;
		boolean esDesti = false;
		while (!esDesti) {
			System.out.println("Introdueix la ciutat on vas (Oviedo, Tokyo, Madrid, Barcelona)");
			String ciutat = lector.next();
			costCiutat = cv.costeAvion(ciutat);
			esDesti = (costCiutat == -1)?false:true;
		}
		
		// Quin és el preu de lloguer del cotxe en funció dels dies 
		int costlloguer ;
		costlloguer = cv.costeAlquilerCoche(numNits);
		
		// Cost total
		System.out.println("Cost Hotel: " + costNits);
		System.out.println("Cost Avió: " + costCiutat);
		System.out.println("Cost Lloguer cotxe: " + costlloguer);
		
		costTotal = costNits + costCiutat + costlloguer;
		System.out.println("Cost Total del viatge: " + costTotal);
		
		lector.close();
	}

}
