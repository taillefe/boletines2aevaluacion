package boletin3parte2;

public class Cuadrado extends Rectangulo{
	
/* ***** esto es si Cuadrado extiendo a Figura  *****
 * 
	private double lado;

	
	public Cuadrado (double lado)
	{
		this.lado = lado;
	}
	*/
	
	/**
	 * calcula el área de un cuadrado pasandole el valor del lado
	 * @param l valor del lado  real
	 * @return areaCuadrado valor del area del cuadrado double
	 */
/*	public void calcularArea()
	{
		
		double a = lado * lado;
		setArea(a);
		
	}
	
	public double getLado()
	{
		return this.lado;
	}
	
	public void setLado(double lado)
	{
		this.lado = lado;
	}

	
 
*/
	
	/* **** esto es si Cuadrado extiende a Rectangulo *****************
	 * apartado 4
	 * 
	 * se arprovechan todos los metodos de rectangulo y solo hay que hacer 
	 * un constructor para cuadrado con el dato de su lado
	 * 
	 */
	public Cuadrado (double lado)
	{
		super(lado, lado);
	}
	
	public String toString() 
	{
		return super.lado; 
	}
	
}
