package gestionDeEdificio;

import java.util.Date;

public class Registro {

	//Informacion de las personas del registro
	private Persona persona;
	//Fecha en la que se prodducce el registro de e/s
	private Date fecha;
	//tipo de registro: true = entrada y false = salida
	private boolean entrada;
	
	//Constructor
	public Registro(Persona persona, Date fecha, boolean entrada) {
		super();
		this.persona = persona;
		this.fecha = fecha;
		this.entrada = entrada;
	}
	
	//Getters y Setters
	
	/**
	 * @return the persona
	 */
	public Persona getPersona() {
		return persona;
	}
	/**
	 * @param persona the persona to set
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return the entrada
	 */
	public boolean isEntrada() {
		return entrada;
	}
	/**
	 * @param entrada the entrada to set
	 */
	public void setEntrada(boolean entrada) {
		this.entrada = entrada;
	}

	
	
}
