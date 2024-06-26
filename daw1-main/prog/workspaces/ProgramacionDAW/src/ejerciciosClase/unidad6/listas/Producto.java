package ejerciciosClase.unidad6.listas;

public class Producto {

	private int codigo;
	private String nombre;
	private String tipo;
	private double precio;
	private int existencias;

	public Producto(int cod, String nom, String tp, double pvp, int stock) {
		codigo = cod;
		nombre = nom;
		tipo = tp;
		precio = pvp;
		existencias = stock;
	}

	// -------------------------------------------
	public int ver_codigo() {
		return codigo;
	}

	public String ver_nombre() {
		return nombre;
	}

	public String ver_tipo() {
		return tipo;
	}

	public double ver_precio() {
		return precio;
	}

	public int ver_existencias() {
		return existencias;
	}

	// ---------------------------------------
	public void modificar_codigo(int cod) {
		codigo = cod;
	}

	public void modificar_nombre(String nom) {
		nombre = nom;
	}

	public void modificar_tipo(String tp) {
		tipo = tp;
	}

	public void modificar_precio(double pvp) {
		precio = pvp;
	}

	public void modificar_existencias(int stock) {
		existencias = stock;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Codigo: ").append(this.codigo);
		sb.append("\nNombre: ").append(this.nombre);
		sb.append("\nTipo: ").append(this.tipo);
		sb.append("\nPrecio: ").append(this.precio);
		sb.append("Stock: ").append(this.existencias);
		
		return sb.toString();
	}
}
