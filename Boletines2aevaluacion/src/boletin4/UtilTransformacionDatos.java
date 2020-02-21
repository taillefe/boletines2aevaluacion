package boletin4;

import java.util.Scanner;

public class UtilTransformacionDatos {

	
	public static boolean esValorNumerico(String cadena)
	{
		boolean esNumerico =true;
		int num;
				
			try
			{
			
				Integer.parseInt(cadena);
				
				///
					}
			catch (NumberFormatException ex)
			{
				esNumerico = false;
			}
			finally
			{
				System.out.println ("El valor introducido es : " + cadena);
			}
		
		return esNumerico;
	}//esValorNumerico
		
	public static double obtenerValorDouble(String cadena)
	{
		double numero = 0;
		
		
		
		
		
		return numero;
		

	}
}
