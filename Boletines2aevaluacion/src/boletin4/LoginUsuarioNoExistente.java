package boletin4;

public class LoginUsuarioNoExistente extends IllegalArgumentException {
	
	LoginUsuarioNoExistente (String mensaje)
	{
		super(mensaje);
	}

}
