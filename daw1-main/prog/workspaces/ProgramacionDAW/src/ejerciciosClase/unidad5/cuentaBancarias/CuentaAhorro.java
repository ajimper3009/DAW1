package ejerciciosClase.unidad5.cuentaBancarias;

public class CuentaAhorro extends CuentaBancaria{

	//Atributos
	private double tipoInteresAnual;

	public CuentaAhorro(String nombre, String apellido, String dni, double saldo, String iban, double d, double tipoInteresAnual) {
		super(nombre, apellido, dni, saldo, iban);
		// TODO Auto-generated constructor stub
		
		//Atributos
		this.tipoInteresAnual = tipoInteresAnual;
	}

	/**
	 * @return the tipoInteresAnual
	 */
	public double getTipoInteresAnual() {
		return tipoInteresAnual;
	}

	/**
	 * @param tipoInteresAnual the tipoInteresAnual to set
	 */
	public void setTipoInteresAnual(double tipoInteresAnual) {
		this.tipoInteresAnual = tipoInteresAnual;
	}

	public String devolverInfoString () {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.devolverInfoString());
		
		return super.devolverInfoString();
		
	}
	
}
