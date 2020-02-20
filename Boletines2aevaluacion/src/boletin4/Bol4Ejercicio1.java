package boletin4;

import java.util.Scanner;

public class Bol4Ejercicio1 {

	public static void main(String[] args) {


		boolean esNumero = false;
		String cadena = "";
		
		
		Scanner sc = new Scanner(System.in);

		
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
		}
		
		

	}

}
