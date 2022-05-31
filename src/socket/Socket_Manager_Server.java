package socket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import Calculatrice.Controller;
import exception.CalculatriceException;

public class Socket_Manager_Server {
	Socket socket;
	Message msg;

	public void createSocket(int port) throws IOException, ClassNotFoundException {

		try (ServerSocket serverSocket = new ServerSocket(port)) {

			System.out.println("Server is listening on port " + port);

			while (true) {
				socket = serverSocket.accept();

				System.out.println("New client connected");

				ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
				// ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());

				msg = (Message) input.readObject();
				System.out.println("Le server recoit : " + msg);

				if (msg.getType() == TypeMessage.OPERATION) {
					Controller co = new Controller(msg.getOp().getd1(), msg.getOp().getd2(), msg.getOp().getOp());
					Message m = new Message(null, co.resultat(), null, TypeMessage.RESULTAT);
					// Uriliser un object message : Resultat, Exception
					ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
					output.writeObject(m);
				}
			}

		} catch (CalculatriceException e) {
			// TODO Auto-generated catch block
			System.out.println("Server exception: " + e.getMessage());
			Message m = new Message(msg.getOp(), 0, e, TypeMessage.EXCEPTION);
			ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
			// Uriliser un object message : Resultat, Exception
			output.writeObject(m);
		}
	}
}
