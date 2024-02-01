package com.Alejandro.tarea3;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena = "Hola me llamo Alejandro Jimenez y estoy haciendo la tarea 4 de programacion";

        StringBuilder vocales = new StringBuilder();
        StringBuilder consonantes = new StringBuilder();

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            if (esVocal(caracter)) {
                vocales.append(caracter);
            } else if (Character.isLetter(caracter)) {
                consonantes.append(caracter);
            }
        }

        System.out.println("Vocales: " + vocales.toString());
        System.out.println("Consonantes: " + consonantes.toString());
    }

    private static boolean esVocal(char letra) {
        char letraMin = Character.toLowerCase(letra);
        return letraMin == 'a' || letraMin == 'e' || letraMin == 'i' || letraMin == 'o' || letraMin == 'u';
		
		
	}

}
