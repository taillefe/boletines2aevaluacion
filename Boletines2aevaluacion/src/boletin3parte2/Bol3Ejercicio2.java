package boletin3parte2;

public class Bol3Ejercicio2 {

	public static void main(String[] args) {
		
		
		Triangulo t1 = new Triangulo(2,12);
		Cuadrado c1 = new Cuadrado (2);
		Circulo cir1 = new Circulo (10);
		Rectangulo r1 = new Rectangulo(2,3);
		
/*		
		t1.calcularArea();
		System.out.println ("Area del triangulo "+ t1.getArea());
		c1.calcularArea();
		System.out.println ("Area del cuadrado "+ c1.getArea());
		cir1.calcularArea();
		System.out.println ("Area del circulo "+ cir1.getArea());
		r1.calcularArea();
		System.out.println ("Area del rectangulo "+ r1.getArea());
		
				
		System.out.println (c1.toString());  // si se pone solo el objeto busca el toString() seria igual a c1
		System.out.println (t1);
		System.out.println (cir1);
		System.out.println (r1);
		
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
		
		guardarArray(arrayFiguras);
	*/	
		t1.calcularArea();
		t1.calcularPerimetro();
		t1.imprimirDatosFigura();
		t1.imprimirArea();
		t1.imprimirPerimetro();
		
		c1.calcularArea();
		c1.calcularPerimetro();
		c1.imprimirDatosFigura();
		c1.imprimirArea();
		c1.imprimirPerimetro();
		
		cir1.calcularArea();
		cir1.calcularPerimetro();
		cir1.imprimirDatosFigura();
		cir1.imprimirArea();
		cir1.imprimirPerimetro();
		
		r1.calcularArea();
		r1.calcularPerimetro();
		r1.imprimirDatosFigura();
		r1.imprimirArea();
		r1.imprimirPerimetro();
		
		
	}
	
	
	
	public static void guardarArray ( Figura [] aFiguras)  // si esto no fuera static, para llamarlo en este main, 
															// debería crear un objeto de la clase Bol3Ejercicio2 
	{
		
		Cuadrado[] arrayCuadrados = new Cuadrado[aFiguras.length];
		Triangulo[] arrayTriangulos =new Triangulo[aFiguras.length];
		Rectangulo[] arrayRectangulos = new Rectangulo[aFiguras.length];;
		Circulo[] arrayCirculos=new Circulo[aFiguras.length];
		
		
		for (int i=0; i < aFiguras.length; i++)
		{
			if (aFiguras[i] instanceof Triangulo) 
			{
				arrayTriangulos[i] = (Triangulo)aFiguras[i];
			}
			if (aFiguras[i] instanceof Cuadrado) 
			{
				arrayCuadrados[i] = (Cuadrado)aFiguras[i];
			}
			if (aFiguras[i] instanceof Rectangulo) 
			{
				arrayRectangulos[i] = (Rectangulo)aFiguras[i];
			}
			if (aFiguras[i] instanceof Circulo) 
			{
				arrayCirculos[i] = (Circulo)aFiguras[i];
			}
		}
		
		System.out.println("Valores de array de cuadrado");
		for(Cuadrado c:arrayCuadrados)
		{
			System.out.println(c);  // esto es lo mismo que hacer c.toString()
		}
		
	}

}
