package ejerciciosClase.unidad5;

/**
 * Clase que modela un punto en el plano
 * 
 * @author jmerlop327
 */
public class Punto {
	// Atributos
	/**
	 * Coordenada en el eje horizontal
	 */
	private double x;
	/**
	 * Coordenada en el eje vertical
	 */
	private double y;
	/**
	 * Identificador del punto
	 */
	private String nombre;
	/**
	 * Color de representación del punto
	 */
	private String color;

	// Constructores
	public Punto() {
		this.x = 0d;
		this.y = 0d;
		this.nombre = "";
		this.color = "negro";
	}

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
		this.nombre = "";
		this.color = "negro";
	}

	public Punto(double x, double y, String nombre) {
		this.x = x;
		this.y = y;
		this.nombre = nombre;
		this.color = "";
	}

	public Punto(double x, double y, String nombre, String color) {
		this.x = x;
		this.y = y;
		this.nombre = nombre;
		this.color = color;
	}

	// Getters/Setters
	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	// Métodos de clase
	/**
	 * Mueve el punto en el plano el desplazamiento de x e y que se indica por
	 * parámetros
	 * 
	 * @param desplX
	 * @param desplY
	 */
	public void moverPunto(double desplX, double desplY) {
		this.x += desplX;
		this.y += desplY;
	}

	/**
	 * Mueve el punto al eje vertical
	 */
	public void centrarPunto() {
		this.x = 0.0;
	}

	/**
	 * Mueve el punto al eje horizontal
	 */
	public void aplanarPunto() {
		this.y = 0.0;
	}
}
