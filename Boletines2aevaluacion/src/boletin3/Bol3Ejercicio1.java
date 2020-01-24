package boletin3;

public class Bol3Ejercicio1 {

	public static void main(String[] args) {
		
		final String T1 = "COCHE";
		final String T2 = "CAMION";
		
		
		Coche c1 = new Coche("1234ABC",T1,120,5);
		
		Conductor cond1 = new Conductor("12345678A", "Pedro");
		
		//falta asignar el conductor al coche ????
		

		
		c1.setConductor (cond1);
		
		
		Remolque rem1 = new Remolque ();
		rem1.matricula = "8888";
		rem1.longitud = 3;
		
		
		Camion cam1 = new Camion ("23345qw",T2,80,rem1);
		
		
		
		//polimorfismo, en tiempo de ejecucion se trata una clase como si fuera otra
		
		
		Vehiculo v1 = new Vehiculo ();
		
		v1.matricula = "1111";
		v1.velocidadMaxima = 12;
		v1.tipo = T1;
		v1.conductor = cond1;
		
		
		
		c1.mostrarDatos();
		v1.mostrarDatos();
		
		// mostrardatos de un coche tratado como un vehiculo
		
		((Vehiculo)c1).mostrarDatos();
		
		cam1.mostrarDatos();
		
		/*
		(vehiculo v)
		{
	
		v1 instanceof(Coche)
		
			
		if (v1.tipo.equals(T2))
			{
				
			}
		}
		*/

	}

}
