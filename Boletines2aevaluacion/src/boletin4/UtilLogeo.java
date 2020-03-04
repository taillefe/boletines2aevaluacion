package boletin4;

public class UtilLogeo {
	
	
	
	public Usuario realizarLogin(String n, String p)
	{
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
			if (arrayUsuarios[i] == u)
			{
				
			}
			else
			
		}
		
		
		return u;
		
	}

}
