package studio7;

public class fraction {

	private int num;
	private int den;

	public fraction(int n, int d) {
		num = n;
		den = d;
	}

	public fraction add(fraction f) {
		int n = f.den*this.num + this.den*f.num;
		int d = f.den*this.den;
		return new fraction(n,d);
	}

	public fraction multiply(fraction f) {
		int n = f.num*this.num;
		int d = f.den*this.den;
		return new fraction(n,d);
	}
	public fraction reciprocal() {
		int n=den;
		int d = num;
		return new fraction(n,d);

	}



	public static int gcd(int p, int q) {

		if(p%q == 0) {
			return q;
		} else {
			return gcd(q,p % q);

		}
	}
	public fraction simp() {
		int gcd = gcd(num,den);
		int n = num/gcd;
		int d = den/gcd;
		
		return new fraction(n,d);
	}

}
