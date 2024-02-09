package ejerciciosClase.unidad5;

/**
 * Clase que modela un rectángulo representado en el plano
 * 
 * @author jmerlop327
 */
public class Rectangulo {
	// Atributos
	private double alto;
	private double ancho;
	private String color;
	/**
	 * Punto del plano en el que se encuentra el vértice inferior izquierdo
	 */
	private Punto origen;

	// Constructores
	public Rectangulo(double alto, double ancho) throws RectanguloCreationException {
		checkDimension(alto);
		checkDimension(ancho);
		this.alto = alto;
		this.ancho = ancho;
		this.color = "negro";
		this.origen = new Punto();
	}

	public Rectangulo(double alto, double ancho, Punto origen) throws RectanguloCreationException {
		checkDimension(alto);
		checkDimension(ancho);
		this.alto = alto;
		this.ancho = ancho;
		this.color = "negro";
		this.origen = origen;
	}

	public Rectangulo(double alto, double ancho, double x, double y) throws RectanguloCreationException {
		checkDimension(alto);
		checkDimension(ancho);
		this.alto = alto;
		this.ancho = ancho;
		this.color = "negro";
		this.origen = new Punto(x, y);
	}

	public Rectangulo(double alto, double ancho, String color) throws RectanguloCreationException {
		checkDimension(alto);
		checkDimension(ancho);
		this.alto = alto;
		this.ancho = ancho;
		this.color = color;
		this.origen = new Punto();
	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param alto
	 * @param ancho
	 * @param color
	 * @param origen
	 * @throws RectanguloCreationException
	 */
	public Rectangulo(double alto, double ancho, String color, Punto origen) throws RectanguloCreationException {
		checkDimension(alto);
		checkDimension(ancho);
		this.alto = alto;
		this.ancho = ancho;
		this.color = color;
		this.origen = origen;
	}

	// Getters/Setters
	/**
	 * @return the alto
	 */
	public double getAlto() {
		return alto;
	}

	/**
	 * @param alto the alto to set
	 * @throws RectanguloCreationException
	 */
	public void setAlto(double alto) throws RectanguloCreationException {
		checkDimension(alto);
		this.alto = alto;
	}

	/**
	 * @return the ancho
	 */
	public double getAncho() {
		return ancho;
	}

	/**
	 * @param ancho the ancho to set
	 * @throws RectanguloCreationException
	 */
	public void setAncho(double ancho) throws RectanguloCreationException {
		checkDimension(ancho);
		this.ancho = ancho;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the origen
	 */
	public Punto getOrigen() {
		return origen;
	}

	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(Punto origen) {
		this.origen = origen;
	}

	// Métodos de clase
	/**
	 * Comprueba que las dimensiones sean distintas de 0
	 * 
	 * @param dimension
	 * @throws RectanguloCreationException
	 */
	private void checkDimension(double dimension) throws RectanguloCreationException {
		if (dimension == 0) {
			throw new RectanguloCreationException("El ancho y el alto de un rectángulo no pueden ser 0");
		}
	}

	/**
	 * Se le suma el ancho y el alto del rectángulo pasado por parámetros
	 * 
	 * @param rect
	 * @throws RectanguloCreationException
	 */
	public void sumaRectangulo(Rectangulo rect) throws RectanguloCreationException {
		this.alto += rect.getAlto();
		this.ancho += rect.getAncho();
		checkDimension(this.alto);
		checkDimension(this.ancho);
	}

	public double getArea() {
		return this.alto * this.ancho;
	}

	public double getPerimetro() {
		return 2 * this.alto + 2 * this.ancho;
	}

	@Override
	public boolean equals(Object obj) {
		boolean equals = false;
		if (this == obj) {
			equals = true;
		}
		if (obj instanceof Rectangulo) {
			Rectangulo other = (Rectangulo) obj;
			if (this.alto == other.getAlto() && this.ancho == other.getAncho()) {
				equals = true;
			}
		}
		return equals;
	}

	@Override
	public String toString() {
		return "Rectangulo [alto=" + alto + ", ancho=" + ancho + ", color=" + color + ", origen=" + origen + "]";
	}
	
	
	

}