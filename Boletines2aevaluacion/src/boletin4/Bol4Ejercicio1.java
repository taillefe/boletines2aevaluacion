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
			
		
		//este metodo esValorNumerico controla la excepcion dentro del propio metodo
		
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
		
		// este metodo obtenerValorDouble lanza la excepcion a través de un throws
		//  y se controla en el main
		
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

		//String nom = "Pedro";
		//String pass = "ppp";
		
		
		String nom= "luis86";  // usuario existente
		String pass = "00000";	// contraseña incorrecta
		
		
		UtilLogeo util = new UtilLogeo();    // crear objeto de tipo UtilLogeo para poder llamar a su metodo
		
	
		try {
			Usuario u = util.realizarLogin(nom,pass);   // llamada al metodo de la clase UtilLogeo
			
		} catch (LoginUsuarioNoExistente ex) {    // primera comprobación de usuario no existente
			
			System.out.println(ex.getMessage());
		}

		catch (LoginUsuarioPassErroneo ex) {     // segunda comprobación de password erroneo
			

			System.out.println(ex.getMessage());
		}
		finally
		{
			System.out.println("Entrada en FINALLY");   // siempre entra en finally
		}
		
		
		
		
		
		
	}

}
