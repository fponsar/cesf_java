package com.ecatfm;


public class NumInstanciesHerencia {
	
	public static void main(String[] args) {
		/* El constructor de la clase Persona debe incrementar en una unidad 
		 * la variable numInstancias. 
		 * Desarrolle una clase con el nombre Main, que contenga un método 
		 * public static void main(String args[]), que al ejecutarse cree dos 
		 * instancias de empleado y dos de cliente e imprima el total de 
		 * instancias de persona creadas.
		 */
		new Empleado(); // Fem instància de la classe variable per que numInstancias és static.
		new Empleado(); // Al crear la instància de la classe hem de posar ()
		new Cliente();
		new Cliente();
		System.out.println("Número de crides als fills de Persona, Empleado i Cliente = " + Persona.numInstancias);

	}

}

// Les classes estàn fora de main i de la classe pública que l'engloba per nom
// del fitxer.

class Persona { // Ull! Al definir la class no es posa () al nom de la classe
	static int numInstancias;
	public Persona(){
		super();
		numInstancias++;
	}
}

class Empleado extends Persona {
	public Empleado(){
		super();
	}
}

class Cliente extends Persona {
	public Cliente(){
		super();
	}
}