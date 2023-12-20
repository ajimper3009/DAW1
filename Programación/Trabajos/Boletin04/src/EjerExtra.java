
public class EjerExtra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] n = new int [10] [10];
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				n[i] [j] = (int) (Math.random() * 101) + 200;
				System.out.printf("%d \t", n[i] [j]);
			}
			System.out.println();
			
		}
		System.out.println("\nDiagonal desde la esquina superior izquierda");
	}

}
