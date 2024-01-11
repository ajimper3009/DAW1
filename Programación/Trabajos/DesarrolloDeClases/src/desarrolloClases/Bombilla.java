package desarrolloClases;

public class Bombilla {

	private String marca;
	private Double potencia;
	private boolean encendida;
	private Double precio;
	
	
	//Constructor
	public Bombilla (String marca,Double potencia, Double precio) {
		this.marca = marca;
		this.potencia = potencia;
		this.precio = precio;
		this.encendida = false;
	}
	
	
	public Double getPotencia() {
		return potencia;
	}


	public void setPotencia(Double potencia) {
		this.potencia = potencia;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	public boolean getEncendida() {
		return encendida;
	}


	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void encender() {
		this.encendida = true;
	}
	public void apagar() {
		this.encendida = false;
	}
	
	public void cambiarMarca(String marca) {
		this.marca = marca;
	}
}
