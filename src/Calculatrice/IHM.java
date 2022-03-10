package Calculatrice;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import Utils.properties;

public class IHM {

	public static void donnees() throws IOException {
		
		
	  properties prop = new properties();
		
		Scanner scanner11 = new Scanner(System.in);

		prop.afficher("nombre1");

		double nombre1 = scanner11.nextDouble();

		Scanner scanner1 = new Scanner(System.in);

		prop.afficher("nombre2");;

		double nombre2 = scanner1.nextDouble();

		Scanner scanner = new Scanner(System.in);

		prop.afficher("operateur");;

		String operateur = scanner.next();

		Controller c = new Controller(nombre1, nombre2, operateur);
		c.verifier();

	}

}
