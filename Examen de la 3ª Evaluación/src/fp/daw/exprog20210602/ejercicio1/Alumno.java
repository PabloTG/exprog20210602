package fp.daw.exprog20210602.ejercicio1;

import java.io.Serializable;
import java.time.LocalDate;

public class Alumno implements Serializable {

	private static final long serialVersionUID = 1L; // generado automáticamente por Eclipse

	// atributos
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private String ciclo;
	private int curso;

	// getters
	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public LocalDate getNacimiento() {
		return fechaNacimiento;
	}

	public String getCiclo() {
		return ciclo;
	}

	public int getCurso() {
		return curso;
	}

	// setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setNacimiento(LocalDate nacimiento) {
		fechaNacimiento = nacimiento;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		String imprimir = this.getApellidos() + ", " + this.getNombre() + ": " + this.getCiclo() + ", curso: "
				+ this.getCurso();
		return imprimir;
	}

} // fin clase
