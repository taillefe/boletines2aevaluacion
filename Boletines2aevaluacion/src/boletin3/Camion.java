package boletin3;

public class Camion extends Vehiculo {
	
	public int altura;
	public Remolque remolque;
	
	public Camion (String matricula, String tipo, int vMaxima, Remolque remolque)
	{
		this.matricula = matricula;
		setTipo(tipo);
		velocidadMaxima = vMaxima;
		this.remolque = remolque;
	}

	public Camion (String matricula, String tipo, int vMaxima, int altura)
	{
		super(matricula, tipo, vMaxima);  // esto es igual que super.matricula = matricula , pero solo en la primera posicion del metodo
		this.altura = altura;
	}
	
	 @Override
	public void mostrarDatos() {
		 System.out.println(altura);
		 System.out.println("Remolque:" + remolque);  // esto es igual que remolque.toString(), y si es NULL imprime NULL
		 super.mostrarDatos();  // apartado 5.4
	}

}



