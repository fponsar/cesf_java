package com.ecatfm;

public class Deposito {
	
	private int llarg = 0;
	private int ample = 0;
	private int alt = 0;
	private int vol = 0;
	private int volextern = 0;
	

	public Deposito(int llarg, int ample, int alt) {
		super();
		this.llarg = llarg;
		this.ample = ample;
		this.alt = alt;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// Sobrescribim el m�tode per que retorni
		// diposits iguals si tenen el mateix volum
		if (!(obj instanceof Deposito)) return false;
		Deposito deposito = (Deposito) obj;
		vol = llarg*ample*alt;
		volextern = deposito.alt*deposito.ample*deposito.llarg;
		return (vol==volextern);
		
		//return super.equals(obj);
	}

	public static void main(String[] args) {
		// Sobrescriure el m�tode equals de Deposito per comparar-los.
		// No �s una llista, hi ha sols dos dip�sits.
		Deposito dep1 = new Deposito(3, 4, 4);
		Deposito dep2 = new Deposito(5, 4, 2);
		
		System.out.println("S�n iguals el dos dip�sits? " + dep1.equals(dep2));

	}

}
