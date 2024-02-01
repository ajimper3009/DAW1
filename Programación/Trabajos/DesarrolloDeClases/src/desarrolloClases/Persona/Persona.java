package desarrolloClases.Persona;

import java.util.Random;
import java.util.Scanner;

public class Persona {

	public String nombre;
	public int edad;
	private static String DNI;
	private char sexo;
	public double peso;
	public double altura;
	
	public Persona(String nombre, int edad, double peso, double altura, String DNI, char sexo ) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = this.generaDNI(DNI);
		this.sexo = compruebaSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}
	
	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	

	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	private String generaDNI(String DNI) {
		
		int numeroAleatorio = new Random().nextInt(90000000) + 10000000;
		
		char letraAleatoria = (char) ('A' + new Random().nextInt(26));
		
		return String.format("%d%c", numeroAleatorio, letraAleatoria);
	}

	private char compruebaSexo(char sexo) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu Sexo");
		sexo = scan.next().charAt(1);
		char hombre = 'H';
		char mujer = 'M';
		char noDefinido = 'N';
		if (sexo == hombre) {
			
		}else if (sexo == mujer) {
			
		}else
			System.out.println("Genero no definido (N)");
		
		return sexo;
	}

	
	


		
	
}
	
