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

		ArrayList<Persona> listaPersonasJ = new ArrayList<>();

			ArrayList<Persona> listaPersonas= new ArrayList<Persona>();
			listaPersonas.add(new Persona("Jose","Martinez Granda",55));
			listaPersonas.add(new Persona("Katy","Ruiz Gomez",24));
			listaPersonas.add(new Persona("Jose Manuel","Blanco Garrido",18));
			listaPersonas.add(new Persona("Jose Luis","Rodriguez Vázquez",72));
			listaPersonas.add(new Persona("Borja","López López",11));
			listaPersonas.add(new Persona("Lourdes","Neira Arias",62));
			listaPersonas.add(new Persona("Josefa","Martinez Seoane",57));
			
	//llamada al método de obtener personas cuyo nombre comience por 'J'
			
			listaPersonasJ = buscarPersonasQueEmpiecenPor(listaPersonas, 'J');
			for (int i = 0; i< listaPersonasJ.size() ; i++)
			{
				System.out.println(listaPersonasJ.get(i));	
			}	
			
	//Llamada al método de obtener personas con edad menor a 60 años
			
	//Impresión de las Personas restantes en la lista por medio de un foreach y utilización del toString()
		
		
		
		
		
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
	
	public statid ArrayList<Persona> buscarPersonasHastaEdad (ArrayList<Persona> arrayPersonas, int edad)
	{
		ArrayList<Persona> arrayPersona
		
		
	}//buscarPersonasHastaEdad
	

}//Bol5Ejer1
