package programacionObjetos;

public class  Utilidades03 {

	public static int introduceInt(String cadena) throws Exception {
		
		int res;
		
		try {
			 res = Integer.parseInt(cadena);
		}catch (NumberFormatException e) {
			throw new Exception("La cadena no es un valor entero");
			
		}
		return res;
	}
	
}
