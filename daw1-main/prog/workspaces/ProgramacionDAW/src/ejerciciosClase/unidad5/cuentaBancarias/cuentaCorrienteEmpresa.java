package ejerciciosClase.unidad5.cuentaBancarias;

public class cuentaCorrienteEmpresa extends CuentaCorriente {

	//Atributos
	private double tipoInteresDescubierto;
	private double comisionFija;
	private double maximoDescubierto;
	
	
	//Contructores
	public cuentaCorrienteEmpresa(String nombre, String apellido, String dni, double saldo, String iban,
			String[] entidades,double tipoInteresDescubierto, double comisionFija, double maximoDescubierto) {
		super(nombre, apellido, dni, saldo, iban, entidades);
		
		this.tipoInteresDescubierto = tipoInteresDescubierto;
		this.comisionFija = comisionFija;
		this.maximoDescubierto = maximoDescubierto;
	}


	//Getters and Setters
	
	/**
	 * @return the tipoInteresDes
	 */
	public double getTipoInteresDes() {
		return tipoInteresDescubierto;
	}


	/**
	 * @param tipoInteresDes the tipoInteresDes to set
	 */
	public void setTipoInteresDes(double tipoInteresDes) {
		this.tipoInteresDescubierto = tipoInteresDes;
	}


	/**
	 * @return the comisionFija
	 */
	public double getComisionFija() {
		return comisionFija;
	}


	/**
	 * @param comisionFija the comisionFija to set
	 */
	public void setComisionFija(double comisionFija) {
		this.comisionFija = comisionFija;
	}


	/**
	 * @return the maximoDescubierto
	 */
	public double getMaximoDescubierto() {
		return maximoDescubierto;
	}


	/**
	 * @param maximoDescubierto the maximoDescubierto to set
	 */
	public void setMaximoDescubierto(double maximoDescubierto) {
		this.maximoDescubierto = maximoDescubierto;
	}


	@Override
	public String devolverInfoString() {
		StringBuilder result = new StringBuilder();
		result.append(super.devolverInfoString());
		result.append("\nTipo interés descubierto: ").append(tipoInteresDescubierto);
		result.append("\nMaximo descubierto: ").append(maximoDescubierto);
		result.append("\nComision fija: ").append(comisionFija);
		
		return result.toString();
	}
	
	
	
	

}
