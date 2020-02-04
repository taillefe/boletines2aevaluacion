package boletin3parte2;

public class Rectangulo extends Figura{
	
private double base;
private double altura;

	
	public Rectangulo (double base, double altura)
	{
		this.base = base;
		this.altura = altura;
	}
	
	
	/**
	 * calcula el área de un rectangulo pasandole el valor del lado
	 * @param l valor del lado  real
	 * @return areaCuadrado valor del area del cuadrado double
	 */
	public void calcularArea()
	{
		
		
		setArea(base * altura);
		
	}
	
	public double getBase()
	{
		return this.base;
	}
	
	public void setBase(double base)
	{
		this.base = base;
	}

	
	public double getAltura()
	{
		return this.altura;
	}
	
	public void setAltura(double altura)
	{
		this.altura = altura;
	}

	
	

}
