package programacionObjetos;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

public class rectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point punto =new Point();
		Dimension dim = new Dimension();
		Rectangle r1 = new Rectangle(4, 6);
		Rectangle r2 = new Rectangle(1, 1);
		r2 = new Rectangle (r1);
		r1.setSize(2, 2);
		System.out.println("La altura del rectangulo r2 es "
				+ r2.getHeight() + " y su anchura es " + r2.getWidth());
	}

}
