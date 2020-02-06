package boletin3parte2;

public class Triangulo extends Figura {
	
	private double base;
	private double altura;

	
	
	public Triangulo (double base, double altura)
	{
		this.base = base;
		this.altura = altura;
	}
	
	
	/**
	 *  calcula el area del triangulo, pasandole el valor de la base y la altura
	 * @param b valor de la base real
	 * @param a valor de la altura real
	 * @return areaRectangulo valor del área del rectángulo double
	 */
	public void calcularArea()
	{
		setArea((base * altura)/2.0);
		
	}
	
	public void calcularPerimetro()       // ejercicio 3. apartado 1
	{
		setPerimetro(base * 3);
		
	}
	
	public void imprimirDatosFigura()     // ejercicio3. apartado 2
	{
		
		System.out.printf(" \nTriangulo\nLa base es:%s\nLa altura es:%s\nEl area es:%s\nEl perimetro es:%s\n", base, altura,getArea(), getPerimetro());
	//	 printf(this.toString());
	
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
		return String.format("\n Triangulo\nLa base es:%s\nLa altura es:%s\nEl area es:%s", base, altura,getArea());
	}	
	
	
}
