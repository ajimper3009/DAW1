package ejerciciosClase.unidad5.tienda;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class ArticuloDeportivoZapateria extends ArticuloDeportivo {

	private int numero;
	private String horma;
	private static final String[] HORMAS = {"ANCHA","REGULAR","ESTRECHA"};
	
	public ArticuloDeportivoZapateria() {
		super();
		this.numero = 0;
		this.horma = "";
	}
	
	public ArticuloDeportivoZapateria(String descripcion, String codigoCompleto, int unidades, String talla, int numero, String horma) throws TiendaDeportesException {
		super(descripcion, codigoCompleto, unidades);
		
		this.numero = comprobarNumero();
		this.horma = comprobarHorma(horma);
	}

	private int comprobarNumero() throws TiendaDeportesException {
		if (numero >= 27 && numero <= 46) {
			return numero;
		}
		throw new TiendaDeportesException("El numero del articulo de zapateria no es valido");
		
	}

	private String comprobarHorma(String horma) throws TiendaDeportesException {
		if (StringUtils.isNotBlank(horma) && ArrayUtils.contains(HORMAS, horma.toUpperCase())) {
			
			return horma;
			
		}
		throw new TiendaDeportesException("La horma indicada no es correcta");
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Titulo textil \n");
		sb.append(super.toString());
		sb.append("Numero: ").append(this.numero);
		sb.append("horma: ").append(this.horma);
		return sb.toString();
	}
	
}
