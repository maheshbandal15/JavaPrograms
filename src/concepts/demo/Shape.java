package concepts.demo;

public abstract class Shape {
	protected double area;

	public abstract void calculateArea();

	public double getArea() {
		return area;
	}

	public double calculateCost(String color) {
		if (color.equals("blue")) {
			return 5 * this.area;
		} else if (color.equals("red")) {
			return 10 * this.area;
		} else if (color.equals("green")) {
			return 15 * this.area;
		} else {
			return 0;
		}
	}

}
