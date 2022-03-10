package Utils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class properties {
	public static void main(String[] args) throws Exception {
		properties word = new properties();
		word.afficher("title");

	}

	public void afficher(String cle) throws IOException {
		configuration conf = new configuration();
       
		File doc=null;
		
		if (conf.getlang().equals("FR")) {
		 doc = new File("./src/Utils/properties");
       }
       
		else if (conf.getlang().equals("AN")) {
		 doc = new File("./src/Utils/properties_AN");
       }

		
		Scanner obj = new Scanner(doc);
		String mot = "";
		while (obj.hasNextLine()) {
			String word = obj.nextLine();

			mot += word;
			mot += ":";

		}

		String[] words = mot.split(":");
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(cle)) {
				System.out.println(words[i + 1]);
				return;
			}

		}

	}
}
