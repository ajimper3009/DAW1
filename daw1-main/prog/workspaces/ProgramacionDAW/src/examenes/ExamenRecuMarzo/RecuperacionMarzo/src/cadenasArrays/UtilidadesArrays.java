package cadenasArrays;

public class UtilidadesArrays {

	public static void main(String[] args) {
		
		int alto = 5;
		int ancho = 5;
		int [] [] foto = crearFotoAleatorio (alto,ancho);
		mostrarFoto(foto);
		int [] [] fotoContrastada = contraste(foto, 10);
		
		

		
		
		
		
		
	}

	private static int[][] contraste(int[][] foto, int contraste) {
		final int alto = foto.length;
		final int ancho = foto[0].length;
		int [] [] fotoContrastada = new int [alto] [ancho];
		for (int i = 0; i < fotoContrastada.length; i++) {
			for (int j = 0; j < fotoContrastada[0].length; j++) {
				if (foto [i] [j] > 0 && foto [i] [j] < 128 - contraste) {
					fotoContrastada [i] [j] = foto [i] [j] + contraste;
					
				} else if (foto [i] [j] > 128 - contraste) {
					fotoContrastada [i] [j] = 128;
				} else if (foto [i] [j] < -127 + contraste) {
					fotoContrastada [i] [j] = -127;
				} else {
					fotoContrastada [i] [j] = fotoContrastada [i] [j] - contraste;
				}
			}
		}
		
		return fotoContrastada;
	}

	/**
	 * @param foto
	 */
	private static void mostrarFoto(int[][] foto) {
		for (int i = 0; i < foto.length; i++) {
			for (int j = 0; j < foto[0].length; j++) {
				System.out.print(foto[i][j] + "\t");
			}
			System.out.println("\n\n");
		}
	}

	private static int[][] crearFotoAleatorio(int ancho, int alto) {
		int [] [] foto = new int [ancho] [alto];
		for (int i = 0; i < foto.length; i++) {
			for (int j = 0; j < foto[0].length; j++) {
				foto[i] [j] = CalcularNumeroAleatorio(-127, 128);
				
			}
			
		}
		
		return foto;
	}

	private static int CalcularNumeroAleatorio(int limiteInf, int limiteSup) {
		int aleatorio = (int) (Math.random()* limiteSup - limiteInf + 1) - limiteInf;
		
		return (int) (Math.random()* limiteSup - limiteInf + 1) + limiteInf;
	}

	private static int[][] suavizar (int [] [] foto) {
		final int alto = foto.length;
		final int ancho = foto[0].length;
		int [] [] fotoSuav = new int [alto] [ancho];
		//ponemos los bordes a negro(-127)
		
		for (int i = 0; i < ancho; i++) {
			fotoSuav[0][i] = -127;
			fotoSuav[ancho - 1][i] = -127;
		}
		
		for (int i = 0; i < alto; i++) {
			fotoSuav[i][0] = -127;
			fotoSuav[i][alto - 1] = -127;
		}
		
		for (int i = 1; i < alto - 1; i++) {
			for (int j = 1; j < ancho - 1; j++) {
				int suma = 0;
				for (int x = 1; i <= alto - 1; i++) {
					for (int y = 1; j <= ancho - 1; j++) {
						suma += foto [x] [y];
					}
				}
				fotoSuav [i] [j] = (int) Math.round(suma / 9.0);
			}
		}
		
		return fotoSuav;
	}

}
	
	
	

