package boletines.boletin4;

import boletines.boletin3.FuncionesMatematicas;

public class Ejercicio02 {
//	Ejercicio 2
//	Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
//	y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
//	cuadrado se deben almacenar los cuadrados de los valores que hay en el array
//	numero. En el array cubo se deben almacenar los cubos de los valores que hay en
//	numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
//	columnas.
	public static void main(String[] args) {
		long [] numero = FuncionesMatematicas.getNumerosAleatorios(20, 0l, 100l);
		long [] cuadrado = new long[20];
		long [] cubo = new long[20];
		for (int index=0; index < 20; index++) {
			long numAleatorio = numero[index];
			cuadrado[index] = numAleatorio  * numAleatorio;
			cubo[index] = (int) Math.pow(numAleatorio, 3);
		}
		for (int index=0; index < 20; index++) {
			System.out.printf("%d \t%d \t%d\n",numero[index], cuadrado[index], cubo[index]);
		}
	}

}
