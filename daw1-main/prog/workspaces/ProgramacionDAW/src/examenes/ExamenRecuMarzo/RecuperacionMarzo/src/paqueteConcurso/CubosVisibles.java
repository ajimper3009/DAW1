package examenes.ExamenRecuMarzo.RecuperacionMarzo.src.paqueteConcurso;

public class CubosVisibles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args[0].length() > 6) {
			
		}
		int casos = Integer.parseInt(args[0]);
		System.out.println(casos);
		if (casos == args.length - 1) {
			for (int index = 1; index < args.length; index++) {
				//Calculamos la solucion
				int entrada = Integer.parseInt(args[index]);
				int cuadrosPorCaras = entrada * entrada;
				
				//Esquina: 4
				
				//Centrales: entrada - 2 * (entrada - 2)
				
				//Bordes laterales: 
				
			}
		}
	}

}
