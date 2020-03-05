package boletin4;

import java.io.IOException;

public class LoginUsuarioNoExistente extends IllegalArgumentException {
	
	LoginUsuarioNoExistente (String mensaje)
	{
		super(mensaje);
	}

}
