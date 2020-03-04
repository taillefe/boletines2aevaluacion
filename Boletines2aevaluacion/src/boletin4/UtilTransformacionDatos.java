package boletin4;

import java.util.Scanner;
import java.io.IOException;

public class UtilTransformacionDatos {

	
	public static boolean esValorNumerico(String cadena)
	{
		boolean esNumerico =true;
		int num;
				
			try
			{
			
				num = Integer.parseInt(cadena);
				
				///
			}
			catch (NumberFormatException ex)
			{
				esNumerico = false;
				System.out.println ("Se ha producido una excepcion " + 
								"al comprobar que "+ cadena + 
								" es un valor numerico");
				ex.printStackTrace();
			}
			finally
			{
				System.out.println ("El valor introducido es : " + cadena);
			}
		
		return esNumerico;
	}//esValorNumerico
		
	public static double obtenerValorDouble(String cadena) throws NumberFormatException
	{
		double numero = 0;
		
		numero = Double.parseDouble(cadena);
		System.out.println ("el valor introducido es double");
			
		return numero;
		

	}
	
}
	
	