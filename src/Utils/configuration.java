package Utils;

import Calculatrice.Addition;
import Calculatrice.Division;
import Calculatrice.Multiplication;
import Calculatrice.Soustraction;
import Calculatrice.operateur;
import exception.CalculatriceException;
import exception.ExceptionEnum;

public class configuration {
	String lang = "FR";

	public String getlang() {
		return lang;
	}

	public static operateur getop(String op) throws CalculatriceException {
		if (op.equals("+")) {
			return new Addition();

		} else if (op.equals("-")) {
			return new Soustraction();

		}

		else if (op.equals("*")) {
			return new Multiplication();

		}

		else if (op.equals("/")) {
			return new Division();

		}
		else {
			throw new CalculatriceException(ExceptionEnum.OPERATEUR_NON_DEFINI); 
		}
	}
}
