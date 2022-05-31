package Calculatrice;

import Utils.configuration;
import exception.CalculatriceException;

public class operateurFactory {

	public static operateur getobjet(String op) throws CalculatriceException {
		
			return configuration.getop(op);
				
	}
}
