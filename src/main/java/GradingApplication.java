/**
 *   File Name: GradingApplication.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 26, 2016
 *
 */

/**
 * GradingApplication //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author      LastName, FirstName
 * @version     1.0.0
 * @since       1.0
 *
 */

import java.util.Scanner;

public class GradingApplication {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// Local variable
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your Grade ");

		int num = Integer.parseInt(scanner.nextLine());

		if (num >= 90 && num <= 100) {
			System.out.println("A");
		} else if (num <= 89 && num >= 80) {
			System.out.println("B");
		} else if (num <= 79 && num >= 70) {
			System.out.println("C");
		} else if (num <= 69 && num < 60) {
			System.out.println("D");
		} else if (num == 59) {
			System.out.println("F");

		} else {

		}

	}
}