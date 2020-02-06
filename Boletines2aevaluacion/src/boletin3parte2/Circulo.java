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
	
	public void calcularPerimetro()       // ejercicio 3. apartado 1
	{
		setPerimetro( 2 * PI * radio);
		
	}
	
	
	public void imprimirDatosFigura()     // ejercicio3. apartado 2
	{
		System.out.printf(" \nCirculo\nEl radio es:%s\nEl area es:%s\nEl perimetro es:%s\n", radio,getArea(), getPerimetro());
		//	 printf(this.toString());
	
	}
	
	
	public double getRadio()
	{
		return this.radio;
	}
	
	public void setRadio(double radio)
	{
		this.radio = radio;
	}

	public String toString() 
	{
		return String.format("\n Circulo\nEl radio es:%s\nEl area es:%s", radio, getArea());
	}	

}
