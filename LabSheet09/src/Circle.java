
public class Circle {

	public static final double DEFAULT_RADIUS = 1.8;
	public static final String DEFAULT_COLOR = "red";
	
	private double radius;
	private String color;
	
	//1st Constructor
	Circle(){
		this.radius = DEFAULT_RADIUS;
		this.color = DEFAULT_COLOR;
	}
	
	//2nd Constructor
	Circle(double radius){
		this.radius = radius;
		this.color = DEFAULT_COLOR;
	}
	
	//3rd Constructor
	Circle(double radius, String color){
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return this.color;
	}
		
	public void setColor(String getColor) {
		this.color = color;
	}	
		
	public String toString() {
		return "Circle[radius = "+radius + ",color="+color + "]";
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getCircumference() {
		return 2.0 * Math.PI * getRadius();
	}
	
	

	

}
