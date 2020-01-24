package boletin3;

public class Coche extends Vehiculo{
	
	
	private int numeroPlazas;
	
	public Coche (String matricula, String tipo, int vMaxima, int numeroPlazas)
	{
		this.matricula = matricula;      // matricula es protected en Vehiculo
		setTipo(tipo);                  // tipo es private en la clase padre Vehiculo 
		velocidadMaxima=vMaxima;         // velocidadMaxima es prtected y no lleva this porque no se llaman igual
		this.numeroPlazas = numeroPlazas;
				
	}

	
	@Override
	public void mostrarDatos() {
		
		System.out.println(numeroPlazas);
		
		//apartado 3 como modificar este metodo para que muestre los datos de vehiculos
		
		// usar super.matricula, super.tipo, super.velocidadMaxima, super.conductor
		
		// hacer un casteo para mostrar los datos como si fuera un vehiculo, no un coche (esto en el main)
		
	}
	
}
