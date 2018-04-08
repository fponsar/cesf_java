package com.ecatfm;

public class AnimalsSoAbstracte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Perro2();
		new Vaca2();
		new Gato2();
		
		System.out.println(Animal2.sonidoMasLargo2);
	}

}

abstract class Animal2 {
	static String sonidoMasLargo2=""; // S'ha d'inicialitzar!!!
	String sonido2;

	public Animal2(){
		super();
		establecerSonido2();
		compararSonido2();
	} 


	private void compararSonido2() {
		if (sonido2.length()>=sonidoMasLargo2.length()) { //Si algun és null,error java.lang.NullPointerException 
			sonidoMasLargo2 = sonido2;
		}
	}
	
	public abstract void establecerSonido2();
	
}

class Vaca2 extends Animal2 {
	public Vaca2() {
		super();
	}
	public void establecerSonido2() {
		this.sonido2 = "Muuuuuuuuuuu";
	}
}

class Perro2 extends Animal2 {
	public Perro2() {
		super();
	}
	public void establecerSonido2() {
		this.sonido2 = "GuauGuauGuauGuauGuauGuau";
	}
}

class Gato2 extends Animal2 {
	public Gato2() {
		super();
	}
	public void establecerSonido2() {
		this.sonido2 = "Miau";
	}
}
