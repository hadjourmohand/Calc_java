package Utils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public final class properties {

	private static volatile properties INSTANCE;

	private properties() {
		if (INSTANCE != null) {
			throw new IllegalStateException("Already initialized.");
		}
	}

	public static properties getInstance() {
		var result = INSTANCE;
		// Check if singleton instance is initialized.
		// If it is initialized then we can return the instance.
		if (result == null) {
			// It is not initialized but we cannot be sure because some other thread might
			// have
			// initialized it in the meanwhile.
			// So to make sure we need to lock on an object to get mutual exclusion.
			synchronized (properties.class) {
				// Again assign the instance to local variable to check if it was initialized by
				// some
				// other thread while current thread was blocked to enter the locked zone.
				// If it was initialized then we can return the previously created instance
				// just like the previous null check.
				result = INSTANCE;
				if (result == null) {
					// The instance is still not initialized so we can safely
					// (no other thread can enter this zone)
					// create an instance and make it our singleton instance.
					INSTANCE = result = new properties();
				}
			}
		}
		return result;
	}

	public void afficher(String cle) throws IOException {
		configuration conf = new configuration();

		File doc = null;

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
