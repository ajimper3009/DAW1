package ejerciciosClase.unidad5;

import java.util.Random;

public class Baraja {
	private String tipo;
	private Carta[] cartas;
	final String[] palosEspaniola = { "oros", "copas", "espadas", "bastos" };
	final String[] palosFrancesa = { "corazones", "picas", "diamantes", "tréboles" };
	final String[] numerosEspaniola = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
	final String[] numerosFrancesa = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };

	public Baraja(String tipo) {
		this.tipo = tipo;
		if (tipo.equalsIgnoreCase("española")) {
			this.cartas = new Carta[48];
			int index = 0;
			for (String palo : this.palosEspaniola) {
				for (int num = 1; num <= 12; num++) {
					Carta c = new Carta(palo, "" + num);
					this.cartas[index++] = c;
				}
			}
		}
		if (tipo.equalsIgnoreCase("francesa")) {
			this.cartas = new Carta[52];
			int index = 0;
			for (String palo : this.palosFrancesa) {
				for (int indexNum = 0; indexNum < this.numerosFrancesa.length; indexNum++) {
					Carta c = new Carta(palo, this.numerosFrancesa[indexNum]);
					this.cartas[index++] = c;
				}
			}
		}
	}

	public Baraja(Baraja baraja, int num) {
		this.tipo = baraja.getTipo();
		this.cartas = new Carta[num];
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		String s = "Tipo de cartas: " + this.tipo + "\n";
		int index = 0;
		for (Carta carta : this.cartas) {
			if (index == 5) {
				s += "\n";
				index = 0;
			}
			s += "\t" + carta;
			index++;
		}
		return s;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @return the cartas
	 */
	public Carta[] getCartas() {
		return cartas;
	}

	// Implementación del algoritmo de Fisher-Yates Shuffle
	public void mezclar() {
		Random rand = new Random();
		Carta[] array = this.cartas;
		for (int i = array.length - 1; i > 0; i--) {
			int j = rand.nextInt(i + 1);

			// Intercambiar array[i] y array[j]
			Carta temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}

	public Baraja[] repartoMentiroso(int numJugadores) {
		Baraja[] manos = new Baraja[numJugadores];
		// repartir las cartas a partes iguales entre las Barajas del array
		int cartasReparto = 0;
		if (this.cartas.length % numJugadores == 0) {
			cartasReparto = this.cartas.length / numJugadores;
		} else {
			cartasReparto = this.cartas.length / numJugadores + 1;
		}

		for (int i = 0; i < numJugadores; i++) {
			manos[i]=new Baraja(this, cartasReparto);
		}
		
		int indexMano = 0;
		int jugador = 0;
		for (int indexCarta = 0; indexCarta < this.cartas.length; indexCarta++) {
				manos[jugador++].getCartas()[indexMano] = this.cartas[indexCarta];
				if (jugador == numJugadores) {
					jugador = 0;
					indexMano++;
				}
		}

		return manos;
	}

}
