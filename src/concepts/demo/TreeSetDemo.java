package concepts.demo;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<Triangle> tr = new TreeSet<>(new Comparator<Triangle>() {
			@Override
			public int compare(Triangle o1, Triangle o2) {
				if (o1.getArea() < o2.getArea()) {
					return -1;
				} else if (o1.getArea() > o2.getArea()) {
					return 1;
				}
				return 0;
			}
		});

		tr.add(new Triangle(2, 4));
		tr.add(new Triangle(3, 3));
		tr.add(new Triangle(4, 5));
		tr.add(new Triangle(1, 2));
		tr.add(new Triangle(6, 7));
		tr.add(new Triangle(2, 8));
		tr.add(new Triangle(4, 4));

		System.out.println(tr.size());

		for (Triangle r : tr) {
			System.out.println(r.getArea());
		}

		// tr.add("a");
		// tr.add("r");
		// tr.add("b");
		// tr.add("c");
		// tr.add("g");
		// tr.add("t");
		// tr.add("w");
		// tr.add("a");
		//
		// System.out.println(tr.size());
		//
		// for(String s : tr){
		// System.out.println(s);
		// }

	}

}
