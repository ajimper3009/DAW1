package ejerciciosClase.unidad5.persona;

public class Persona {
	private static final int IMC_BAJO_PESO = -1;
	private static final int IMC_PESO_IDEAL = 0;
	private static final int IMC_SOBREPESO = 1;
	private static final char SEXO_NO_ESPECIFICADO = 'N';
	private static final char SEXO_HOMBRE = 'H';
	private static final char SEXO_MUJER = 'M';
	// Atributos o campos
	private String nombre;
	private String dni;
	private char sexo;
	private int edad;
	private float peso;
	private int altura;

	// Constructores
	/**
	 * Constructor por defecto
	 */
	public Persona() {
		this.nombre = "";
		this.dni = this.generaDni();
		this.sexo = SEXO_NO_ESPECIFICADO;
		this.edad = 0;
		this.peso = 0f;
		this.altura = 0;
	}
	public Persona (String a, String b, String c) {
		
	}

	/**
	 * Constructor con los parámetros nombre, edad y sexo
	 * 
	 * @param nombre
	 * @param edad
	 * @param sexo
	 */
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.dni = this.generaDni();
		this.sexo = this.compruebaSexo(sexo);
		this.edad = edad;
		this.peso = 0f;
		this.altura = 0;
	}

	/**
	 * Constructor con todos los campos
	 * 
	 * @param nombre
	 * @param edad
	 * @param sexo
	 * @param peso
	 * @param altura
	 */
	public Persona(String nombre, int edad, char sexo, float peso, int altura) {
		this.nombre = nombre;
		this.dni = this.generaDni();
		this.sexo = this.compruebaSexo(sexo);
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}

	// Getters y setters
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
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the peso
	 */
	public float getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(float peso) {
		this.peso = peso;
	}

	/**
	 * @return the altura
	 */
	public float getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	// Métodos de clase
	/**
	 * Genera un número aleatorio de hasta 8 dígitos y le asigna la letra correcta
	 * para que sea un dni válido
	 * 
	 * @return dni
	 */
	private String generaDni() {
		long num = (long) (Math.random() * 100000000) + 1;
		final String DIGITO_CONTROL = "TRWAGMYFPDXBNJZSQVHLCKE";
		char letra = DIGITO_CONTROL.charAt((int) (num % 23));
		String dni = "" + num + letra;
		if (dni.length() < 9) {
			int ceros = 9 - dni.length();
			for (int i = 0; i < ceros; i++) {
				dni = "0" + dni;
			}
		}
		return dni;

	}

	/**
	 * Comprueba si el caracter pasado por parámetro es un caracter válido de sexo:
	 * H, M o N.
	 * En caso contrario, devuelve N
	 * 
	 * @param sexo
	 * @return sex
	 */
	private char compruebaSexo(char sexo) {
		char sex = SEXO_NO_ESPECIFICADO;
		if (sexo == 'H' || sexo == 'h') {
			sex = SEXO_HOMBRE;
		} else if (sexo == 'M' || sexo == 'm') {
			sex = SEXO_MUJER;
		}
		return sex;
	}

	/**
	 * Calcula el IMC. Devuelve:
	 * -1 si es bajo peso
	 * 0 si es peso ideal
	 * 1 si es sobrepeso
	 * devuelve null en caso de que el imc no se pueda calcular
	 * 
	 * @return imc
	 */
	public Integer calcularImc() {
		Integer imc = null;
		try {
			double imcCalculado = this.calcularImcDouble();
			if (imcCalculado < 20) {
				imc = IMC_BAJO_PESO;
			} else if (imcCalculado >= 20 && imcCalculado <= 25) {
				imc = IMC_PESO_IDEAL;
			} else {
				imc = IMC_SOBREPESO;
			}
		} catch (PersonaErrorIMCException e) {
			System.out.println("El IMC no puede calcularse con un peso igual a 0");
		}
		return imc;
	}

	/**
	 * Método que calcula el IMC a partir del peso y la estatura
	 * 
	 * @return imc
	 * @throws PersonaErrorIMCException
	 * @throws ArithmeticException
	 */
	private float calcularImcDouble() throws PersonaErrorIMCException {
		float imc = 0;
		float alturaFloat = this.altura * 1f / 100;
		try {
			if (0 == this.altura) {
				throw new ArithmeticException("La altura no debe ser 0");
			}
			imc = this.peso / (float) Math.pow(alturaFloat, 2);
		} catch (ArithmeticException e) {
			throw new PersonaErrorIMCException("La altura no debe ser 0");
		}
		return imc;
	}

	/**
	 * Devuelve true si la persona es mayor de edad y false en caso conrario
	 * 
	 * @return
	 */
	public boolean esMayorDeEdad() {
		if (this.edad >= 18) {
			return true;
		} else {
			return false;
		}
	}
	// toString equals...

	@Override
	public String toString() {
		return "Persona:\n" + "nombre=" + nombre + ", dni=" + dni + ", sexo=" + sexo + "\n edad=" + edad + ", peso="
		        + peso + ", altura=" + altura + "]";
	}

}
