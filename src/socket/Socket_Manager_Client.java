package socket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Socket_Manager_Client {
	public Socket socket;

	public void CreateSocket(String hostname, int port) {
		try {
			socket = new Socket(hostname, port);
			System.out.println("Le client : Je viens de me connecte");

		} catch (IOException ex) {

			System.out.println("I/O error: " + ex.getMessage());
		}
	}
	public void SendData(Message msg) {
		// ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
		ObjectOutputStream output;
		try {
			output = new ObjectOutputStream(socket.getOutputStream());
			
			// Utiliser Message : attribut

			System.out.println("Le client va envoyer : " + msg);
			
			output.writeObject(msg);

			ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
			// ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
			Message m = (Message) input.readObject();
			System.out.println("Le client recoit : " + m);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Client exception: " + e.getMessage());
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Client exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
