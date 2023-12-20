package boletinArrays;

public class Baraja {

		// TODO Auto-generated method stub

		private String tipo;
		private Carta[] baraja;
		final String[] palosEspaniola = {"oros", "copas", "espadas", "bastos"};
		final String[] palosFrancesa = {"corazones", "picas", "diamantes", "tréboles"};
		final String[] numerosEspaniola = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
		final String[] numerosFrancesa = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
		
		public Baraja(String tipo) {
			this.tipo = tipo;
			if(tipo.equalsIgnoreCase("española")) {
				this.baraja = new Carta[48];
				int index = 0;
				for (String palo : this.palosEspaniola) {
					for (int num = 1; num <= 12; num++) {
						Carta c = new Carta(palo, "" + num);
						this.baraja[index++]= c;
					}
				}
			} if(tipo.equalsIgnoreCase("francesa")) {
				this.baraja = new Carta[52];
				int index = 0;
				for (String palo : this.palosFrancesa) {
					for (int indexNum = 0; indexNum < this.numerosFrancesa.length; indexNum++) {
						Carta c = new Carta(palo, this.numerosFrancesa[indexNum]);
						this.baraja[index++]= c;
					}
				}
			}
		}
		/**
		 * @return the tipo
		 */
		public String getTipo() {
			return tipo;
		}
		/**
		 * @param tipo the tipo to set
		 */
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		/**
		 * @return the baraja
		 */
		public Carta[] getBaraja() {
			return baraja;
		}
		/**
		 * @param baraja the baraja to set
		 */
		public void setBaraja(Carta[] baraja) {
			this.baraja = baraja;
		}
		
		public String toString() {
			String s = "Tipo de baraja: " + tipo + "\n";
			int index = 0;
			for (Carta carta : this.baraja) {
				if (index++ == 5) {
					s += "\n";
					index = 1;
				}
				s += "\t" + carta;
			}
			return s;
		}
			
		public Baraja[] repartoMentiroso(int numeroJugadores) {
			 Baraja[] manos = new Baraja[numeroJugadores];
			
			 //Repartiremos las cartas a partes iguales entre las Barajas del array
			 
			int cartasReparto = 0;
			if (this.baraja.length % numeroJugadores == 0) {
				cartasReparto = this.baraja.length / numeroJugadores;
			}else {
				cartasReparto = this.baraja.length / numeroJugadores + 1;
			}
			for (Carta carta : this.baraja) {
				int aux = cartasReparto;
				for (int i = 1; i <= numeroJugadores; i++) {
					
			}
				
			}
			 
			return manos;
			
		}
		
		
		
		
}
