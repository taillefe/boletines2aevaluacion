package Boletin2.Ej1;

import java.util.Date;
import java.time.LocalDate;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Persona P1 = new Persona();
		P1.nombre= "Jose";
		P1.apellidos = "Rodriguez Mata"; 
		P1.fechaNacimiento =  LocalDate.of(1965,1,15);
		P1.estatura = 165;
		
		Persona P2 = new Persona();
		P2.nombre= "Maria";
		P2.apellidos = "Sanchez Gomez"; 
	
		P2.fechaNacimiento =  LocalDate.parse("1980-12-26");
		P2.estatura = 170;
		
		Persona P3 = new Persona();
		P3.nombre= "Alejandro";
		P3.apellidos = "Gomez Gomez"; 
		P3.fechaNacimiento =  LocalDate.parse("2001-11-01");
		P3.estatura = 190;
		
		Persona P4 = new Persona();
		P4.nombre= "Jose Manuel";
		P4.apellidos = "Perez Pons"; 
		P4.fechaNacimiento =  LocalDate.parse("2010-05-01");
		P4.estatura = 127;
		
		P1.mostrarDatos();
		P2.mostrarDatos();
		P3.mostrarDatos();
		P4.mostrarDatos();
		
		P1.obtenerEdad();
		P2.obtenerEdad();
		P3.obtenerEdad();
		P4.obtenerEdad();
		
		long num = 160;
		
		Persona P5 = new Persona("Lorena", "Remeseiro Neira", 160l);
		
		num = 175;
		Persona P6 = new Persona();
		P6.nombre= "Patricia";
		P6.apellidos = "Seoane Alvarez"; 
		P6.edad = num;

		//Persona[] arrayPersonas = new Persona[5]();
		Persona [] arrayPersonas = { P1,P2, P3, P4, P5};
		
	/*	Persona pMayor =arrayPersonas[0];
		for (Persona per:arrayPersonas)
		{
			if (per.edad > pMayor)
			{
				pMayor = per.edad;
			}
		}
		*/	
			
		
		/*String  format = new SimpleDateFormat("DD/MM/YYYY"); // Creamos un formato de fecha

		Date fecha = format.parse(entrada); // Creamos un date con la entrada en el formato especificado
*/
		
		
		/* crear un array de persona
		 * Persona [] array Persona = { P1,P2, P3, P4, P5, P6, P7};
		 * 
		 * 
		 * o bien
		 * 
		 * Persona Per = arrayPersona[i];
		 * arrayPersona[i].obtenerEdad();
		 * 
		 * 
		 * public void setEdad(localDate   )
		 * this.edad
		 */
	}

}
