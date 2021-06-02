package fp.daw.exprog20210602.ejercicio1;

import java.util.Comparator;

public class AlumnoComparatorCicloEtc implements Comparator<Alumno> {
	// para ordenar alumnado según ciclo, curso, apellidos y nombre
	@Override
	public int compare(Alumno uno, Alumno dos) {
		if (uno == dos)
			return 0;
		int comparacion = uno.getCiclo().compareTo(dos.getCiclo());
		if (comparacion == 0) {
			if (uno.getCurso() < dos.getCurso())
				comparacion = -1;
			if (uno.getCurso() > dos.getCurso())
				comparacion = 1;
		} // fin if curso
		if (comparacion == 0)
			comparacion = uno.getApellidos().compareTo(dos.getApellidos());
		if (comparacion == 0)
			comparacion = uno.getNombre().compareTo(dos.getNombre());
		return comparacion;
	} // fin compareTo
} // fin clase