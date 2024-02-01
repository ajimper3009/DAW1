package desarrolloClases;

public class Punto {

	//Atributos
	
	/**
	 * Coordenanda horizontal
	 */
	private double x;
	
	/**
	 * Coordenanda vertical
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
	
	//Constructores
	
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
		this.nombre = "";
		this.color = "negro";
	}
	public Punto(double x, double y, String nombre, String color) {
		this.x = x;
		this.y = y;
		this.nombre = "";
		this.color = "negro";
	}

	//Getter/Setters
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

	
	//Métodos de clase
	
	public void moverPunto (double desplX, double desplY) {
		this.x += desplX;	
		this.y += desplY;	
	}
	
	/**
	 * Mueve el punto al eje vertical
	 */
	public void aplanarPunto () {
		this.x = 0.0;
	}
	
	/**
	 * Mueve el punto al ejje horizontal
	 */
	public void centrarPunto () {
		this.y = 0.0;
	}
	
}
