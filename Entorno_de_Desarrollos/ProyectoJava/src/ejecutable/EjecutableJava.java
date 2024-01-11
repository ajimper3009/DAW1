package ejecutable;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EjecutableJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 JFrame ventana = new JFrame("Hola Mundo");

	        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    
	        Box verticalBox = Box.createVerticalBox();

	       
	        JLabel etiqueta = new JLabel("Hola Mundo");

	     
	        etiqueta.setAlignmentX(JLabel.CENTER_ALIGNMENT);

	       
	        verticalBox.add(Box.createVerticalGlue()); 
	        verticalBox.add(etiqueta);
	        verticalBox.add(Box.createVerticalGlue()); 

	       
	        ventana.getContentPane().setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.X_AXIS));
	        ventana.getContentPane().add(Box.createHorizontalGlue());
	        ventana.getContentPane().add(verticalBox);
	        ventana.getContentPane().add(Box.createHorizontalGlue());

	        
	        ventana.setLocationRelativeTo(null);

	        
	        ventana.setSize(300, 200);

	       
	        ventana.setVisible(true);
		
	}

}
