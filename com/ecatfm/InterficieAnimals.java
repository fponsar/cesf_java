package com.ecatfm;

public class InterficieAnimals {

	public static void main(String[] args) {
		// Primer exercici interfície
		new PerroI();
		new VacaI();
		new GatoI();
		
		System.out.println(AnimalI.sonidoMasLargoI);
	}

}

abstract class AnimalI implements IficieAnimals{
	static String sonidoMasLargoI="";
	String sonidoI;
	
	@Override
	public void compararSonidoI() {
		// Busca el so més llarg
			establecerSonidoI();
			compararSonidoI();
	}
		
	void animalI(){
		if (sonidoI.length()>=sonidoMasLargoI.length()) { //Si algun és null,error java.lang.NullPointerException 
			sonidoMasLargoI = sonidoI;
		}
	}
	
	public abstract void establecerSonidoI();
}

class VacaI extends AnimalI {
	public VacaI() {
		super();
	}
	public void establecerSonidoI() {
		this.sonidoI = "Muuuuuuuuuuu";
	}
}

class PerroI extends AnimalI {
	public PerroI() {
		super();
	}
	public void establecerSonidoI() {
		this.sonidoI = "GuauGuauGuauGuauGuauGuau";
	}
}

class GatoI extends AnimalI {
	public GatoI() {
		super();
	}
	public void establecerSonidoI() {
		this.sonidoI = "Miau";
	}
}
