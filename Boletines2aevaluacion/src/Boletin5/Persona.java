package Boletin5;

public class Persona {

	
		private String nombre;
		private String apellidos;
		private int edad;
		
		public Persona(String nombre, String apellidos, int edad)
		{
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
		}//Persona
		
		public String getNombre() {
		return nombre;
		}//getNombre
		
		public String getApellidos() {
		return apellidos;
		}//getApellidos
		
		public int getEdad() {
		return edad;
		}//getEdad
		
		
		@Override    	// sobreescribo este metodo para poder imprimir todo el objeto persona de una vez
		public String toString() {
		
		return nombre.toString()+ " "+ apellidos.toString() +" " + getEdad();
	
		}
}//class

	
	

