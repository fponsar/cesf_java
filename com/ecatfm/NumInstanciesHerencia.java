package com.ecatfm;


public class NumInstanciesHerencia {
	
	public static void main(String[] args) {
		/* El constructor de la clase Persona debe incrementar en una unidad 
		 * la variable numInstancias. 
		 * Desarrolle una clase con el nombre Main, que contenga un m�todo 
		 * public static void main(String args[]), que al ejecutarse cree dos 
		 * instancias de empleado y dos de cliente e imprima el total de 
		 * instancias de persona creadas.
		 */
		new Empleado(); // Fem inst�ncia de la classe variable per que numInstancias �s static.
		new Empleado(); // Al crear la inst�ncia de la classe hem de posar ()
		new Cliente();
		new Cliente();
		System.out.println("N�mero de crides als fills de Persona, Empleado i Cliente = " + Persona.numInstancias);

	}

}

// Les classes est�n fora de main i de la classe p�blica que l'engloba per nom
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