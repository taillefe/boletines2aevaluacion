package Boletin5;

import java.util.ArrayList;

public class Bol5Ejer1 {

	public static void main(String[] args) {


		/*************************************** Apartado 1 *************************/
	/*	
		ArrayList<Persona> arrayPersonasEjemplo = new ArrayList<>();
		ArrayList<Persona> arrayPersonasA = new ArrayList<>();
		
		char a = 'A';
		
		Persona p1 = new Persona("Pedro","Blanco",36);
		Persona p2 = new Persona("Adolfo","Perez",46);
		Persona p3 = new Persona("Arturo","Perez",56);
		Persona p4 = new Persona("Antonio","Perez",66);
		arrayPersonasEjemplo.add(p1);
		arrayPersonasEjemplo.add(p2);
		arrayPersonasEjemplo.add(p3);
		arrayPersonasEjemplo.add(p4);
		
		arrayPersonasA = buscarPersonasQueEmpiecenPor(arrayPersonasEjemplo, a);
		
		for (int i = 0; i< arrayPersonasA.size() ; i++)
		{
			System.out.println(arrayPersonasA.get(i));	 // si no pongo nada llama al metodo toString()	
														// que he sobreescrito en la clase Persona
														// si no tendría que llamar a getNombre, getApellidos,..
		}

	*/	
//  ************************   Apartado 4 *******************************************//		
		 //public class Ejercicio1 {
		//	public static void main(String[] args) {

		ArrayList<Persona> listaPersonasResultado = new ArrayList<>();
		ArrayList<Persona> listaPersonasResultado2 = new ArrayList<>();


			ArrayList<Persona> listaPersonas= new ArrayList<Persona>();
			listaPersonas.add(new Persona("Jose","Martinez Granda",55));
			listaPersonas.add(new Persona("Katy","Ruiz Gomez",24));
			listaPersonas.add(new Persona("Jose Manuel","Blanco Garrido",18));
			listaPersonas.add(new Persona("Jose Luis","Rodriguez Vázquez",72));
			listaPersonas.add(new Persona("Borja","López López",11));
			listaPersonas.add(new Persona("Lourdes","Neira Arias",62));
			listaPersonas.add(new Persona("Josefa","Martinez Seoane",57));
			
	//llamada al método de obtener personas cuyo nombre comience por 'J'
			
			listaPersonasResultado = buscarPersonasQueEmpiecenPor(listaPersonas, 'J');
			for (int i = 0; i< listaPersonasResultado.size() ; i++)
			{
				System.out.println("Lista Personas cuyo nombre empieza por J :"+ listaPersonasResultado.get(i));	
			}	
			
	//Llamada al método de obtener personas con edad menor a 60 años
			
			listaPersonasResultado2 = buscarPersonasHastaEdad(listaPersonas, 60);
			for (int i = 0; i< listaPersonasResultado2.size() ; i++)
			{
				System.out.println("Lista Personas cuya edad es menor 60 : "+listaPersonasResultado2.get(i));	
			}	
			
	//Impresión de las Personas restantes en la lista por medio de un foreach y utilización del toString()
		
		for (Persona per : listaPersonasResultado2)
		{
			for (Persona per1 : listaPersonas)
			{
			if (listaPersonasResultado2.toString() != listaPersonas.toString())
					{
						System.out.println("Lista Personas cuya edad es mayor o igual a 60" + listaPersonas.toString());	
					}
			}
			
		}
		
		
		
	}//main
	public static ArrayList<Persona> buscarPersonasQueEmpiecenPor(ArrayList<Persona> arrayPersonas, char b )
	{
		ArrayList<Persona> arrayPersonas1 = new ArrayList<>();
		int j = 0;
		for (int i= 0; i < arrayPersonas.size(); i++)
		{
			Persona p=arrayPersonas.get(i);  //devuelve un tipo Persona del arraylist
			String nombre=p.getNombre();	//getNombre() devuelve el campo nombre de Persona
			char caracter=nombre.charAt(0);   // charAt(0) devuelve el primer caracter del nombre
			
			if (Character.compare(arrayPersonas.get(i).getNombre().charAt(0), b) == 0)
					{
						arrayPersonas1.add (j, arrayPersonas.get(i));
						j++;
					}
		}
			
		return arrayPersonas1;
	
	}//buscarPersonasQueEmpiecenPor
	
	/****************************** Apartado 2 ********************************************/
	
	public static ArrayList<Persona> buscarPersonasHastaEdad (ArrayList<Persona> listaPersonas, int e)
	{
		ArrayList<Persona> listaPersonas1 = new ArrayList<>();
		ArrayList<Persona> listaPersonas2 = new ArrayList<>();
		int j = 0;
		int k = 0;
		for (int i= 0; i < listaPersonas.size(); i++)
		{
			Persona p=listaPersonas.get(i);  //devuelve un tipo Persona del arraylist
			int edad = p.getEdad();	//getEdad() devuelve el campo edad de Persona
		
			
			if (listaPersonas.get(i).getEdad() < e)
			{
				listaPersonas1.add (j, listaPersonas.get(i));
				j++;
			}
			else
			{
				listaPersonas2.add (k, listaPersonas.get(i));
				k++;
			}
		}
		
		return listaPersonas1;
	}//buscarPersonasHastaEdad
	
	/*******************************************************************************************/
}//Bol5Ejer1
