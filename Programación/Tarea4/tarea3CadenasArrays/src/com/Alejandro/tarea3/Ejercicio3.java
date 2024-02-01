package com.Alejandro.tarea3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	String [] platos = {
            "1.- Risotto con setas y parmesano",
            "2.- Pollo al curry con arroz basmati",
            "3.- Pescado en salsa de limón y alcaparras",
            "4.- Ensalada de quinoa con aguacate y aderezo cítrico",
            "5.- Ternera estofada con patatas y zanahorias",
            "6.- Sushi de salmón y aguacate fresco",
            "7.- Pizza con mozzarella y albahaca",
            "8.- Lasaña de carne con ricotta y espinacas",
            "9.- Tarta de chocolate con ganache y frambuesas",
            "10.- Tacos de carnitas con salsa de mango"
        };
	
	
	Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    while (true) {
        System.out.println("1.- Jugar");
        System.out.println("2.- Finalizar el juego");

        int opcion = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer

        switch (opcion) {
            case 1:
                jugar(platos[random.nextInt(platos.length)], scanner, random);
                break;
            case 2:
                System.out.println("¡Gracias por jugar! Hasta luego.");
                System.exit(0);
            default:
                System.out.println("Opción no válida. Por favor, elige de nuevo.");
        }
    }
}

private static void jugar(String frase, Scanner scanner, Random random) {
    char[] fraseActual = new char[frase.length()];
    for (int i = 0; i < frase.length(); i++) {
        if (frase.charAt(i) == ' ') {
            fraseActual[i] = ' ';
        } else {
            fraseActual[i] = '_';
        }
    }

    while (true) {
        System.out.println(new String(fraseActual));
        System.out.println("C.- Comprar letra");
        System.out.println("R.- Resolver frase");
        System.out.println("S.- Salir");

        char opcion = scanner.next().charAt(0);
        scanner.nextLine();  // Limpiar el buffer

        switch (opcion) {
            case 'C':
                comprarLetra(frase, fraseActual, scanner);
                break;
            case 'R':
                resolverFrase(frase, scanner);
                break;
            case 'S':
                return;
            default:
                System.out.println("Opción no válida. Por favor, elige de nuevo.");
        }
    }
}

private static void comprarLetra(String frase, char[] fraseActual, Scanner scanner) {
    System.out.print("Introduce una letra: ");
    char letra = scanner.next().charAt(0);
    boolean letraAparece = false;

    for (int i = 0; i < frase.length(); i++) {
        if (Character.toLowerCase(frase.charAt(i)) == Character.toLowerCase(letra)) {
            letraAparece = true;
            fraseActual[i] = frase.charAt(i);
        }
    }

    if (letraAparece) {
        System.out.println("¡Bien hecho! La letra aparece en la frase.");
    } else {
        System.out.println("Oops, la letra no está en la frase.");
    }

    if (fraseCompleta(fraseActual)) {
        System.out.println("¡Felicidades! Has completado la frase: " + frase);
        System.out.println("Volviendo al menú principal.");
        return;
    }
}

private static void resolverFrase(String frase, Scanner scanner) {
    System.out.print("Intenta resolver la frase: ");
    String intento = scanner.nextLine();

    if (frase.toLowerCase().equals(intento.toLowerCase())) {
        System.out.println("¡Enhorabuena! Has acertado la frase: " + frase);
    } else {
        System.out.println("Oh no, la frase no es correcta. La frase correcta era: " + frase);
    }

    System.out.println("Volviendo al menú principal.");
}

private static boolean fraseCompleta(char[] fraseActual) {
    for (char c : fraseActual) {
        if (c == '_') {
            return false;
        }
    }
    return true;
		
		
	}
	
		
}


