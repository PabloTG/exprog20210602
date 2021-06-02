package fp.daw.exprog20210602.ejercicio1;

import java.util.Comparator;

public class AlumnoComparatorApellNombre implements Comparator<Alumno> {
	// para ordenar alumnado según apellidos y nombre
	@Override
	public int compare(Alumno uno, Alumno dos) {
		if (uno == dos)
			return 0;
		int comparacion = uno.getApellidos().compareTo(dos.getApellidos());
		if (comparacion == 0)
			comparacion = uno.getNombre().compareTo(dos.getNombre());
		return comparacion;
	} // fin compareTo
} // fin clase
