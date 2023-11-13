package programacionObjetos;

import java.util.Scanner;

public class UtilidadesEj03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int opcion;
	Scanner scan = new Scanner(System.in);
		do{
			opcion = scan.nextInt();
			switch (opcion) {
			
			case 1:
				int entero = 
				introduceInt(scan.nextLine());
				break;
			
			case 2:
				
				introduceFloat(scan.nextLine());
				break;
				
			case 3:
				introducedouble(scan.nextLine());
				break;
				
			
				
			default:
				System.out.println("");
			
		
			
			
			}	
		
		} while (opcion != 0);
		
	

	


	}

}

