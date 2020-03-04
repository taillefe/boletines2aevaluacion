package boletin4;

import java.util.Scanner;
import java.io.IOException;


public class Bol4Ejercicio1 {

	public static void main(String[] args) {

  // ************** Ejercicio 1 **********//
		boolean esNumero = false;
		String cadena = "";
		
		
		/*Scanner sc = new Scanner(System.in);

		
		System.out.println("Introduce un numero entero");
			
		cadena=sc.next();
			
		
		
		esNumero = UtilTransformacionDatos.esValorNumerico (cadena);
		if (esNumero)
		{
			System.out.println ("El valor introducido es un numero");
		}
		else
		{
			System.out.println ("Error: el valor introducido no es un numero");
		}*/
		
	//********* Ejercicio 2 ***************//
	/*	
		String cadena2 = "23";
		double numeroDouble;
		try
		{
			numeroDouble = UtilTransformacionDatos.obtenerValorDouble(cadena2);
			System.out.println("Es double");
		}
		catch (NumberFormatException ex)
		{
			//ex.printStackTrace();
			System.out.println("No es double");
		}
		
	*/	
	//******Ejercicio 3****//
	/*	
		boolean valorCorrecto = false;
		
		while(!valorCorrecto)
		{
			try
			{
				UtilObtencionDatos.obtenerNumeroPositivoEntero();// llamar al metodo de valor positivo
				valorCorrecto=true;
			}
			catch(ValorNumericoNegativoException ex)
			{
				valorCorrecto=false;
				//System.out.println(ex.getMessage());  // esto lanza el mensaje que aparece 
														// en el throw de obtenerNumeroPositivoEntero
				System.out.println("El valor deberia ser positivo (enviado desde el catch)");
			}
		}
	*/
		
		
	//************Ejercicio 4 **********//	

		String nom = "Pedro";
		String pass = "ppp";
		Usuario u1 = new Usuario(nom,pass);
		Usuario u2 = new Usuario("","");
		UtilLogeo util = new UtilLogeo();
		u2 = util.realizarLogin(nom,pass);
		
		
		
		
		
		
	}

}
