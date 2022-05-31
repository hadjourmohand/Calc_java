package socket;

import java.io.Serializable;

import exception.CalculatriceException;

public class Message implements Serializable{
	
	Operation op;
	double result;
	CalculatriceException exception;
	TypeMessage type = TypeMessage.OPERATION;
	public Message(Operation op, double result, CalculatriceException exception, TypeMessage type) {
		this.op = op;
		this.result=result;
		this.exception = exception;
		this.type = type;
	}
	
	public Operation getOp() {
		return op;
	}

	public void setOp(Operation op) {
		this.op = op;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public CalculatriceException getException() {
		return exception;
	}

	public void setException(CalculatriceException exception) {
		this.exception = exception;
	}

	public TypeMessage getType() {
		return type;
	}

	public void setType(TypeMessage type) {
		this.type = type;
	}

	@Override
	public String toString() {
		if(type == TypeMessage.OPERATION)
				return "Mes chiffres sont [d1=" + op.getd1()+ "d2= " +op.getd2()+ "] et Mon opération est op = " +op.getOp();
		else if(type == TypeMessage.RESULTAT) {
			return "Résultat = " + result;
		}
		else
			return exception.getMessage();
	}

}
