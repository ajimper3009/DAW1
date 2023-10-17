package com.alejandroJimenez.tarea2;

import java.util.Scanner;

public class ejecicio1 {

	public static void main(String[] args) {


	String contrasena = "contraseñaAlejandro6";
	
	int maxIntentos = 3;
		
	Scanner scanner = new Scanner(System.in);
	 for (int intentos = 1; intentos <= maxIntentos; intentos++) {
         System.out.print("Introduce la contraseña: ");
         String intento = scanner.nextLine();
         
         if (intento.equals(contrasena)) {
             System.out.println("¡Contraseña correcta!");
             break;
         } else {
             int intentosRestantes = maxIntentos - intentos;
             if (intentosRestantes > 0) {
                 System.out.println("Contraseña incorrecta, te quedan " + intentosRestantes + " intentos");
             } else {
                 System.out.println("Has fallado el número máximo de intentos");
             }
         }
     }
     
     scanner.close();
		
	}

}


//hacerlo con un do-while