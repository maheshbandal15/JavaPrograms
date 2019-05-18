package technicalRound;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * @author MAHESH BANDAL
 * 18-May-2019
 * TODO :Given an array of int 123,54,23,96,765,9
 *         Arrange the numbers in such a way that it will be largest number. eg.
 *         input : 123,54,23,96,765,53 output : 96765545323123 \n
 * 
 *         The idea is to use any comparison based sorting algorithm. In the
 *         used sorting algorithm, instead of using the default comparison,
 *         write a comparison function myCompare() and use it to sort numbers.
 *         Given two numbers X and Y, how should myCompare() decide which number
 *         to put first – we compare two numbers XY (Y appended at the end of X)
 *         and YX (X appended at the end of Y). If XY is larger, then X should
 *         come before Y in output, else Y should come before. For example, let
 *         X and Y be 542 and 60. To compare X and Y, we compare 54260 and
 *         60542. Since 60542 is greater than 54260, we put Y first.
 */
public class JustDialQuestionOne {

	// The main function that prints the
	// arrangement with the largest value.
	// The function accepts a vector of strings
	static void printLargest(List<String> arr) {
		Collections.sort(arr, new Comparator<String>() {
			// A comparison function which is used by sort() in printLargest()
			@Override
			public int compare(String X, String Y) {
				// first append Y at the end of X
				String XY = X + Y;
				// then append X at the end of Y
				String YX = Y + X;
				// Now see which of the two formed numbers is greater
				return XY.compareTo(YX) > 0 ? -1 : 1;
			}
		});

		Iterator<String> it = arr.iterator();

		while (it.hasNext())
			System.out.print(it.next());

	}

	public static void main(String[] args) {
		 //output should be 6054854654
		List<String> arr = new ArrayList<String>();
        arr.add("54"); 
        arr.add("546"); 
        arr.add("548"); 
        arr.add("60"); 
        printLargest(arr); 
         
        // output should be 777776 
        /* arr.add("7"); 
        arr.add("776"); 
        arr.add("7"); 
        arr.add("7"); 
        */
          
        //output should be 998764543431 
        /*arr.add("1"); 
        arr.add("34"); 
        arr.add("3"); 
        arr.add("98"); 
        arr.add("9"); 
        arr.add("76"); 
        arr.add("45"); 
        arr.add("4"); 
        */
	}

}
