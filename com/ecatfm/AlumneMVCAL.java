package com.ecatfm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class AlumneMVCAL {

	public static void main(String[] args) {
		// Classe main que crida al menu del CRUD
		int opcio;
		boolean triat = false;
		boolean sortir = false;
		Alumne aluinst = new Alumne();
		AlumneBO alumneBOinst = new AlumneBO();
		Scanner lector = new Scanner(System.in);
		String nombre;

		while (!sortir || !triat) {

			triat = true;
			System.out.println("MENU MANTENIMET ALUMNES");
			System.out.println("1.- Alta alumne nou");
			System.out.println("2.- Baixa alumne existent");
			System.out.println("3.- Modificaci� alumne existent");
			System.out.println("4.- Consulta tots els alumnes");
			System.out.println("9.- Sortir");

			System.out.println("Entrin el n�mero d'opci� del men�");
			opcio = lector.nextInt();
			System.out.println("L'opci� triada �s : " + opcio);
			
			switch (opcio) {
				case 1:
					System.out.println("Entrin el nom de l'alumne");
					nombre = lector.next();
					System.out.println("Entrin la edat de l'alumne");
					int edat = lector.nextInt();
					alumneBOinst.guardaAlumne(nombre, edat);
					break;
				case 2:
					System.out.println("Entri alumne a donar de baixa");
					nombre = lector.next();
					alumneBOinst.baixaAlumne(nombre);
					break;
				case 3:
					System.out.println("Entri alumne a modificar");
					 nombre = lector.next();
					System.out.println("Entra el nom nou");
					String nomNou = lector.next();
					System.out.println("Entra la nova edat");
					int edatNova = lector.nextInt();
					
					if (alumneBOinst.modificaAlumne(nombre, nomNou, edatNova)) {
						alumneBOinst.modificaAlumne(nombre, nomNou, edatNova);
					}

					break;
				case 4:
					System.out.println("Consulta tots els alumnes");

					Iterator<Alumne> it = alumneBOinst.aListAlumnes.iterator();
						while(it.hasNext()){
							aluinst = it.next();
							System.out.println(aluinst.getNom()+ " - " + aluinst.getEdat());
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

class Alumne{
	private String nom;
	private int edat;
	public Alumne() {
		super();
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}
		
}

class AlumneBO {
	List<Alumne> aListAlumnes = new ArrayList<Alumne>();

	
	public void guardaAlumne(String nom, int edat) {
		Alumne alumne = new Alumne();
		alumne.setNom(nom);
		alumne.setEdat(edat);
		aListAlumnes.add(alumne);
	}
	
	public void baixaAlumne (String alumneFora) {
		Iterator <Alumne> it = aListAlumnes.iterator();
		while(it.hasNext()) {
			Alumne alumno = it.next();
			if (alumno.getNom().equals(alumneFora)) {
				it.remove();
			}
		}
	}
	
	public boolean modificaAlumne(String alumneNom, String nomNou, int edatNova) {
		boolean esta = false;
		Iterator<Alumne> it = (aListAlumnes).iterator();
		while(it.hasNext() && !esta){
			Alumne alumne = it.next();
			if (alumneNom.equals(alumne.getNom())) {
				alumne.setNom(nomNou);
				alumne.setEdat(edatNova);
				esta = true;
			}
		}
		return esta;
		
	}
	
	public List<Alumne> listAlumnes() {
		return aListAlumnes;
	}
}

	
	


