package concepts.demo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		Set<Triangle> hs = new HashSet<Triangle>();

		hs.add(new Triangle(2, 4));
		hs.add(new Triangle(3, 3));
		hs.add(new Triangle(4, 5));
		hs.add(new Triangle(1, 2));
		hs.add(new Triangle(6, 7));
		hs.add(new Triangle(2, 8));
		hs.add(new Triangle(4, 4));
		
		Triangle t = new Triangle(2, 4);
		
		System.out.println(t.toString());

	}

}
