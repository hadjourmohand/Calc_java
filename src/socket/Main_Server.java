package socket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import Calculatrice.Controller;


public class Main_Server {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Socket_Manager_Server server = new Socket_Manager_Server();
		server.createSocket(6868);
	}
}
