package Calculatrice;

import exception.CalculatriceException;

public interface operateur {

	Double calculer(double c1, double c2) throws CalculatriceException;

}
