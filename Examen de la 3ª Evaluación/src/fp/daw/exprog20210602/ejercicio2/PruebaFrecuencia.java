package fp.daw.exprog20210602.ejercicio2;

import java.io.File;
import java.util.Scanner;

public class PruebaFrecuencia {

	public static void main(String[] args) {
		try {
		// declaro el fichero para trabajar con él
		File quijote = new File("C:\\Users\\alumno\\Desktop\\prueba.txt");
		// creo un objeto Frecuencia para contar sus palabras
		Frecuencia prueba = new Frecuencia(quijote);
		// anuncio que todo está listo para buscar palabras
		System.out.println("Introduzca la palabra a buscar: ");
		// declaro un escáner para aceptar una palabra que buscar
		Scanner entrada = new Scanner(System.in);
		String buscar = entrada.next();
		System.out.println(prueba.buscarFrecuencia(buscar));
		entrada.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
