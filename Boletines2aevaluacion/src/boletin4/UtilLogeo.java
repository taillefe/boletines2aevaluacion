package boletin4;

public class UtilLogeo {
	
	
	
	public Usuario realizarLogin(String n, String p) 
	{
		boolean existeUsuario = false;
		
		Usuario u = new Usuario (n,p);
		
		Usuario[] arrayUsuarios = {
				new Usuario("fer1", "123456"),
				new Usuario("luis86", "000000"),
				new Usuario("ana_cps2002", "AzLmR56"),
				new Usuario("MariaFernandez", "655786995"),
				new Usuario("JZm46Y","zxcvbnm"),
				new Usuario("___121aZ","qwerty"),
				new Usuario("M.Rajoy", "password"),
				new Usuario("", "666666")
		};
		
		for (int i= 0; i < arrayUsuarios.length; i++)
		{
			if  (arrayUsuarios[i].nombre.equals(u.nombre))   //para comparar dos string mejor con equal o compare
			{
				// Existe el usuario y está en la posicion i
			 	existeUsuario = true;
			 	if (arrayUsuarios[i].password.equals(u.password))
			 	{
			 		// la contraseña para ese usuario es correcta
			 		// todo bien y devuelve el usuario
			 		System.out.println("Usuario y password correctos "+ u.nombre +" "+u.password);
			 		
			 		return u;
			 	}
			 	else
			 	{
			 		throw new LoginUsuarioPassErroneo("La contraseña introducida por el usuario "+ u.nombre 
			 				+ " es incorrecta");
			 	
			 	}
			}
			
		}
		if (!existeUsuario)  // si no existe ese usuario
			
		{
			throw new LoginUsuarioNoExistente("No se ha encontrado al usuario "+ u.nombre);
		
		}
		System.out.println("Usuario y password correctos ");
		return u;
		
	}

}
