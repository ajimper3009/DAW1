package boletines.boletin3;

public class Ejercicio07 {

	public static void main(String[] args) {
		System.out.println("Probamos la función esPrimo:");
		Long test1 = 1L;
		Long test2 = 17L;
		Long test3 = 0L;
		Long test4 = -200L;
		Long test5 = 37L;
		Long test6 = -1L;
		char test7 = 'C';
		FuncionesMatematicas.esPrimo(test1);
		System.out.println(test1 + ": " + FuncionesMatematicas.esPrimo(test1));
		System.out.println(test2 + ": " + FuncionesMatematicas.esPrimo(test2));
		System.out.println(test3 + ": " + FuncionesMatematicas.esPrimo(test3));
		System.out.println(test4 + ": " + FuncionesMatematicas.esPrimo(test4));
		System.out.println(test5 + ": " + FuncionesMatematicas.esPrimo(test5));
		System.out.println(test6 + ": " + FuncionesMatematicas.esPrimo(test6));
		System.out.println(test7 + ": " + FuncionesMatematicas.esPrimo(test7));
		System.out.println("-----------------------------------");
		System.out.println("Probamos la función siguientePrimo:");
		System.out.println(test1 + ": " + FuncionesMatematicas.siguientePrimo(test1));
		System.out.println(test2 + ": " + FuncionesMatematicas.siguientePrimo(test2));
		System.out.println(test3 + ": " + FuncionesMatematicas.siguientePrimo(test3));
		System.out.println(test4 + ": " + FuncionesMatematicas.siguientePrimo(test4));
		System.out.println(test5 + ": " + FuncionesMatematicas.siguientePrimo(test5));
		System.out.println(test6 + ": " + FuncionesMatematicas.siguientePrimo(test6));
		System.out.println(test7 + ": " + FuncionesMatematicas.siguientePrimo(test7));
		System.out.println("-----------------------------------");
//		long sigPrimo = FuncionesMatematicas.siguientePrimo(inicioPrimo);
//		System.out.println("sigPrimo:" + sigPrimo);
//		System.out.println("inicioPrimo:" + inicioPrimo);
		
		System.out.println("digitos: " + FuncionesMatematicas.digitos(-11l));
		System.out.println("voltea: "+ FuncionesMatematicas.voltea(0000001l));
		System.out.println("esCapicua2: "+ FuncionesMatematicas.esCapicua(1010l));
		System.out.println("esCapicua2: "+ FuncionesMatematicas.esCapicua(123l));
		System.out.println("esCapicua2: "+ FuncionesMatematicas.esCapicua(2313123l));
		System.out.println("esCapicua2: "+ FuncionesMatematicas.esCapicua(24455676554422l));
		System.out.println("esCapicua2: "+ FuncionesMatematicas.esCapicua(1011l));
		System.out.println("esCapicua2: "+ FuncionesMatematicas.esCapicua(88888l));
		System.out.println("voltear2: "+ FuncionesMatematicas.voltea(12300l));
		//System.out.println("voltear2: "+ FuncionesMatematicas.voltear2(34258l));
		try {
			System.out.println("posicionDeDigito: "+ FuncionesMatematicas.posicionDeDigito(1465697l, 7));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
