package ejerciciosClase.unidad5.tienda;

import org.apache.commons.lang3.StringUtils;

public abstract class ArticuloDeportivo {

	protected String descripcion;
	protected String ciudad;
	protected String tienda;
	protected String tipo;
	protected String codArticulo;
	protected String digControl;
	protected int unidades;
	
	public ArticuloDeportivo() {
		this.descripcion = "";
		this.ciudad = "00";
		this.ciudad = "00";
		this.tipo = "00";
		this.codArticulo = "000000";
		this.digControl = "00";
		this.unidades = 0;
		
		
	}
	
	public ArticuloDeportivo(String descripcion, String codigoCompleto, int unidades) throws TiendaDeportesException {
		
		this.descripcion = comprobarDescripción(descripcion);
		
		//Tambien podemos comprar si es numerico con isNumeric
		if (null != codigoCompleto && codigoCompleto.length() == 14 && StringUtils.isNumeric(codigoCompleto)) {
			this.ciudad = codigoCompleto.substring(0,2);
			this.tienda = codigoCompleto.substring(2,4);
			this.tipo = codigoCompleto.substring(4,6);
			this.codArticulo = codigoCompleto.substring(6,12);
			this.digControl = codigoCompleto.substring(12,14);
			
			int cuenta = Integer.parseInt(this.ciudad) + Integer.parseInt(this.tienda) + Integer.parseInt(this.codArticulo);
			if (cuenta%99 != Integer.parseInt(this.digControl)) {
				throw new TiendaDeportesException("El código del articulo es erroneo");
			}
		}
		//TODO: Resolver tema de unidades
		this.unidades = unidades;
	}
		
	


	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
		this.digControl = calcularDigitoControl();
	}

	public String getTienda() {
		return tienda;
	}

	public void setTienda(String tienda) {
		this.tienda = tienda;
		this.digControl = calcularDigitoControl();
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCodArticulo() {
		return codArticulo;
	}

	public void setCodArticulo(String codArticulo) {
		this.codArticulo = codArticulo;
		this.digControl = calcularDigitoControl();
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public String getDigControl() {
		return digControl;
	}

	private String comprobarDescripción(String descripcion2) throws TiendaDeportesException {
		if (null != descripcion && descripcion.length() <= 40) {
			return descripcion;
			
		}
		throw new TiendaDeportesException("La descripcion debe ocupar 40 caracteres como maximo");
	}
	String getCodigoCompleto() {
		return this.ciudad + this.tienda + this.tipo + this.codArticulo + this.digControl;
	}
	private String calcularDigitoControl() {
		int cuenta = (Integer.parseInt(this.ciudad) + Integer.parseInt(this.tienda) + Integer.parseInt(this.codArticulo));
		String digControlCalculado = cuenta > 9? "" + cuenta : "0"+ cuenta;
		return digControlCalculado;
		
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Codigo de articulo: " ).append(this.getCodigoCompleto()).append(false);
		sb.append("Descripcion").append(this.descripcion);
		sb.append("Stock").append(this.unidades);
		return sb.toString();
	}
	
}
