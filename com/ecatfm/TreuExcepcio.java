package com.ecatfm;

public class TreuExcepcio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 90;
		Servicio servicio = new Servicio();
		
		try {
			double pvp = servicio.getPrecioConIva(base);
			System.out.println("Preu raonable amb IVA: " + pvp);
		} catch (PreuMassaAltException e) {
			e.printStackTrace();
		}

	}
	
}

 class Servicio {
	public double getPrecioConIva(float preu) throws PreuMassaAltException {
		double pvp = preu*1.16;
		
		if (pvp > 100) {
			throw new PreuMassaAltException();
		}
		return pvp;
	}
}

class PreuMassaAltException extends Exception {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L; // No s� que �s. Sino dona Warning.

		@Override
		public void printStackTrace() {
			// TODO Auto-generated method stub
			super.printStackTrace();
			System.out.println("Preu massa alt");
		}
}
