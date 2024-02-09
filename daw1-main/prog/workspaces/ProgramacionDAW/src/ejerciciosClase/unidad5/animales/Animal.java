package ejerciciosClase.unidad5.animales;

import java.util.Date;

public abstract class Animal {
	protected Date fechaNac;
	protected Date fechaDef;
	/**
	 * @return the fechaDef
	 */
	public Date getFechaDef() {
		return fechaDef;
	}
	/**
	 * @param fechaDef the fechaDef to set
	 */
	public void setFechaDef(Date fechaDef) {
		this.fechaDef = fechaDef;
	}
	public abstract void come(String comida);
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
}
