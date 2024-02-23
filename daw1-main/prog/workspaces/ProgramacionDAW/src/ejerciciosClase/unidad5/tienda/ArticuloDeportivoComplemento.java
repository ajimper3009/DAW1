package ejerciciosClase.unidad5.tienda;

import org.apache.commons.lang3.StringUtils;

public class ArticuloDeportivoComplemento extends ArticuloDeportivo {

	private String tipoComplemento;
	public ArticuloDeportivoComplemento() {
		super();
		this.tipoComplemento = "";
	}
	
	public ArticuloDeportivoComplemento(String descripcion, String codigoCompleto, int unidades, String tipoComplemento)
	        throws TiendaDeportesException {
		super(descripcion, codigoCompleto, unidades);
		this.tipoComplemento = comprobarTipoComplemento(tipoComplemento);
	}

	private String comprobarTipoComplemento(String tipoComplemento) throws TiendaDeportesException {
		if (StringUtils.isBlank(tipoComplemento) || !tipoComplemento.toUpperCase().matches("[A-ZÑÁÉÍÓÚÜ]*")) {
			throw new TiendaDeportesException("El tipo de complemento del artículo no es válido");
		}
		return tipoComplemento;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Artículo Complemento \n");
		sb.append(super.toString());
		sb.append("Tipo de complemento: ").append(this.tipoComplemento);
		return sb.toString();
	}
	
}
