package fp.daw.exprog20210602.ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Frecuencia {
	// atributo: un mapa para guardar las palabras (claves)
	// con sus frecuencias (valores)
	private Map<String, Integer> mapa;

	// constructor
	public Frecuencia(File archivo) {
		try {
			// inicializo el mapa
			mapa = new TreeMap<String, Integer>();
			// leo el archivo
			BufferedReader entrada = new BufferedReader(new FileReader(archivo));
			String texto = entrada.readLine();
			// mientras haya texto por leer:
			while (texto != null) {
				// separo las palabras
				String[] linea = texto.split(" ");
				// y las a�ado al mapa:
				for (String palabra : linea) {
					if (mapa.containsKey(palabra)) { // si ya estaba en �l,
						int n = mapa.get(palabra); // averiguo cu�ntas veces aparece
						mapa.put(palabra, n + 1); // y a�ado uno a su frecuencia;
					} else // si no estaba, la a�ado;
						mapa.put(palabra, 1);
				} // fin for
					// y leo la siguiente l�nea
				texto = entrada.readLine();
			} // fin while
			entrada.close();
		} // fin try
		catch (FileNotFoundException fnfe) {
			System.err.println("Archivo no encontrado");
		} // fin catch FNF
		catch (IOException ioe) {
			System.err.println("Se ha producido un error E/S: " + ioe.getMessage());
		} // fin catch IO
		catch (Exception e) {
			System.out.println("Se ha producido un error: " + e.getMessage());
		} // fin catch gen�rico
	} // fin constructor

	// m�todo para buscar la frecuencia de una cadena de caracteres
	public int buscarFrecuencia(String palabra) {
		return mapa.get(palabra);
	} // fin buscarFrecuencia
} // fin clase
