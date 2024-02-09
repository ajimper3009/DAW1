package examenes.examen3;

import java.util.Scanner;

public class RegistroUsuarios {
	static final int NUM_USUARIOS = 5;
	static String[] USUARIOS = new String[NUM_USUARIOS];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduzca los nombres de los usuarios");
		for (int index = 0; index < USUARIOS.length; index++) {
			boolean valido = false;
			while (!valido) {
				System.out.println("Usuario" + (index + 1));
				System.out.println("Nombre:");
				String nombre = scanner.nextLine();
				String[] nombreSplit = nombre.split(" ");
				System.out.println("DNI:");
				String dni = scanner.nextLine();
				String nombreUser = "";
				String patronNombre = "[A-Za-zÑñÁáÉéÍíÓóÚú]*";
				String patronDni = "\\d{8}[A-Za-z]";
				int errores = 0;
				if (nombreSplit.length >= 3 && dni.matches(patronDni)) {
					for (String nombreParcial : nombreSplit) {
						if (!nombreParcial.matches(patronNombre)) {
							errores++;
						}
					}
					if (errores == 0) {
						valido = true;
						nombreUser = obtenerLetras(nombreSplit[0]) + obtenerLetras(nombreSplit[1])
						        + obtenerLetras(nombreSplit[2]) + dni.substring(5, 8);
						USUARIOS[index] = nombre + " - " + nombreUser;
					}
				}
				if (!valido) {
					System.out.println("Error en la introducción de datos. Por favor repita el registro");
				}
			}
		}
		scanner.close();
		mostrarUsuarios();
	}

	private static void mostrarUsuarios() {
		System.out.println("Los usuarios generados son:");
		for (String usuario : USUARIOS) {
			System.out.println(usuario);
		}
		System.out.println("FIN DEL PROGRAMA");

	}

	private static String obtenerLetras(String nombreParcial) {
		String result = "";
		result = nombreParcial.toUpperCase().substring(0, 2);
		/*
		 * result = result.replace("Á", "A");
		 * result = result.replace("É", "E");
		 * ..............................................
		 * result = result.replace("Ñ", "N");
		 */
		char[] prohibidosChar = "ÁÉÍÓÚÜÑ".toCharArray();
		String[] proh = new String[prohibidosChar.length];
		int i = 0;
		for (char c : prohibidosChar) {
			proh[i++] = "" + c;
		}
		char[] permitidosChar = "AEIOUUN".toCharArray();
		String[] perm = new String[permitidosChar.length];
		i = 0;
		for (char c : permitidosChar) {
			perm[i++] = "" + c;
		}
		/*result = StringUtils.replaceEach(result, proh, perm);*/

		return result;
	}

}
