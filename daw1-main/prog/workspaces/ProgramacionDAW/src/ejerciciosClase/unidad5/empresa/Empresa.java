package ejerciciosClase.unidad5.empresa;

public class Empresa{

	//Atributos
	private String nombreEmpresa;
	private String cif;
	private String telefonoEmpresa;
	private String direccionEmpresa;
	private Empleado [] empleados;
	
	//Constructores
	
	public Empresa(String nombreEmpresa,String cif,String telefonoEmpresa, String direccionEmpresa) {
		// TODO Auto-generated constructor stub
		
		this.nombreEmpresa = nombreEmpresa;
		this.cif = cif;
		this.telefonoEmpresa = telefonoEmpresa;
		this.direccionEmpresa = direccionEmpresa;
		this.empleados = new Empleado [100];
		
	}
	
	
	
	public Empresa(String nombreEmpresa, String cif) {
		super();
		this.nombreEmpresa = " ";
		this.cif = " ";
		this.telefonoEmpresa = telefonoEmpresa;
		this.direccionEmpresa = direccionEmpresa;
		this.empleados = new Empleado [100];
	}



	


	//Getters and Setters
	/**
	 * @return the telefonoEmpresa
	 */
	public String getTelefonoEmpresa() {
		return telefonoEmpresa;
	}



	/**
	 * @param telefonoEmpresa the telefonoEmpresa to set
	 */
	public void setTelefonoEmpresa(String telefonoEmpresa) {
		this.telefonoEmpresa = telefonoEmpresa;
	}



	/**
	 * @return the direccionEmpresa
	 */
	public String getDireccionEmpresa() {
		return direccionEmpresa;
	}



	/**
	 * @param direccionEmpresa the direccionEmpresa to set
	 */
	public void setDireccionEmpresa(String direccionEmpresa) {
		this.direccionEmpresa = direccionEmpresa;
	}



	/**
	 * @return the empleados
	 */
	public Empleado[] getEmpleados() {
		return empleados;
	}



	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(Empleado[] empleados) {
		this.empleados = empleados;
	}



	/**
	 * @param nombreEmpresa the nombreEmpresa to set
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}



	/**
	 * @param cif the cif to set
	 */
	public void setCif(String cif) {
		this.cif = cif;
	}

	//Metodos
	public void agregarEmpleado(Empleado empleado) throws EmpresaExeption {
		
		boolean introducido = false;
		int index = 0;
		
		while (!introducido && index < this.empleados.length) {
			if (null == this.empleados[index]) {
				this.empleados[index] = empleado;
				introducido = true;
			}
			index++;
			
			
		}
		
		if(!introducido) {
			throw new EmpresaExeption("La empresa no puede agregar mas empleados");
		}
		
	}
	
	public void eliminarEmpleado (Empleado empleado) {
		boolean eliminado= false;
		int i = 0;
		while(!eliminado && i< this.empleados.length) {
			if(this.empleados[i].equals(empleado)) {
				this.empleados[i]= null;
				eliminado= true;
			} 
			i++;	
		}		
	}
	
	public void mostrarEmpleados() {
		System.out.println("Empresa: " + this.nombreEmpresa);
		System.out.println("Lista de empleados: ");
		int index = 1;
		for (Empleado empleado : this.empleados) {
			if(null != empleado) {
				System.out.println(index++ + "--------------------------");
				System.out.println(empleado.devolverInfoString());
			}
		}
	}
	
	
	public void datosEmpleados(Empleado empleado) {
		System.out.println("DNI: " + empleado.getDni());
		System.out.println("Sueldo Bruto: " + empleado.getSueldoBruto());
		System.out.println("DNI: " + empleado.calcularSueldoNeto());
		
	}
	
	
	
}
