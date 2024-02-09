package examenes.examenRecupTrim1;

public class Ej3 {

	public static void main(String[] args) {
		String numero = "";
		String palo = "";
		String result = "";
		int numCarta = 1;
		while (numCarta <= 3) {
			int numeroInt = (int) (Math.random() * 13) + 1;
			switch (numeroInt) {
			case 1:
				numero = "A";
				break;
			case 11:
				numero = "J";
				break;
			case 12:
				numero = "Q";
				break;
			case 13:
				numero = "K";
				break;
			default:
				numero = "" + numeroInt;
				break;
			}
			int paloInt = (int) (Math.random() * 3);
			switch (paloInt) {
			case 1:
				palo = "corazones";
				break;
			case 2:
				palo = "picas";
				break;
			case 3:
				palo = "diamantes";
				break;
			default:
				palo = "tréboles";
				break;
			}
			
			final String carta = numero + " de " + palo;
			if (!result.contains(carta)) {
				if (numCarta==1) {
					result = carta + ", ";
				} else if (numCarta==2) {
					result += carta + " y ";
				} else {
					result += carta + ".";
				}
				numCarta++;
			}
		}
		System.out.println(result);
	}

}
