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
	 * calcula el área de un rectangulo pasandole el valor de base y altura
	 * @param base y altura
	
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

	public String toString() 
	{
		return String.format(" Rectangulo\nLa base es:%s\nLa altura es:%s\nEl area es:%s", this.base, this.altura,getArea());
		
		//return String.valueOf(this.base);   esto devuelve el valor double como un string
		
	}
	
	

}
