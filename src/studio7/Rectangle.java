package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	
	private double width;
	private double height;
	
	public Rectangle(double w,double h){
		width = w;
		height = h;
		
	}
	
	public double area() {
		return width*height;
	}
	public double perimeter() {
		return 2*width + 2* height;
		
	}
	public boolean isSquare() {
		if(width==height) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean smaller(Rectangle r) {
		if (this.area()<r.area()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void draw() {
		StdDraw.rectangle(0.5, 0.5, width/2, height/2);
	}
}
