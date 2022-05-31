package Calculatrice;

import exception.CalculatriceException;
import exception.ExceptionEnum;

public class Division  implements operateur {

	@Override
	public Double calculer(double c1, double c2) throws CalculatriceException {
		if(c2 == 0)
			throw new CalculatriceException(ExceptionEnum.DEVISION_PAR_ZERO);
		return c1 / c2;
	}


}
