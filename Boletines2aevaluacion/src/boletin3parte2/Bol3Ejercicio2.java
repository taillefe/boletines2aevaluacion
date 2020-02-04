package boletin3parte2;

public class Bol3Ejercicio2 {

	public static void main(String[] args) {
		
		
		Triangulo t1 = new Triangulo(2,12);
		Cuadrado c1 = new Cuadrado (2);
		Circulo cir1 = new Circulo (10);
		
		
		t1.calcularArea();
		System.out.println ("Area del triangulo "+ t1.getArea());
		c1.calcularArea();
		System.out.println ("Area del cuadrado "+ c1.getArea());
		cir1.calcularArea();
		System.out.println ("Area del circulo "+ cir1.getArea());
		
		// apartado 5
		
		Figura[] arrayFiguras = {
				new Triangulo(3,2),
				new Cuadrado (5),
				new Triangulo(15,3),
				new Triangulo(8,7),
				new Rectangulo (9,5),
				new Rectangulo(15,6),
				new Circulo(5),
				new Circulo (9),
				new Rectangulo(8,3),
				new Cuadrado (9)
		};
		
		
	}
	
	public  void guardarArray ( Figura [] aFiguras)
	{
		
		Cuadrado[] arrayCuadrados;
		Triangulo[] arrayTriangulos;
		Rectangulo[] arrayRectangulos;
		Circulo[] arrayCirculos;
		
		
		for (int i=0; i < aFiguras.length; i++)
		{
			if (aFiguras[i] instanceof Triangulo) 
			{
				arrayTriangulos[i] = (Triangulo)aFiguras[i];
			}
		}
	}

}
