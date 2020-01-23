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

}
