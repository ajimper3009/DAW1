package ejerciciosClase.unidad5;

public class Bombilla {
	private String marca;
	private double potencia;
	private boolean encendida;
	/**
	 * Indica el precio de coste de la bombilla
	 * 
	 * @param precio
	 */
	private double precio;

	/**
	 * Constructor sin parámetros
	 */
	public Bombilla() {
		this.marca = "";
		this.potencia = 0d;
		this.precio = 0d;
		this.encendida = Boolean.FALSE;
	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param marca
	 * @param potencia
	 * @param precio
	 */
	public Bombilla(String marca, double potencia, double precio) {
		this.marca = marca;
		this.potencia = potencia;
		this.precio = precio;
		this.encendida = Boolean.FALSE;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the potencia
	 */
	public double getPotencia() {
		return potencia;
	}

	/**
	 * @param potencia the potencia to set
	 */
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	/**
	 * @return the encendida
	 */
	public boolean getEncendida() {
		return encendida;
	}

	/**
	 * Se depreca el setter de encendida por existir los métodos apagar y encender
	 * que modifican el valor de dicho atributo
	 * 
	 * @param encendida the encendida to set
	 */
	@Deprecated
	public void setEncendida(boolean encendida) {
		this.encendida = encendida;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void encender() {
		this.encendida = Boolean.TRUE;
	}

	public void apagar() {
		this.encendida = Boolean.FALSE;
	}

	@Override
	public String toString() {
		String estado = this.encendida ? "Encendida" : "Apagada";
		return "Bombilla [marca=" + marca + ", potencia=" + potencia + " w, precio=" + precio + " €. " + estado + "]";
	}

	@Override
	public boolean equals(Object bombilla) {
		boolean equals = false;
		Bombilla aux = new Bombilla();
		if (bombilla instanceof Bombilla) {
			aux = ((Bombilla) bombilla);
			equals = this.marca.equals(aux.getMarca()) && this.potencia == aux.getPotencia();
		}
		return equals;
	}

}
