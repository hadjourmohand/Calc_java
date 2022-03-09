package Calculatrice;

import java.util.Scanner;

public class IHM {

	public static void donnees() {

		Scanner scanner11 = new Scanner(System.in);

		System.out.println("Ecrire un nombre: ");

		double nombre1 = scanner11.nextDouble();

		Scanner scanner1 = new Scanner(System.in);

		System.out.print("Ecrire un second nombre: ");

		double nombre2 = scanner1.nextDouble();

		Scanner scanner = new Scanner(System.in);

		System.out.print("Saisir l'operateur: ");

		String operateur = scanner.next();

		Controller c = new Controller(nombre1, nombre2, operateur);
		c.verifier();

	}

}
