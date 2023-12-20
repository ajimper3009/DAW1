package Examen;

import examen2.util.UtilidadesExamen;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = (int) (Math.random()* 49);
		int numero2 = (int) (Math.random()* 49);
		int numero3 = (int) (Math.random()* 49);
		int numero4 = (int) (Math.random()* 49);
		int numero5 = (int) (Math.random()* 49);
		int numero6 = (int) (Math.random()* 49);
		int complementario = (int) (Math.random()* 49);
		int reintegro = (int) (Math.random()* 9);
		
		
		System.out.println("Primer número: " + UtilidadesExamen.sacaBola(numero));
		System.out.println("Segundo número: " + UtilidadesExamen.sacaBola(numero2));
		System.out.println("Tercer número: " + UtilidadesExamen.sacaBola(numero3));
		System.out.println("Cuarto número: " + UtilidadesExamen.sacaBola(numero4));
		System.out.println("Quinto número: " + UtilidadesExamen.sacaBola(numero5));
		System.out.println("Sexto número: " + UtilidadesExamen.sacaBola(numero6));
		System.out.println("Complementario: " + UtilidadesExamen.sacaBola(complementario));
		System.out.println("Reintegro: " + UtilidadesExamen.sacaBola(reintegro));
	
		
		
	}

}
