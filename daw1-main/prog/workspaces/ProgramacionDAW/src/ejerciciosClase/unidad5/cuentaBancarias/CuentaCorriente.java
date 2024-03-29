package ejerciciosClase.unidad5.cuentaBancarias;

import org.apache.commons.lang3.StringUtils;

public abstract class CuentaCorriente extends CuentaBancaria {

	//Atributos
	private String [] entidades;
	
	//Constructores
	public CuentaCorriente(String nombre, String apellido, String dni, double saldo, String iban, String [] entidades) {
		super(nombre, apellido, dni, saldo, iban);
		// TODO Auto-generated constructor stub
		this.entidades = entidades;
	}
	
	//Getters y Setters
	/**
	 * @return the entidades
	 */
	public String[] getEntidades() {
		return entidades;
	}
	/**
	 * @param entidades the entidades to set
	 */
	public void setEntidades(String[] entidades) {
		this.entidades = entidades;
	}

	
	public String devolverInfoString( ) {
		StringBuilder result = new StringBuilder();
		result.append(super.devolverInfoString());
		result.append("\nEntidades autorizadas: ");
		for (String entidad : entidades) {
			result.append(entidad);
			if (null != entidad && StringUtils.isNotEmpty(entidad)) {
				result.append("\n\t-\t");
				result.append(entidad);
			}
		}
		
		return result.toString();
		
	}
	
	
}
