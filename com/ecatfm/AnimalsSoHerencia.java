package com.ecatfm;

public class AnimalsSoHerencia {

	public static void main(String[] args) {
		// Sonido más largo
		new Perro("GuauGuau");
		new Vaca("Muuuuuuuuuu");
		new Gato("Miau");
		
		System.out.println(Animal.sonidoMasLargo);
		
	}

}

class Animal {
	static String sonidoMasLargo=""; // S'ha d'inicialitzar!!!
	String sonido;

	public Animal(String sonido){
		super();
		this.sonido = sonido;
		compararSonido();
	} 
	
	private void compararSonido() {
		if (sonido.length()>=sonidoMasLargo.length()) { //Si algun és null,error java.lang.NullPointerException 
			sonidoMasLargo = sonido;
		}
		
	}
}

class Vaca extends Animal {
	public Vaca(String sonido) {
		super(sonido);
	}
}

class Perro extends Animal {
	public Perro(String sonido) {
		super(sonido);
	}
}

class Gato extends Animal {
	public Gato(String sonido) {
		super(sonido);
	}
}