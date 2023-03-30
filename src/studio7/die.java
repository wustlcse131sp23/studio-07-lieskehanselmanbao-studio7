package studio7;

public class die {
	private int n;
	
	public die(int sides) {
		n=sides;
	}
	
	public int dieRoll() {
		return (int)(Math.random()*n+1);
	}

}
