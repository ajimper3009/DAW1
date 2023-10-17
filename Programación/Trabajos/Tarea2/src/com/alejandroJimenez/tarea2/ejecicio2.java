package com.alejandroJimenez.tarea2;

import java.util.Random;
import java.util.Scanner;

public class ejecicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int maxIntentos = 5;
	int numAleatorio = new Random().nextInt(100) + 1;
	Scanner scan = new Scanner (System.in);
	
	for (int contador = 1; contador <= maxIntentos; contador++) {
	
		System.out.println("Introduce un número del 1 al 100");
		int numero = scan.nextInt();
		
		if (numero == numAleatorio) {
				System.out.println("Has adivinado el número");
				
		}else if (numero < numAleatorio) {
			System.out.println("El número es mayor, te quedan " + (maxIntentos - contador) + " oportunidades");
		}
		else {
			System.out.println("El número es menor, te quedan " + (maxIntentos - contador) + " oportunidades");	
		}
	}
	 
	scan.close();
	
		}
			
	}


//Realizar un conteo de numeros introducidos 