package concepts.demo;

public class Rectangle extends Shape implements Comparable<Rectangle> {

	private int length;
	private int breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		this.calculateArea();
	}

	public int getBreadth() {
		return breadth;
	}

	public int getLength() {
		return length;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void calculateArea() {
		this.area = this.length * this.breadth;
	}

	@Override
	public int compareTo(Rectangle o) {
		if (this.area < o.area) {
			return -1;
		} else if (this.area > o.area) {
			return 1;
		}
		return 0;
	}

}
