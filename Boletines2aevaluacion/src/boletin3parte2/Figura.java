package boletin3parte2;

import boletin3.Conductor;

public abstract class Figura {
	
	private double area;
	
	
	
	
	public abstract void calcularArea();
	
	protected void imprimirArea()
	{
		System.out.println("El valor del área es : "+ this.area);
	}
	
	public double getArea()
	{
		return this.area;
	}
	
	public void setArea(double area)
	{
		this.area = area;
	}

}
