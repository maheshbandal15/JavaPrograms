package concepts.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Rectangle> arr = new ArrayList<Rectangle>();

		arr.add(new Rectangle(2, 4));
		arr.add(new Rectangle(3, 3));
		arr.add(new Rectangle(4, 5));
		arr.add(new Rectangle(1, 2));
		arr.add(new Rectangle(6, 7));
		arr.add(new Rectangle(2, 8));

		Collections.sort(arr);

		for (Rectangle r : arr) {
			// System.out.println(r.getArea());
		}

		Collections.sort(arr, new Comparator<Rectangle>() {

			public int compare(Rectangle o1, Rectangle o2) {
				if (o1.getLength() < o2.getLength()) {
					return -1;
				} else if (o1.getLength() > o2.getLength()) {
					return 1;
				}
				return 0;

			}
		});

		for (Rectangle r : arr) {
			System.out.println(r.getArea());
		}

		// ArrayList<Integer> arr = new ArrayList<Integer>();
		//
		// arr.add(10);
		// arr.add(40);
		// arr.add(20);
		// arr.add(60);
		// arr.add(10);
		//
		// System.out.println(arr.size());
		//
		// System.out.println(arr.get(3));
		//
		// for (Integer i : arr) {
		// System.out.println(i);
		// }
		//
		// Collections.sort(arr);
		//
		// for (Integer i : arr) {
		// System.out.println(i);
		// }

	}

}
