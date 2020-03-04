package boletin4;

public class LoginUsuarioPassErroneo extends IllegalArgumentException{
	
	LoginUsuarioPassErroneo (String mensaje)
	{
		super(mensaje);
	}

}
