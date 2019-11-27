package es.profesor.vista;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import es.profesor.modelo.Correo;
import es.profesor.modelo.Direccion;
import es.profesor.modelo.Modulo;
import es.profesor.modelo.Profesor;
import es.profesor.utilidades.Utilidades;

public class MainProfesor {

	public static void main(String[] args) {
		Direccion direccion = new Direccion ();
		Profesor prof = new Profesor ();
		Modulo modulo = new Modulo ();
		Correo correo1 = new Correo ();
		Correo correo2 = new Correo ();
		Correo correo3 = new Correo ();
		
		//DIRECCION
		direccion.setCalle("Calle Falsa");
		direccion.setNumero(12);
		direccion.setPoblacion("Madrid");
		direccion.setProvincia("Madrid");
		//CORREO
		correo1.setDireccion("losgemelos1996@hotmail.com");
		correo1.setProveedor("18Twins");
		
		correo2.setDireccion("alext1896@gmail.com");
		correo2.setProveedor("Alext");
		
		correo3.setDireccion("adkjsfnas@gmail.com");
		correo3.setProveedor("asdfafdas obviament");
		
		List <Correo> correos = new ArrayList<>();
		correos.add(correo1);
		correos.add(correo2);
		correos.add(correo3);
		
		//MODULO
		modulo.setNombre("Base de Datos");
		modulo.setCreditos(12);
		
		//PROFESOR
		prof.setNombre("Fer");
		prof.setApe1("Apellido1");
		prof.setApe2("Ape2");
		prof.setDireccion(direccion);
		prof.setModulo(modulo);
		prof.setCorreo(correos);

		
		Session sesion = Utilidades.getSessionFactory().openSession();
		sesion.beginTransaction();
		sesion.save(prof);
		sesion.getTransaction().commit();
		System.out.println(prof);
		
		
	}

}
