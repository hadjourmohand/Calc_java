package Calculatrice;

import java.io.IOException;

import Utils.properties;

public class Controller {
	
	properties prop = new properties();
	
	private double nombre1;
	private double nombre2;
	private String operateur;
	
	public Controller(double nombre1, double nombre2, String operateur) {
		this.nombre1= nombre1;
		this.nombre2=nombre2;
		this.operateur=operateur;
	}
	Calculatrice c = new Calculatrice();

		
	public double verifier() throws IOException {

	if (operateur.equals("/")) {
		if(nombre2==0) {
			prop.afficher("err0");
		    return 0;
		}
		else {
		return c.division(nombre1,nombre2);
		}
	}
	
	else if(operateur.equals("+")) {
		return c.additionner(nombre1,nombre2);
	}
	else if (operateur.equals("-")) {
	return c.soustraction(nombre1,nombre2);
	}
	
	else if (operateur.equals("*")) {
		return c.division(nombre1,nombre2);
	}
	
	prop.afficher("errop");
	return 0;
	
	
	
	}

}
