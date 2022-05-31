package Calculatrice;

import java.io.IOException;

import Utils.properties;
import exception.CalculatriceException;

public class Controller {

	private double nombre1;
	private double nombre2;
	private String operateur;

	public Controller(double nombre1, double nombre2, String operateur) {
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
		this.operateur = operateur;
	}

	public double resultat() throws CalculatriceException {
		operateur obj = operateurFactory.getobjet(operateur);
		properties prop = properties.getInstance();
		try {
			prop.afficher("result");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(obj.calculer(nombre1, nombre2));
		return obj.calculer(nombre1, nombre2);

	}

}
