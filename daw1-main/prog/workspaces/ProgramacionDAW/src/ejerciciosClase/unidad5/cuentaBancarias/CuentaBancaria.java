package ejerciciosClase.unidad5.cuentaBancarias;

import ejerciciosClase.unidad5.persona.Persona;

public abstract class CuentaBancaria implements Imprimible {

	//Atributos de la clase
	private Persona titularCuenta;
	private double saldo;
	private String iban;
	
	//Constructores
	public CuentaBancaria (String nombre, String apellido, String dni, double saldo, String iban) {
		this.titularCuenta = new Persona(nombre, apellido, dni);
		this.saldo = saldo;
		this.iban = comprobarIban(iban);
	}
	
	private String comprobarIban(String iban) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the titularCuenta
	 */
	public Persona getTitularCuenta() {
		return titularCuenta;
	}



	/**
	 * @param titularCuenta the titularCuenta to set
	 */
	public void setTitularCuenta(Persona titularCuenta) {
		this.titularCuenta = titularCuenta;
	}



	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}



	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	/**
	 * @return the iban
	 */
	public String getIban() {
		return iban;
	}



	/**
	 * @param iban the iban to set
	 */
	public void setIban(String iban) {
		this.iban = iban;
	}



	@Override
	public String devolverInfoString() {
		// TODO Auto-generated method stub
		StringBuilder result = new StringBuilder();
		result.append("Cuenta Bancaria: " + iban);
		result.append("Titular: " + titularCuenta);
		result.append("Saldo: " + saldo);
		return this.toString();
	}
	
	
	

}
