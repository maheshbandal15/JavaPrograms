package technicalRound;

import java.util.Scanner;

/**
 * @author MAHESH BANDAL 18-May-2019
 * Given an integer n Print Diamond Pattern in Numbers Program.
 * input : 4
 * Output:
 *       1
 *     2 1 2
 *   3 2 1 2 3
 * 4 3 2 1 2 3 4
 * 	 3 2 1 2 3
 * 	   2 1 2
 * 		 1 
 */
public class JustDialQuestionThree {

	void display(int n) {
		// sp stands for space
		// num stands for number
		int sp = n / 2, num = 1;
		// Outer for loop for number of lines
		for (int i = 1; i <= n; i++) {
			// Inner for loop for printing space
			for (int j = 1; j <= sp; j++)
				System.out.print("  ");
			// Inner for loop for printing number
			int count = num / 2 + 1;
			for (int k = 1; k <= num; k++) {
				System.out.print(count+" ");
				if (k <= num / 2)
					count--;
				else
					count++;
			}
			System.out.println();
			if (i <= n / 2) {
				sp--; // sp decreased by 1
				num += 2; // num increased by 2
			} else {
				sp++; // sp increased by 1
				num -= 2; // num decreased by 2
			}
		}
	}

	public static void main(String[] args) {
		JustDialQuestionThree obj = new JustDialQuestionThree();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		obj.display(n * 2 - 1);
		scan.close();
	}

}
