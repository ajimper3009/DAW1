package ejerciciosClase.unidad3;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Scanner;

public class RectangulosEnX0Y0 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Rectangle r1 = new Rectangle(0,0,2,2);
		Rectangle r2 = new Rectangle(0,0,1,1);
		
		Point p1 = new Point(1, -1);
		if (r1.contains(r2)) {
			System.out.println("SI");
		} else {
			System.out.println("NO");	
		}
			
		System.out.println(scan.toString());
		System.out.println("Introduce el ancho del rectángulo");
		int ancho = scan.nextInt();
		System.out.println("Introduce el alto del rectángulo");
		int alto = scan.nextInt();
		
		Dimension dim = new Dimension (ancho, alto);
		Point punto = new Point();
		punto.y = alto;
		Rectangle rect = new Rectangle(punto, dim);
		System.out.println("La esquina superior izquierda del rectángulo está situada en el punto " + rect.x + ", " + rect.y);
		
		
		System.out.println("Introduce la coordenada x");
		int x = scan.nextInt();
		System.out.println("Introduce la coordenada y");
		int y = scan.nextInt();
		if (rect.contains(x, y)) {
			System.out.println("El punto está en el rectángulo");
		} else {
			System.out.println("El punto NO está en el rectángulo");
		}
		System.out.println(rect.toString());
	}

}
