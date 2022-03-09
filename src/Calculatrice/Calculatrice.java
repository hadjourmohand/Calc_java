package Calculatrice;

public class Calculatrice {

	private double d;
	private double e;

	public Calculatrice() {
		
	}



	public double additionner(double d, double e) {
		double r = d + e;
		System.out.println(r);
		return r;

	}
	public double soustraction(double d, double e) {
		double r = d - e;
		System.out.println(r);
		return r;
	}
	
	public double multiplication(double d, double e) {
		double r = d * e;
		System.out.println(r);
		return r;

	}
	
	public double division(double d, double e) {
		double r = d / e;
		System.out.println(r);
		return r;

	}
	

}
