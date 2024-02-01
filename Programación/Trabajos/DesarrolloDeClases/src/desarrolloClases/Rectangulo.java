package desarrolloClases;

public class Rectangulo {

	//Atributos
	private double alto;
	private double ancho;
	private String color;
	/**
	 * Punto del plano en el que se encuentra el vertice del inferior izquierdo
	 */
	
	private Punto origen;
	//Contructores
	
	public Rectangulo(double alto, double ancho) throws RectanguloCreationExeption {
		if (alto == 0 || ancho == 0) {
			throw new  RectanguloCreationExeption("El alto y el ancho no es 0");
		}
		this.alto = alto;
		this.ancho = ancho;
		this.color = "negro";
		this.origen = new Punto();
	}
	
	public Rectangulo(double alto, double ancho, Punto origen) {
		this.alto = alto;
		this.ancho = ancho;
		this.color = "negro";
		this.origen = origen;
	}
	public Rectangulo(double alto, double ancho, String color) {
		this.alto = alto;
		this.ancho = ancho;
		this.color = "color";
		this.origen = new Punto();
	}
	
	public Rectangulo(double alto, double ancho, String color, Punto origen) {
		this.alto = alto;
		this.ancho = ancho;
		this.color = color;
		this.origen = origen;
	}

	//Getters/Setters
	
	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Punto getOrigen() {
		return origen;
	}

	public void setOrigen(Punto origen) {
		this.origen = origen;
	}
	
	
	
	
	
	//Métodos de clase
	
	
	
}
