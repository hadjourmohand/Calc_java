package socket;

import Calculatrice.IHM_Client;

public class Main_Client {

	public static void main(String[] args) throws Exception {
		
		IHM_Client client = new IHM_Client("localhost",6868);
		client.ReadSendData();
	}
}
