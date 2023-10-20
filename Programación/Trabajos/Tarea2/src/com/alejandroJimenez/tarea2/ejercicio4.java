package com.alejandroJimenez.tarea2;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("introduce numeros");
		
		double numero = scan.nextDouble();
		
		double mayor = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;
        double suma = 0;
        int contador = 0;

 
        do {
            System.out.print("Introduce un número (o -1 para terminar): ");
            numero = scan.nextDouble();

            if (numero != -1) {
                mayor = Math.max(mayor, numero);
                menor = Math.min(menor, numero);
                suma += numero;
                contador++;
            }
        } while (numero != -1);

        if (contador > 0) {
            double media = suma / contador;
            System.out.println("El mayor número es: " + mayor);
            System.out.println("El menor número es: " + menor);
            System.out.println("La suma de todos los números es: " + suma);
            System.out.println("La media aritmética de todos los números es: " + media);
        } else {
            System.out.println("No se introdujeron números.");
        }

        scan.close();
		
	}

}
