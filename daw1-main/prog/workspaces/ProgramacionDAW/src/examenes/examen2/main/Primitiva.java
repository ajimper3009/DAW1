package examenes.examen2.main;

import examenes.examen2.util.UtilidadesExamen;

public class Primitiva {

	public static void main(String[] args) {
		int num1 = UtilidadesExamen.sacaBola(1, 49);
		int num2 = UtilidadesExamen.sacaBola(1, 49);
		int num3 = UtilidadesExamen.sacaBola(1, 49);
		int num4 = UtilidadesExamen.sacaBola(1, 49);
		int num5 = UtilidadesExamen.sacaBola(1, 49);
		int num6 = UtilidadesExamen.sacaBola(1, 49);
		int comp = UtilidadesExamen.sacaBola(1, 49);
		int reint = UtilidadesExamen.sacaBola(0, 9);
		
		// Mostrar los resultados
        System.out.println("|********************************|");
        System.out.println("|****  Números principales:  ****|");
        System.out.println("|****                        ****|");
        System.out.printf("|**** %2d, %2d, %2d, %2d, %2d, %2d ****|\n", num1, num2, num3, num4, num5, num6);
        System.out.println("|********************************|");
        System.out.println("|**** Número complementario: ****|");
        System.out.printf("|****            %2d          ****|\n", comp);
        System.out.println("|********************************|");
        System.out.println("|****        Reintegro:      ****|");
        System.out.printf("|****            %2d          ****|\n", reint);
        System.out.println("|********************************|");
		
	}

}
