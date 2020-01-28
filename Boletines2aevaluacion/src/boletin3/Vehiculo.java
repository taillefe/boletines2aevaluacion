package boletin3;

public class Vehiculo {
	
	
	protected String matricula;
	protected String tipo;
	protected int velocidadMaxima;
	protected Conductor conductor;
	
	
	public Vehiculo(String matricula, String tipo, int velocidadMaxima)
	{
		this.matricula = matricula;
		this.tipo = tipo;
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public Vehiculo ()
	{
		
	}
	
	public String getMatricula()
	{
		return this.matricula;
	}
	
	public String getTipo()
	{
		return this.tipo;
	}

	public int getVelocidadMaxima()
	{
		return this.velocidadMaxima;
	}
	
	public Conductor getConductor()
	{
		return this.conductor;
	}
	
	public void setMatricula(String matricula)
	{
		this.matricula = matricula;
	}
	
	public void setTipo(String tipo)
	{
		this.tipo = tipo;
		
	}
	
	public void setVelocidadMaxima(int velocidadMaxima)
	{
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public void setConductor ( Conductor conductor)
	{
		this.conductor = conductor;
	}
	
	
	public void mostrarDatos()
	{
		System.out.println(matricula +" " +tipo +" " + velocidadMaxima);
		System.out.println(conductor);  // esto es igual que conductor.toString(), y si este es NULL imprime NULL
	}
	
}
	
