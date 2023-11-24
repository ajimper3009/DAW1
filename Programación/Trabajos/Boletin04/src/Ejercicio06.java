import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scann = new Scanner(System.in);
		int[] tempMedia = new int[12];
		
		for (int i = 0; i < 12; i++) {
            System.out.print("Introduce la temperatura media del mes " + (i + 1) + ": ");
			tempMedia[i] = scann.nextInt();
		}
		
		for (int i = 0; i < 12; i++) {
            System.out.print("Mes " + (i + 1) + ": ");
            for (int j = 0; j < (int) tempMedia[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
           scann.close();
		}
		
	}

}
