package ejerciciosClase.unidad7.Gesticimal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Almacen {
	private Map<String,Articulo> almacen;
	public Almacen() {
		this.almacen = new HashMap<String,Articulo>();
	}
	
	
	public Set<Articulo> getAlmacen() {
		Set<Articulo> alm = new HashSet<Articulo>();
		alm.addAll(this.almacen.values());
		return alm;
	}
	
	
	public void getListadoArticulos() {
		int index = 1;
		for (Articulo articulo : this.almacen.values()) {
			System.out.println(index++ + ".-" + articulo);
		}
	}


	public void altaArticulo(Articulo articulo) {
		if(!this.almacen.keySet().contains(articulo.getCodigo())) {
			this.almacen.put(articulo.getCodigo(), articulo);
			
		} else {
			Articulo arc = this.almacen.get(articulo.getCodigo());
			arc.setStock(arc.getStock() + articulo.getStock());
		}
		
	}


	public void getArticuloPorCodigo(String codigo) throws ArticuloNotFoundExeption {
		Articulo art = null;
		if (this.almacen.containsKey(codigo)) {
			art = art.getCodigo();
		} else {
			throw new ArticuloNotFoundExeption();
		}
	}
	
	
	
}
