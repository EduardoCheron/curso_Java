package entities;

public class Product {

	public double width;	
	public double height;
	
	public double Area() {
		return width * height;
	}
	
	public double Perimeter() {
		return 2 * (width +  height);
	}
	
	public double Diagonal() {
		return Math.sqrt(width * width + height * height);
	}	
	public String toString() {
		return "Area: " +  String.format("%.2f", Area()) + ", Perimeter: " + String.format("%.2f", Perimeter()) + ", Diagonal: " + String.format("%.2f", Diagonal()); 	
	}

}
