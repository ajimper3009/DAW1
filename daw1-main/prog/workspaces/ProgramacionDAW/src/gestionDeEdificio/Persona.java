package gestionDeEdificio;

import java.util.Objects;

public class Persona implements Comparable<Persona>{

	 private String dni;
	    private String nombre;
	    private String apellidos;
	    
	    public Persona(String nombre, String apellidos, String dni) {
	        this.dni = dni;
	        this.nombre = nombre;
	        this.apellidos = apellidos;
	    }
	    
	    // Getters y Setters
	    
	    @Override
	    public int compareTo(Persona otraPersona) {
	        // Ordenar por apellidos y luego por nombre
	        int comparacionApellidos = this.apellidos.compareTo(otraPersona.apellidos);
	        if (comparacionApellidos == 0) {
	            return this.nombre.compareTo(otraPersona.nombre);
	        }
	        return comparacionApellidos;
	    }
	    
	    
	    
	    /**
		 * @return the dni
		 */
		public String getDni() {
			return dni;
		}

		/**
		 * @param dni the dni to set
		 */
		public void setDni(String dni) {
			this.dni = dni;
		}

		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		/**
		 * @return the apellidos
		 */
		public String getApellidos() {
			return apellidos;
		}

		/**
		 * @param apellidos the apellidos to set
		 */
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		@Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (!(obj instanceof Persona)) {
	            return false;
	        }
	        Persona otraPersona = (Persona) obj;
	        return this.dni.equals(otraPersona.dni);
	    }
	    
	    @Override
	    public int hashCode() {
	        return Objects.hash(dni);
	    }
	
}
