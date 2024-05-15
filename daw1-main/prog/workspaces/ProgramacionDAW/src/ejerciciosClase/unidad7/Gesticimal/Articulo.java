package ejerciciosClase.unidad7.Gesticimal;

import org.apache.commons.lang3.StringUtils;

public class Articulo {

	private String codigo;
	private String descripcion;
	private float precioCompra;
	private float precioVenta;
	private int stock;
	
	
	public Articulo(String codigo, String descripcion, float precioCompra, float precioVenta, int stock) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.stock = stock;
	}


	//Constructor para una linea de csv   con el formato: cod;des;preciC;preciV;stock
	public Articulo(String csvItem) {
		super();
		String[] valores = csvItem.split(";");
		String codigo = valores[0];
		String descripcion = valores[1];
		float precioCompra = Float.parseFloat(StringUtils.replace(valores[2],",","."));
		float precioVenta = Float.parseFloat(StringUtils.replace(valores[3],",","."));
		int stock = Integer.parseInt(valores[4]);
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.stock = stock;
	}




	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}



	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}



	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	/**
	 * @return the precioCompra
	 */
	public double getPrecioCompra() {
		return precioCompra;
	}



	/**
	 * @param precioCompra the precioCompra to set
	 */
	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}



	/**
	 * @return the precioVenta
	 */
	public double getPrecioVenta() {
		return precioVenta;
	}



	/**
	 * @param precioVenta the precioVenta to set
	 */
	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}



	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}



	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}



	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", descripcion=" + descripcion + ", precioCompra=" + precioCompra
				+ ", precioVenta=" + precioVenta + ", stock=" + stock + "]";
	}
	
	public boolean equals (Articulo o) {
		return this.getCodigo().equals(o.getCodigo());
	}
	
}
