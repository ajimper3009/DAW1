import java.util.Random;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] arrayAaleatorios = Ejercicio05.getNumeroAleatorios(100, 0, 20);
	
		
	}

	private static long[] getNumeroAleatorios(int numeros, long valorInicial, long valorFinal) {
		
		long[] numerosAleatrorios =  new long [numeros];s
		for (int index = 0; index < numeros; index++) {
		long numAleatorio = (long) (Math.random() * (valorInicial - valorInicial + 1) + valorInicial); 
		 arrayNumAleatorios[index] = numAleatorio;
		}
		
		return arrayNumAleatorios;
		
	
		
		
	}

}
