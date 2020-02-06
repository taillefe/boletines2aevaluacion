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
	public final void calcularArea()   // poner esta clase como final para no poder sobreescribirla en cuadrado
	{
				
		setArea(base * altura);
		
	}
	
	public void calcularPerimetro()    // ejercicio 3. apartado 1
	{
		setPerimetro((base * 2) + (altura * 2));
		
	}
	
	
	public void imprimirDatosFigura()     // ejercicio3. apartado 2
	{
		//System.out.printf(" \nRectangulo\nLa base es:%s\nLa altura es:%s\nEl area es:%s\nEl perimetro es:%s\n", base, altura,getArea(), getPerimetro());
			 System.out.printf(this.toString());   // en rectangulo uso toString para que cuando lo llame circulo aparezcan los datos de circulo   
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
		return String.format("\n Rectangulo\nLa base es:%s\nLa altura es:%s\nEl area es:%s\nEl perimetro es:%s\n", this.base, this.altura,getArea(),getPerimetro());
		
		//return String.valueOf(this.base);   esto devuelve el valor double como un string
		
	}
	
	

}
