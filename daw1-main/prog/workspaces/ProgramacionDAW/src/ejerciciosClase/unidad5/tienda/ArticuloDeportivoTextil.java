package ejerciciosClase.unidad5.tienda;

import org.apache.commons.lang3.ArrayUtils;

public class ArticuloDeportivoTextil extends ArticuloDeportivo {

	private String talla;
	private static final String[] TALLAS = {"S","M","L","XL"};
	
	public ArticuloDeportivoTextil() {
		super();
		talla = "";
	}
	
	public ArticuloDeportivoTextil(String descripcion, String codigoCompleto, int unidades, String talla) throws TiendaDeportesException {
		super(descripcion, codigoCompleto, unidades);
		this.talla = comprobarTalla(talla);
		
	}

	private String comprobarTalla(String talla) throws TiendaDeportesException {
		if (null != talla && ArrayUtils.contains(TALLAS, talla.toUpperCase())) {
			return talla;
			
		}
		throw new TiendaDeportesException("La talla no es valida");
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Titulo textil \n");
		sb.append(super.toString());
		sb.append("Talla: ").append(this.talla);
		return sb.toString();
	}
	
}
