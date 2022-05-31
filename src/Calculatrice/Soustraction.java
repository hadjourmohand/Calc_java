package Calculatrice;

import exception.CalculatriceException;

public class Soustraction implements operateur {

	

	@Override
	public Double calculer(double c1, double c2) throws CalculatriceException{
		return c1-c2;
	}
}
