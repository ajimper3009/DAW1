package ejerciciosClase.unidad7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class Ejercicio2 {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce el nombre del fichero");
		String fileA = scan.nextLine();
		String rutaA = "ficheros/" + fileA;
		System.out.println("Introduce el nombre del segundo fichero");
		String fileB = scan.nextLine();
		String rutaB = "ficheros/" + fileB;
		String [] extAArray = rutaA.split("\\.");
		System.out.println("Introduce la ruta de destino");
		String fileDestino = scan.nextLine();
		String rutaDestino = "ficheros/" + fileDestino + "/";
		int extALength = extAArray.length;
		String extA = extAArray[extALength - 1];
		String extB = rutaB.split("\\.")[rutaB.split("\\.").length - 1];
		String nuevoArchivo = "";
		if(StringUtils.equals(extA, extB)) {
			int indexPuntoA = StringUtils.lastIndexOf(fileA, ".");
			int indexPuntoB = StringUtils.lastIndexOf(fileB, ".");
			String parteA = StringUtils.substring(fileA, 0, indexPuntoA); 
			String parteB = StringUtils.substring(fileB, 0, indexPuntoB); 
			nuevoArchivo = rutaDestino + parteA + " - " + parteB + "_copia." + extA;
		}
		
	}
	
	public static void escribirFichero (String nuevoFichero, String ficheroA, String ficheroB) {
		
		try {
			FileWriter fw = new FileWriter(nuevoFichero);
			// Escribimos el texto en el fichero
			FileReader fr = new FileReader(ficheroA);
			int caracterInt = fr.read();
			while (caracterInt != -1) {
				fw.write((char)caracterInt);
				caracterInt=fr.read();
			}
			fr = new FileReader(ficheroB);
			fw.write((char)13);
			caracterInt = fr.read();
			while (caracterInt != -1) {
				fw.write((char)caracterInt);
				caracterInt=fr.read();
			}
			fw.close();
			fr.close();
		} catch (IOException e) {
			System.out.println("Problemas en la escritura E/S " + e);
		}
	}

}
