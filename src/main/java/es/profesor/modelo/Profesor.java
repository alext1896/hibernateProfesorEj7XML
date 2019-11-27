package es.profesor.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Profesor implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;

	private String nombre;

	private String ape1;

	private String ape2;

	private Direccion direccion;

	private Modulo modulo;

	private List<Correo> correo = new ArrayList<>();

	public Profesor() {

	}

	public Profesor(String ape1, String ape2, Direccion direccion, Modulo modulo, List<Correo> correo) {
		this.ape1 = ape1;
		this.ape2 = ape2;
		this.direccion = direccion;
		this.modulo = modulo;
		this.correo = correo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApe1() {
		return ape1;
	}

	public void setApe1(String ape1) {
		this.ape1 = ape1;
	}

	public String getApe2() {
		return ape2;
	}

	public void setApe2(String ape2) {
		this.ape2 = ape2;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Modulo getModulo() {
		return modulo;
	}

	public void setModulo(Modulo modulo) {
		this.modulo = modulo;
	}

	public List<Correo> getCorreo() {
		return correo;
	}

	public void setCorreo(List<Correo> correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Profesor [id=" + id + ", ape1=" + ape1 + ", ape2=" + ape2 + ", direccion=" + direccion + "modulo = "
				+ modulo + " correo= " + correo + "]";
	}

}
