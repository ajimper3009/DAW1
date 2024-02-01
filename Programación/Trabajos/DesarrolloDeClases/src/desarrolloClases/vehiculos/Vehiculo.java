package desarrolloClases.vehiculos;

public abstract class Vehiculo {
	
		private static int vehiculosCreados = 0;
		public static double kilometrosTotales = 0d;
		private double kilometrosRecorridos;
		
		/**
		 * Contructro sin parametros
		 */
		public Vehiculo() {
			this.kilometrosRecorridos = 0d;
			vehiculosCreados++;
		}
		
		
		
		/**
		 * @return the kilometrosRecorridos
		 */
		//Getters and Setters
		public double getKilometrosRecorridos() {
			return kilometrosRecorridos;
		}
		/**
		 * @param kilometrosRecorridos the kilometrosRecorridos to set
		 */
		public void setKilometrosRecorridos(double kilometrosRecorridos) {
			this.kilometrosRecorridos = kilometrosRecorridos;
		}
		
		public void andar(double distanciaRecorrida) {
			this.kilometrosRecorridos += distanciaRecorrida;
			kilometrosTotales += distanciaRecorrida;
		}
		public double verKilometraje() {
			return kilometrosTotales;
		}
	
	
}


