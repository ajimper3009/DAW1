package desarrolloClases;

import java.util.Scanner;

public class testEquipos {
	

	
	static byte NUM_EQUIPOS=20;
	static Equipo[] equipos = new Equipo[NUM_EQUIPOS];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Equipo eq = new Equipo();
		try {
			eq.setCategoria('A');
		} catch (WrongCategoriaEquipoExpeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void mostrarEquipo() {
		for (Equipo equipo : equipos) {
			System.out.println(equipo);
		}
		
	}
	
	public static void agregarEquipo(Equipo equipo) {
		equipos[Equipo.numeroEquipo] = equipo;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el nombre del equipo");
		String nombreEquipo = scan.next();
		}
	
	public static void eliminarEquipos() {
		System.out.println("¿Qué equipo deseas borrar?");
		
	}

	}
