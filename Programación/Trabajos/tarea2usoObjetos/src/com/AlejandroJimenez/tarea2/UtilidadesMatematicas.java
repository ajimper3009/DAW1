package com.AlejandroJimenez.tarea2;


public class UtilidadesMatematicas {

	public static long pegaPorDetras(long numeroBase, long numeroFinal1) {
		
		long numeroBase1 = 6543;
		long numeroAnadir = 88;
		
		long nuevoNumero = pegaPorDetras(numeroBase, numeroAnadir);
		System.out.println(nuevoNumero);
		
		return numeroBase + numeroFinal1;
		
	}
	
	
}
