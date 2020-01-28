package boletin3;

public class Bol3Ejercicio1 {

	public static final String T1 = "COCHE";
	static final String T2 = "CAMION";
	
	
	public static void main(String[] args) {
		
	/*
		
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
		
		//apartado 3
		System.out.println("mostrar datos de coche");
		c1.mostrarDatos();
		
		System.out.println("mostrar datos de vehiculo");
		v1.mostrarDatos();
		
		// mostrardatos de un coche tratado como un vehiculo
		System.out.println("mostrar datos de coche como vehiculo");
		((Vehiculo)c1).mostrarDatos(); // esto no muestra los datos del vehiculo, muestra los del coche
										// para mostrar los del vehiculo, dentro de la clase coche hay que hacer
										// referencia a super.tipos de datos
		System.out.println("mostrar datos de camion");
		cam1.mostrarDatos();
		
		
		
		//apartado 4
		System.out.println("impresion polimorfismo con coche");
		impresionPolimorfismo(c1);
		System.out.println("impresion polimorfismo con camion");
		impresionPolimorfismo(cam1);
		
		*/
		//apartado 5
		
		Camion cam2 = new Camion("nuevo camion",T2,60,3);
		cam2.mostrarDatos();
		System.out.println("mostrar datos de camion en el apartado 5");
		System.out.println(cam2.matricula + " "+ cam2.tipo + " "+ cam2.velocidadMaxima + " " + cam2.altura);
		
		/*
		(vehiculo v)
		{
	
		v1 instanceof(Coche)
		
			
		
		*/

	}
	
	public static void impresionPolimorfismo (Vehiculo v)
	{
		v.mostrarDatos();
	}
	
	public static void impresionSoloCamion (Vehiculo v)
	{
		
		if (v.tipo.equals(T2))
			{
			Camion camPoli=(Camion)v;
				camPoli.remolque.toString();
				
					
			}
	
	}



	

}
