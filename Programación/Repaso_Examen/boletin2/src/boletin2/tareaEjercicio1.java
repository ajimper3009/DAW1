package boletin2;

import java.util.Scanner;

public class tareaEjercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String contrasena = "123Perico@";
		int intentosMaximos = 3;
		
		Scanner scan = new Scanner (System.in);
		
		for (int intentos = 1; intentos <= intentosMaximos ; intentos++) {
			System.out.println("Introduce la contraseña:");
			
			String intento = scan.next();
			
			if (intento.equals(contrasena)) {
				System.out.println("Felicidades has acertado la contraseña");
			break;
			
			}else {
				int intentosRestantes = intentosMaximos - intentos;
				if (intentosRestantes > 0) {
                System.out.println("Contraseña incorrecta, te quedan " + intentosRestantes + " intentos");
				
				} else {
               
					System.out.println("Has fallado el número máximo de intentos, vuelve a intentarlo más tarde");
				}
				
				
			
			}
		
		}
		scan.close();
	}

}
