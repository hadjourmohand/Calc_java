package exception;

import java.io.Serializable;

public class CalculatriceException extends Exception implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CalculatriceException(ExceptionEnum exception) {
		super("Exception: " + exception);
		
	}
}
