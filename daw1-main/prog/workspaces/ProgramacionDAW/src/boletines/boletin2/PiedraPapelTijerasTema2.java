package boletines.boletin2;

import java.util.Scanner;

public class PiedraPapelTijerasTema2 {

	public static void main(String[] args) {
		final String PIEDRA = "PIEDRA"; //0
		final String PAPEL = "PAPEL"; //1
		final String TIJERAS = "TIJERAS";//2
		String msg = "";

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu nombre:");
		String nombre = scan.nextLine();
		System.out.println("Hola " + nombre + "! Elige piedra, papel o tijeras");
		String player = scan.nextLine();
		if (player.equalsIgnoreCase(PIEDRA) | player.equalsIgnoreCase(PAPEL) | player.equalsIgnoreCase(TIJERAS)) {
			int computer = (int) (Math.random() * 3);
			String computerString = "";
			switch (computer) {
			case 0:
				computerString = PIEDRA;
				if (player.equalsIgnoreCase(PAPEL)) {
					msg = "Ganaste! ";
				} else if (player.equalsIgnoreCase(PIEDRA)) {
					msg = "Empate! ";
				} else {
					msg = "Perdiste! ";
				}
				break;
			case 1:
				computerString = PAPEL;
				if (player.equalsIgnoreCase(PAPEL)) {
					msg = "Empate! ";
				} else if (player.equalsIgnoreCase(PIEDRA)) {
					msg = "Perdiste! ";
				} else {
					msg = "Ganaste! ";
				}
				break;
			case 2:
				computerString = TIJERAS;
				if (player.equalsIgnoreCase(PAPEL)) {
					msg = "Perdiste! ";
				} else if (player.equalsIgnoreCase(PIEDRA)) {
					msg = "Ganaste! ";
				} else {
					msg = "Empate! ";
				}
				break;
			default:
				break;
			}
			final String msgComputerChoice = "La computadora elije: " + computerString.toLowerCase() + "\n";
			msg = msgComputerChoice + msg;
		} else {
			msg = "ERROR! debes escoger entre piedra, papel o tijeras";
		}

		System.out.println(msg);
		scan.close();

	}

}
