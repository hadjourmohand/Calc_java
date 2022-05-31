package socket;

import java.io.Serializable;

public class Operation implements Serializable{
	
	 private Double d1;
	 private Double d2;
	 private String op;
	 public Operation(double d1,double d2, String op) {
		 this.d1=d1;
		 this.d2=d2;
		 this.op = op;
	 }


	  public Double getd1() {
	    return this.d1;
	  }
	  
	  public Double getd2() {
		    return this.d2;
		  }

	  public String getOp() {
		return op;
	}


	public void setOp(String op) {
		this.op = op;
	}


	public void setd1(final Double d1) {
	    this.d1 = d1;
	  }
	  
	  public void setd2(final Double d2) {
		    this.d2 = d2;
		  }


	  @Override
	  public String toString() {
	    return "Mes chiffres sont [d1=" + this.d1+ "d2= " +this.d2+ "] et Mon opération est op = " +this.op;
	  }

}
