package fp.daw.exprog20210602.ejercicio2;

import java.io.File;
import java.util.Scanner;

public class PruebaFrecuencia {

	public static void main(String[] args) {
		// declaro el fichero para trabajar con �l
		File quijote = new File("C:\\Users\\alumno\\Desktop\\quijote.txt");
		// creo un objeto Frecuencia para contar sus palabras
		Frecuencia prueba = new Frecuencia(quijote);
		// anuncio que todo est� listo para buscar palabras
		System.out.println("Introduzca la palabra a buscar: ");
		// declaro un esc�ner para aceptar palabras que buscar
		Scanner entrada = new Scanner(System.in);
		String buscar = entrada.next();
		prueba.buscarFrecuencia(buscar);
		entrada.close();
	}

}
