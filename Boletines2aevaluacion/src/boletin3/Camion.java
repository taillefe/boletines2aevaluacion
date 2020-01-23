package boletin3;

public class Camion extends Vehiculo {
	
	private int altura;
	private Remolque remolque;
	
	public Camion (String matricula, String tipo, int vMaxima, Remolque remolque)
	{
		this.matricula = matricula;
		setTipo(tipo);
		velocidadMaxima = vMaxima;
		this.remolque = remolque;
	}
}
