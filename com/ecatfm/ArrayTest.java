package com.ecatfm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
		// Fer arrayList de nom i edat de tres persones
		List<Persona2> arrayList = new ArrayList<Persona2>();
		
		arrayList.add(new Persona2("Marta",30));
		arrayList.add(new Persona2("Maria",40));
		arrayList.add(new Persona2("Pere",34));
		
		Iterator<Persona2> it = (arrayList).iterator();
		while(it.hasNext()){
			Persona2 p = it.next();
			System.out.println(p.getNom() + " té " + p.getEdat() + " anys.");
		}
	}
	
}

class Persona2 {
	private String nom;
	private int edat;
	
	public Persona2() {
		super();
	}
	
	public Persona2(String nom, int edat){
		super();
		this.nom= nom;
		this.edat = edat;
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