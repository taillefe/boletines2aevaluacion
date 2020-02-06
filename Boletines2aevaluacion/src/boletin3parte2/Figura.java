package boletin3parte2;

import boletin3.Conductor;

public abstract class Figura implements ICalculosFigura, IImpresionFigura{
	
	private double area;
	private double perimetro;    // ejercicio 3. apartado 1
	
	
	
	
	public abstract void calcularArea();
	
	public void imprimirArea()
	{
		System.out.println("El valor del área es : "+ this.area);
	}
	
	public void imprimirPerimetro()
	{
		System.out.println("El valor del perimetro es : "+ this.perimetro);
	}
	
	public double getArea()
	{
		return this.area;
	}
	
	public void setArea(double area)
	{
		this.area = area;
	}

	public double getPerimetro()    // ejercicio 3. apartado 1
	{
		return this.perimetro;
	}
	
	public void setPerimetro(double perimetro)
	{
		this.perimetro = perimetro;
	}

}
