package ejerciciosClase.unidad6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Ejercicio4 {

	static Scanner scan = new Scanner(System.in);
	static Map<String, String> usuarios = new HashMap<String, String>();
	
	public static void main(String[] args) {
		insertarIdentificadorYContraseña();
		insertarIdentificadorYContraseña();
		mostrarIdPassword();
		
		 
		
		
	}
	
	public static void insertarIdentificadorYContraseña () {
		String id = scan.nextLine();
		String password = scan.nextLine();
		usuarios.put(id, password);
	
	}
	
	public static void mostrarIdPassword() {
		
		for (Entry<String, String> par : usuarios.entrySet()) {
			System.out.println(par.getKey() + " - " + usuarios.get(par.getValue()));
			
			
		}
		
		/*
		for (String identificador : usuarios.keySet()) {
			System.out.println(identificador + " - " + usuarios.get(identificador));
		}
		*/
	}

}
