package com.ecatfm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ConvidatsMVC {

	public static void main(String[] args) {
		// Llista de convidats
		// Fer altes, baixes i llistats
		int opcio;
		boolean triat = false;
		boolean sortir = false;
		String nom;
		Convidat convidat = new Convidat();
		ConvidatBO cBOinst = new ConvidatBO();
		Scanner lector = new Scanner(System.in);
		
		while (!sortir || !triat) {
			
			triat = true;
			System.out.println("MENU LLISTA DE CONVIDATS");
			System.out.println("1.- Alta convidat");
			System.out.println("2.- Baixa convidat");
			System.out.println("3.- Llista de convidats");
			System.out.println("9.- Sortir");

			System.out.println("Entrin el n�mero d'opci� del men�");
			opcio = lector.nextInt();
			System.out.println("L'opci� triada �s : " + opcio);
			switch (opcio) {
				case 1:
					System.out.println("Entrin el nom del nou convidat");
					nom = lector.next();
					cBOinst.save(nom);
					break;
				case 2:
					System.out.println("Entri el nom del convidat a donar de baixa");
					nom = lector.next();
					cBOinst.delete(nom);
					break;
				case 3:
					System.out.println("Llistat de convidats");
					Iterator<Convidat> it = cBOinst.read().iterator();
					while(it.hasNext()){
						convidat = it.next();
						System.out.println(convidat.getNom()+ " - " + convidat.getID());
					}
					break;						
		
				case 9:
					sortir = true;
					System.out.println("Adeu");
					break;
				default:
					System.out.println("Entri una opci� correcta");
					triat = false;
					break;
				}

		}
		lector.close();
	}
	
}

class Convidat {
	
	private String nom;
	private int ID;
	
	public Convidat() {
		super();
	}	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
}


class ConvidatBO {
	
	List<Convidat> llistaConvidats = new ArrayList<Convidat>();
	private int id = 0;
	
	public void save(String nomConvidat) {
		Convidat c = new Convidat();
		// Simula el ID autoincremental de la BBDD
		id++;
		c.setNom(nomConvidat);
		c.setID(id);
		llistaConvidats.add(c);
	}
	
	public void delete(String nomConvidat) {
		Iterator <Convidat> it = llistaConvidats.iterator();
		while(it.hasNext()) {
			Convidat c = it.next();
			if (c.getNom().equals(nomConvidat)) {
				it.remove();
			}
		}
	}
	
	public List<Convidat> read() {
		return llistaConvidats;
	}
	
}
