package desarrolloClases;

import java.time.LocalDate;

public class Equipo {
	
	public static int numeroEquipo;
	private String nombreEquipo;
	private String cifEquipo;
	private String direccionEquipo;
	private String telefono;
	private LocalDate fechaFundacion;
	private String nombrePresidente;
	private boolean masCienAbonados;
	private char categoria;
	private String observaciones;
	
	public Equipo() {
		this.numeroEquipo++;
		this.nombreEquipo = "";
		this.cifEquipo = "";
		this.direccionEquipo = "";
		this.telefono = "";
		this.fechaFundacion = LocalDate.now();
		this.nombrePresidente = "";
		this.masCienAbonados = false;
		this.categoria = 'A';
		this.observaciones = "";
		
		
		
	}

	public Equipo(String nombreEquipo, String cifEquipo, String direccionEquipo, String telefono,
			LocalDate fechaFundacion, String nombrePresidente, boolean masCienAbonados, char categoria,
			String observaciones) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.cifEquipo = cifEquipo;
		this.direccionEquipo = direccionEquipo;
		this.telefono = telefono;
		this.fechaFundacion = fechaFundacion;
		this.nombrePresidente = nombrePresidente;
		this.masCienAbonados = masCienAbonados;
		this.categoria = categoria;
		this.observaciones = observaciones;
		this.numeroEquipo++;
	}

	/**
	 * @return the nombreEquipo
	 */
	public String getNombreEquipo() {
		return nombreEquipo;
	}

	/**
	 * @param nombreEquipo the nombreEquipo to set
	 */
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	/**
	 * @return the cifEquipo
	 */
	public String getCifEquipo() {
		return cifEquipo;
	}

	/**
	 * @param cifEquipo the cifEquipo to set
	 */
	public void setCifEquipo(String cifEquipo) {
		this.cifEquipo = cifEquipo;
	}

	/**
	 * @return the direccionEquipo
	 */
	public String getDireccionEquipo() {
		return direccionEquipo;
	}

	/**
	 * @param direccionEquipo the direccionEquipo to set
	 */
	public void setDireccionEquipo(String direccionEquipo) {
		this.direccionEquipo = direccionEquipo;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the fechaFundacion
	 */
	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}

	/**
	 * @param fechaFundacion the fechaFundacion to set
	 */
	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	/**
	 * @return the nombrePresidente
	 */
	public String getNombrePresidente() {
		return nombrePresidente;
	}

	/**
	 * @param nombrePresidente the nombrePresidente to set
	 */
	public void setNombrePresidente(String nombrePresidente) {
		this.nombrePresidente = nombrePresidente;
	}

	/**
	 * @return the masCienAbonados
	 */
	public boolean getMasCienAbonados() {
		return masCienAbonados;
	}

	/**
	 * @param masCienAbonados the masCienAbonados to set
	 */
	public void setMasCienAbonados(boolean masCienAbonados) {
		this.masCienAbonados = masCienAbonados;
	}

	/**
	 * @return the categoria
	 */
	public char getCategoria() {
			
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 * @throws WrongCategoriaEquipoExpeption 
	 */
	public void setCategoria(char categoria) throws WrongCategoriaEquipoExpeption {
		if (categoria == 'A' || categoria == 'I' || categoria == 'J') {
			
		} else {
			throw new WrongCategoriaEquipoExpeption("La categoria es incorrecta debe se A, I o J");
		}
		this.categoria = categoria;
	}

	/**
	 * @return the observaciones
	 */
	public String getObservaciones() {
		return observaciones;
	}

	/**
	 * @param observaciones the observaciones to set
	 */
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", direccionEquipo=" + direccionEquipo + ", fechaFundacion="
				+ fechaFundacion + ", categoria=" + categoria + "]";
	}
	
	
}
