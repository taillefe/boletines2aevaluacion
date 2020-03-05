package boletin4;

import java.util.Scanner;
import java.io.IOException;


public class UtilObtencionDatos {
	

	
	public static int  obtenerNumeroPositivoEntero()
	{
		int num=0;
				
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero entero positivo");
		if (sc.hasNextInt())
		{
			num=sc.nextInt();
			if (num<=0)
			{
				// lanza la excepcion aqui para que se controle en el main (con una excepcion personalizada)
				throw new ValorNumericoNegativoException("El numero debe ser positivo");
							
			}	
						
		}
		else
		{
			sc.next();						
		}
		return num;
		
	}//obtenerNumeroPositivoEntero

}
