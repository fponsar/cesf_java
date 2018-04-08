package com.ecatfm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Deposito5 implements Comparable<Deposito5> {

	private String nom;
	private int lla = 0;
	private int amp = 0;
	private int alt = 0;
	private int vol = 0;
	private int volextern = 0;
	
	public Deposito5(String dip, int lla, int amp, int alt) {
		super();
		this.nom = dip;
		this.lla = lla;
		this.amp = amp;
		this.alt = alt;
	}

	/**
	 * @return the lla
	 */
	public int getLla() {
		return lla;
	}



	/**
	 * @param lla the lla to set
	 */
	public void setLla(int lla) {
		this.lla = lla;
	}



	/**
	 * @return the amp
	 */
	public int getAmp() {
		return amp;
	}



	/**
	 * @param amp the amp to set
	 */
	public void setAmp(int amp) {
		this.amp = amp;
	}



	/**
	 * @return the alt
	 */
	public int getAlt() {
		return alt;
	}



	/**
	 * @param alt the alt to set
	 */
	public void setAlt(int alt) {
		this.alt = alt;
	}
	

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// Sobrescribim el m�tode per que retorni
		// diposits iguals si tenen el mateix volum
		if (!(obj instanceof Deposito5)) return false;
		Deposito5 deps = (Deposito5) obj;
		vol = lla*amp*alt;
		volextern = deps.alt*deps.amp*deps.lla;
		return (vol==volextern);
		//return super.equals(obj);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Deposito5 o) {
		// TODO Auto-generated method stub
		int volDip = this.alt*this.lla+this.amp;
		int volComp = o.alt*o.lla*o.amp;
		int valorComparacio = 0;
		
		if (volDip > volComp) valorComparacio = 1;
		if (volDip == volComp) valorComparacio = 0;
		if (volDip < volComp) valorComparacio = -1;
		
		return valorComparacio;
		//return 0;
	}
	
	public static void main(String[] args) {
		// Cinc dip�sits en una llista
		List<Deposito5> deps = new ArrayList<Deposito5>();
		
		Deposito5 dep1 = new Deposito5("d1", 10, 2, 2);
		Deposito5 dep2 = new Deposito5("d2", 1, 100, 2);
		Deposito5 dep3 = new Deposito5("d3", 3, 4, 1);
		Deposito5 dep4 = new Deposito5("d4", 2, 5, 2);
		Deposito5 dep5 = new Deposito5("d5", 5, 4, 6);
		
		deps.add(dep1);
		deps.add(dep2);
		deps.add(dep3);
		deps.add(dep4);
		deps.add(dep5);
		
		Collections.sort(deps);
		
		Iterator<Deposito5> iter = deps.iterator();
		
		while(iter.hasNext()){
			Deposito5 d = iter.next();
			System.out.println(d.getNom() + " = " + d.getLla() + " " + d.getAmp() + " " + d.getAlt());
		}
	}

}


