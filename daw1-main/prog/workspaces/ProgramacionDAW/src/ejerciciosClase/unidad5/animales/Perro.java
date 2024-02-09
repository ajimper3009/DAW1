package ejerciciosClase.unidad5.animales;

import java.util.Date;

public class Perro extends Mamifero {
	private String nombre;
	
	/**
	 * @param nombre
	 */
	public Perro(String nombre) {
		super();
		this.setNombre(nombre);
		this.fechaNac = new Date();
		this.fechaDef = null;
	}
	public Perro(String nombre, Date fechaNac) {
		super();
		this.setNombre(nombre);
		this.fechaNac = fechaNac;
		this.fechaDef = null;
	}

	@Override
	public void come(String comida) {
		if ("HUESO".equalsIgnoreCase(comida)) {
			System.out.println("Qué rico!");
		} else {
			System.out.println("No me gusta");
		}
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
