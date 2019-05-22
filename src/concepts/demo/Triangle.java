package concepts.demo;

public class Triangle extends Shape {

	private int base, height;

	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
		this.calculateArea();

	}

	@Override
	public void calculateArea() {
		this.area = 0.5 * this.base * this.height;

	}

	public int getBase() {
		return base;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public String toString() {

		return "Area of triangle = " + this.area;
	}

}
