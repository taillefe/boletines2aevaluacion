package boletin3parte2;

public class Circulo extends Figura {
	
	private double radio;
	final double PI=3.1416;

	
	
	public Circulo (double radio)
	{
		this.radio = radio;
	}
	
	/**
	 * calcula el area de un cículo
	 * @param r radio real
	 * @return areaCirculo double
	 */
	public void calcularArea()
	{
		
		
		setArea( PI * radio * radio);
	}
	
	
	public double getRadio()
	{
		return this.radio;
	}
	
	public void setRadio(double radio)
	{
		this.radio = radio;
	}



}
