package examenes.examen1;

public class Ej2 {

	public static void main(String[] args) {
		int contImpares = 4;
		for (int i = 100; i >= 0; i--) {
			if (contImpares == 4) {				
				System.out.println(i);
				contImpares = 0;
			} else if (i % 2 != 0 && contImpares < 4){
				System.out.println(i);
				contImpares++;
			}
		}

	}

}
