package com.Alejandro.tarea3;

import java.util.Scanner;

	public class Ejercicio6 {
		// TODO Auto-generated method stub

		 static String[][] productos = {
		            {"Coca-Cola", "Sprite", "Fanta naranja"},
		            {"Fanta limón", "Red Bull", "Monster"},
		            {"Pepsi", "Schweppes tónica", "Agua mineral"},
		            {"Cruzcampo", "Heineken", "Zumo de piña"}
		    };

		    static Integer[][] cantidad = {
		            {5, 5, 5},
		            {5, 5, 5},
		            {5, 5, 5},
		            {5, 5, 5}
		    };

		    static int ventasTotales = 0;

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        while (true) {
		            mostrarMenu();
		            int opcion = scanner.nextInt();

		            switch (opcion) {
		                case 1:
		                    pedirBebida(scanner);
		                    break;
		                case 2:
		                    mostrarBebidasDisponibles();
		                    break;
		                case 3:
		                    rellenarBebidas(scanner);
		                    break;
		                case 4:
		                    apagarMaquina();
		                    return;
		                default:
		                    System.out.println("Opción no válida. Introduce un número del 1 al 4.");
		            }
		        }
		    }

		    // Función para mostrar el menú de opciones
		    private static void mostrarMenu() {
		        System.out.println("===== MÁQUINA EXPENDEDORA =====");
		        System.out.println("1. Pedir bebida");
		        System.out.println("2. Mostrar bebidas disponibles");
		        System.out.println("3. Rellenar bebidas (Contraseña requerida)");
		        System.out.println("4. Apagar máquina");
		        System.out.print("Elige una opción: ");
		    }

		    // Función para procesar la opción de pedir bebida
		    private static void pedirBebida(Scanner scanner) {
		        mostrarBebidasDisponibles();
		        System.out.print("Introduce el código de la bebida que deseas: ");
		        int codigo = scanner.nextInt();

		        int fila = (codigo - 1) / cantidad[0].length;
		        int columna = (codigo - 1) % cantidad[0].length;

		        if (fila >= 0 && fila < cantidad.length && columna >= 0 && columna < cantidad[0].length) {
		            if (cantidad[fila][columna] > 0) {
		                System.out.println("Has elegido: " + productos[fila][columna]);
		                cantidad[fila][columna]--;
		                ventasTotales++;
		            } else {
		                System.out.println("No hay más unidades de esta bebida.");
		            }
		        } else {
		            System.out.println("Código de bebida no válido.");
		        }
		    }

		    // Función para mostrar las bebidas disponibles
		    private static void mostrarBebidasDisponibles() {
		        System.out.println("===== Bebidas Disponibles =====");
		        for (int i = 0; i < cantidad.length; i++) {
		            for (int j = 0; j < cantidad[0].length; j++) {
		                int codigo = i * cantidad[0].length + j + 1;
		                if (cantidad[i][j] > 0) {
		                    System.out.println(codigo + ". " + productos[i][j]);
		                }
		            }
		        }
		    }

		    // Función para rellenar bebidas (requiere contraseña)
		    private static void rellenarBebidas(Scanner scanner) {
		        System.out.print("Introduce la contraseña: ");
		        String contraseña = scanner.next();

		        if (contraseña.equals("MaquinaExpendedora2024")) {
		            mostrarBebidasDisponibles();
		            System.out.print("Introduce el código de la bebida que deseas rellenar: ");
		            int codigo = scanner.nextInt();

		            int fila = (codigo - 1) / cantidad[0].length;
		            int columna = (codigo - 1) % cantidad[0].length;

		            if (fila >= 0 && fila < cantidad.length && columna >= 0 && columna < cantidad[0].length) {
		                System.out.print("Introduce la cantidad a rellenar: ");
		                int cantidadRelleno = scanner.nextInt();
		                cantidad[fila][columna] += cantidadRelleno;
		                System.out.println("Bebida rellenada exitosamente.");
		            } else {
		                System.out.println("Código de bebida no válido.");
		            }
		        } else {
		            System.out.println("Contraseña incorrecta. No tienes permisos para rellenar bebidas.");
		        }
		    }

		    // Función para apagar la máquina y mostrar las ventas totales
		    private static void apagarMaquina() {
		        System.out.println("Apagando la máquina...");
		        System.out.println("Ventas totales durante la ejecución: " + ventasTotales);
		
		}
	}



