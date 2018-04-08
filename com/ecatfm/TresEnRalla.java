package com.ecatfm;

import java.util.Scanner;

public class TresEnRalla {
	
	static Scanner lector = new Scanner(System.in); //Així puc tancar el lector a final de mail
	public static void showTablero(String [] tablero) {
		System.out.println(tablero[0] + "|" + tablero[1] + "|" + tablero[2]);
		System.out.println(tablero[3] + "|" + tablero[4] + "|" + tablero[5]);
		System.out.println(tablero[6] + "|" + tablero[7] + "|" + tablero[8]);
	}
	public static void juegaPlayer(String ficha, String [] tablero) {
		//Scanner lector = new Scanner(System.in);
		int posicio = 0;
		while (posicio <=0 || posicio >9) {
			System.out.println("Jugador " + ficha + " entra la posició de la ficha");
			posicio = lector.nextInt();
		}
		tablero[posicio - 1] = ficha;
		// lector.close() fa que la funció no s'executi en segona passada.
	}
	
	public static boolean evaluateWin(String [] tablero) {
		boolean guanyat = false;
		int i = 0;
		int j = 0;
		while (i<7 && j<3) {
			if (tablero[i].equals(tablero[i+1])&& tablero[i].equals(tablero[i+2])&&!(tablero[i].equals("_"))){
				guanyat = true;
			} else if (tablero[j].equals(tablero[j+3]) && tablero[j].equals(tablero[j+6])&&!(tablero[j].equals("_"))){
				guanyat = true;
			} else if (tablero[0].equals(tablero[4]) && tablero[0].equals(tablero[8])&&!(tablero[0].equals("_"))) {
				guanyat = true;
			} else if (tablero[2].equals(tablero[4]) && tablero[2].equals(tablero[6])&&!(tablero[2].equals("_"))) {
				guanyat = true;
			}
			i = i +3;
			j++;
		}
		return guanyat;
	}

	public static void main(String[] args) {
		/* Hacer el juego del tres en raya para dos jugadores.
		 * El tablero será un array de 9 posiciones. 
		 * El método showTablero(String [] tablero); imprimirá el tablero,
		 * con las fichas “X” y “O” dónde correspondan. 
		 * El juego tendrá un método juegaPlayer(String ficha, String [] tablero) 
		 * que recibirá como parámetro de entrada el identificador del 
		 * jugador ("X" o "O") y dónde se le solicitará al jugador el número 
		 * correspondiente a la posición dónde quiere mover su ficha ("X" o "O"). 
		 * Después de cada tirada, se comprobará si alguien ha ganado, llamando al 
		 * método evaluateWin(String [] tablero); 
		 * El método evaluateWin(String [] tablero) mediante sucesivos if todas 
		 * las posibilidades de que un jugador gane.
		 * Utilizaremos la consola de java para ver el tablero.
		*/
		
		String [] taulell = new String[9];
		for (int i=0; i <9; i++) {
			taulell[i] = "_";
		}
		
		String ficha = "O";
		int jugades = 1;
		//Scanner lector = new Scanner(System.in);
		while (!TresEnRalla.evaluateWin(taulell) && jugades <=9){
			TresEnRalla.showTablero(taulell);
			if (ficha == "X") {
				ficha="O"; 
			} else {
				ficha = "X";
			}
			TresEnRalla.juegaPlayer(ficha, taulell);
			jugades++;
			//System.out.println("Jugador " + ficha + " entra la posició de la ficha");
			//int posicio = lector.nextInt();
			//taulell[posicio - 1] = ficha;
		}
		TresEnRalla.showTablero(taulell);
		if (TresEnRalla.evaluateWin(taulell)) {		
			System.out.println("Enhorabona jugador " + ficha + " Has guanyat");
		} else {
			System.out.println("Empat tècnic");
		}
		lector.close();
	}

}

