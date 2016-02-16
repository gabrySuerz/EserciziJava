package main;

/**
 * Classe rappresentante un Cliente. L'univocità di un dipendente è data dal
 * suo CF.
 *
 */
public abstract class Cliente {

	private String cf;
	private int parcellaBase;

	public abstract double calcolaParcella();

	/**
	 * Il codice fiscale identifica univocamente un Cliente
	 * 
	 * @return CF
	 */
	public String getCF() {
		return cf;
	}

	/**
	 * Il codice fiscale identifica univocamente un Cliente
	 * 
	 * @param cf
	 *            codice fiscale
	 */
	public void setCF(String cf) {
		this.cf = cf;
	}

	public int getParcellaBase() {
		return parcellaBase;
	}

	public void setParcellaBase(int parcellaBase) {
		this.parcellaBase = parcellaBase;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Cliente)) {
			return false;
		}
		Cliente c = (Cliente) o;
		return cf.equals(c.cf);
	}

	public String toString() {
		return cf + " " + parcellaBase;
	}

	@Override
	public int hashCode() {
		return cf.hashCode();
	}

}
