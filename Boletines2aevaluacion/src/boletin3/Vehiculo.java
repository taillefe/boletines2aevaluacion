package boletin3;

public class Vehiculo {
	
	
	protected String matricula;
	protected String tipo;
	protected int velocidadMaxima;
	protected Conductor conductor;
	
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
		System.out.println(matricula +" " +tipo +" " + velocidadMaxima +" " + conductor.dni +" "+ conductor.nombre);
		System.out.println(conductor.toString());
	}
	
}
	
