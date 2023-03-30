package studio7;

public class Complex {
	
	private double r;
	private double i;
	
	public Complex(double real, double imaginary) {
		r = real;
		i = imaginary;
	}
	
	public Complex add(Complex c) {
		double imag = this.i+c.i;
		double real = this.r+c.r;
		return new Complex(real,imag);
	}
	
	public Complex mult(Complex c) {
		double imag = this.r*c.i+this.i*c.r;
		double real = this.r*c.r-this.i*c.i;
		return new Complex(real,imag);
	}

}
