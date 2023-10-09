/**
 * 
 */
package Default;

import java.util.Scanner;

/**
 * 
 */
public class Horoscopo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		System.out.println("Introduce tu mes de nacimiento en numero");
		int mes = scan.nextInt();
		System.out.println("Introduce tu día en número de nacimiento");
		int dia = scan.nextInt();
		
		 if (mes == 1) {
	            if (dia >= 21) {
	                //acuario
	                System.out.println("acuario");
	            } else {
	                //capricornio
	            	System.out.println("capricornio");
	            }
	        }
	        if (mes == 2) {
	            if (dia >= 19) {
	            	System.out.println("picis");
	            } else {
	            	System.out.println("acuario");
	            }
	        }
	        if (mes == 3) {
	            if (dia >= 20) {
	                //acuario
	            	System.out.println("aries");
	            } else {
	                //capricornio
	            	System.out.println("picis");
	            }
	        }
	        if (mes == 4) {
	            if (dia >= 20) {
	            	System.out.println("tauro");
	            } else {
	            	System.out.println("aries");
	            }
	        }
	        if (mes == 5) {
	            if (dia >= 21) {
	                //acuario
	            	System.out.println("geminis");
	            } else {
	                //capricornio
	            	System.out.println("tauro");
	            }
	        }
	        if (mes == 6) {
	            if (dia >= 20) {
	            	System.out.println("cancer");
	            } else {
	            	System.out.println("geminis");
	            }
	        }
	        if (mes == 7) {
	            if (dia >= 22) {
	                //acuario
	            	System.out.println("leo");
	            } else {
	                //capricornio
	            	System.out.println("cancer");
	            }
	        }
	        if (mes == 8) {
	            if (dia >= 21) {
	            	System.out.println("virgo");
	            } else {
	            	System.out.println("leo");
	            }
	        }
	        if (mes == 9) {
	            if (dia >= 22) {
	                //acuario
	            	System.out.println("libra");
	            } else {
	                //capricornio
	            	System.out.println("virgo");
	            }
	        }
	        if (mes == 10) {
	            if (dia >= 22) {
	            	System.out.println("escorpio");
	            } else {
	            	System.out.println("libra");
	            }
	        }
	        if (mes == 11) {
	            if (dia >= 21) {
	                //acuario
	            	System.out.println("sagitario");
	            } else {
	                //capricornio
	            	System.out.println("escorpio");
	            }
	        }
	        if (mes == 12) {
	            if (dia >= 21) {
	                System.out.println("capricornio");
	            } else {
	            	System.out.println("sagitario");
	            }
	        }
	        scan.close();
			
		
	}

}
