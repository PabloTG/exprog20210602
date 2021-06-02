package fp.daw.exprog20210602.ejercicio1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.TreeSet;

public class PruebaAlumno {

	public static void main(String[] args) {
		// declaro los TreeSets
		TreeSet<Alumno> apellidosNombre = new TreeSet<Alumno>(new AlumnoComparatorApellNombre());
		TreeSet<Alumno> cicloEtc = new TreeSet<Alumno>(new AlumnoComparatorCicloEtc());
		// relleno los TreeSets
		for (int i = 1; i <= 5; i++) {
			Alumno alumno = new Alumno();
			alumno.setNombre("Nombre" + i);
			alumno.setApellidos("Apellidos" + i);
			alumno.setCiclo("Ciclo 1");
			alumno.setCurso(1);
			apellidosNombre.add(alumno);
			cicloEtc.add(alumno);
		}
		for (int i = 6; i <= 10; i++) {
			Alumno alumno = new Alumno();
			alumno.setNombre("Nombre" + i);
			alumno.setApellidos("Apellidos" + i);
			alumno.setCiclo("Ciclo 1");
			alumno.setCurso(2);
			apellidosNombre.add(alumno);
			cicloEtc.add(alumno);
		}
		for (int i = 11; i <= 15; i++) {
			Alumno alumno = new Alumno();
			alumno.setNombre("Nombre" + i);
			alumno.setApellidos("Apellidos" + i);
			alumno.setCiclo("Ciclo 2");
			alumno.setCurso(1);
			apellidosNombre.add(alumno);
			cicloEtc.add(alumno);
		}
		for (int i = 16; i <= 20; i++) {
			Alumno alumno = new Alumno();
			alumno.setNombre("Nombre" + i);
			alumno.setApellidos("Apellidos" + i);
			alumno.setCiclo("Ciclo 2");
			alumno.setCurso(2);
			apellidosNombre.add(alumno);
			cicloEtc.add(alumno);
		}
		// muestro los TreeSets sin iterar
		System.out.println(apellidosNombre.toString());
		System.out.println(cicloEtc.toString());
		
		// para guardar los TreeSets en un fichero
		try {
		ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("alumno.out"));
		for (Alumno persona : apellidosNombre)
			salida.writeObject(persona);
		for (Alumno persona : cicloEtc)
			salida.writeObject(persona);
		salida.close();
		} // fin try
		catch (IOException ioe) {
			System.err.print("Se ha producido un error E/S: " + ioe.getMessage());
		}
	} // fin main
} // fin clase
