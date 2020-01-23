

package Boletin2.Ej1;

import java.util.Scanner;
import java.util.Date;
import java.sql.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Persona {

	String nombre;
	String apellidos;
	LocalDate fechaNacimiento;
	int estatura;
	Long edad;
		
	public void mostrarDatos()
	{
		System.out.println(this.nombre +" "+ this.apellidos +" "+ this.fechaNacimiento +" "+ this.estatura);
	
	}
	
	public void obtenerEdad()
	{
		LocalDate fechaActual = LocalDate.now();  /*obtiene la fecha de hoy*/
		edad = ChronoUnit.YEARS.between(fechaNacimiento, fechaActual); /* en edad tenemos la edad en años */
		System.out.println("La edad de " + this.nombre + " " + this.apellidos + " es " + edad + " años");
		
	}
	
	
	
	public Persona(String nombre, String apellidos , Long edad)
		{
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.edad = edad;
		}
	
	
	
	public Persona() {
		
	}
	
		
	

}


