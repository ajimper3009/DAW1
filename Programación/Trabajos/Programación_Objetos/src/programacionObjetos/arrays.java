package programacionObjetos;

public class arrays {

	public static void main(String[] args) {
		//Introduccion manejo de arrays 
		
		//Inicialización d una array con datos
		int[] arrayDatos = {1,7,23,-100};
		
		//Inicializar un array vacio
		int[] arrayVacio = new int[4];
		arrayVacio[0] = 1;
		arrayVacio[1] = 7;
		arrayVacio[2] = 23;
		arrayVacio[3] = -100;
		System.out.println("La primera posicion del array inicializado con datos es:  " + arrayDatos[0]);
		System.out.println("El array inicializado vacio tiene: " + arrayVacio.length);
		
		//Recorriendo el array con un for
		System.out.println("Los elementos del array son (Con for tradicional):");
		for (int index = 0; index < arrayVacio.length; index++) {
			System.out.println(arrayVacio[index]);	
		}
		
		//Recorriendo el array con un un for extendido o foreach
		System.out.println("Los elementos del array son (Con foreach):");
		for (int i : arrayDatos) {
			System.out.println(i);
		}
		
		//Array con 5 caracteres
		char[] arrayChar = {'a','e','i','o','u'};
		
		//REcorremos la array con for tradicional
		System.out.println("Los elementos del array son (Con for tradicional):");
		for (int index = 0; index < arrayChar.length; index++) {
			System.out.println(arrayChar[index]);
		}
		
		//Recorriendo el array con un un for extendido o foreach
				System.out.println("Los elementos del array son (Con foreach):");
				for (char e : arrayChar ) {
					System.out.println(e);
			}
		
		//Sumamos el primer dato y el segundo de arrayDatos		
		System.out.println("La suma del primer elemento y el cuearto es: " + (arrayDatos[0] + arrayDatos[2]));
		
		//array de String vacia
		String[] arrayString = new String [4];
		arrayString[1] = "HOLA";				
		int indice = 0;
		for (String string : arrayString) {
		System.out.println("La cadena en la posición %d es --%s--\n", indice++, string);
		}
			
		
		//Declarar los siguientes array inicializados
		//con los valores mostrados. Luego muestralos y
		//Mostrar todos sus elementos ¿Que pasa con los elementos vacios?
		//Integer --> [1,10,99, , ,7]
		//Caracter --> ['i','0', ,'A']
		
		
		int[] arrayNumeros = new int[6];
		arrayNumeros[0] = 1;
		arrayNumeros[1] = 10;
		arrayNumeros[2] = 99;
		arrayNumeros[5] = 7;
		
		System.out.println("Arrays de numeros enteros");
		for (int i : arrayNumeros) {
			System.out.println(i);
		}
		
		char[] arrayLetras = new char[4];
		arrayLetras[0] = 'i';
		arrayLetras[1] = '0';
		arrayLetras[2] = 'A';
		System.out.println("Mostramos la array de caracteres");
		for (char a : arrayLetras) {
			System.out.println(a);
		}
		
		//
		
	}

}
