package Calculatrice;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.InputMismatchException;
import java.util.Scanner;

import Utils.properties;
import exception.CalculatriceException;
import exception.ExceptionEnum;
import socket.Message;
import socket.Operation;
import socket.Socket_Manager_Client;
import socket.TypeMessage;

public class IHM_Client {
	Socket_Manager_Client socket_manager;

	public IHM_Client(String hostname, int port) {
		socket_manager = new Socket_Manager_Client();
		socket_manager.CreateSocket(hostname, port);
	}

	public Operation donnees() throws Exception {
		try {
		properties prop = properties.getInstance();

		Scanner scanner11 = new Scanner(System.in);

		prop.afficher("nombre1");

		double nombre1 = scanner11.nextDouble();

		Scanner scanner1 = new Scanner(System.in);

		prop.afficher("nombre2");
		

		double nombre2 = scanner1.nextDouble();

		Scanner scanner = new Scanner(System.in);

		prop.afficher("operateur");

		String operateur = scanner.next();

		Operation c = new Operation(nombre1, nombre2, operateur);
		return c;
		}
		catch (InputMismatchException e) {
			throw new CalculatriceException(ExceptionEnum.SAISI_INCORRECT);
		}

	}

	public void ReadSendData() throws Exception {
		Operation op = this.donnees();
		Message msg = new Message(op, 0, null, TypeMessage.OPERATION);
		socket_manager.SendData(msg);

	}

}
