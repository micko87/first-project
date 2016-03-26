/**
 *   File Name: Monthcount.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 26, 2016
 *
 */

/**
 * Monthcount //ADDD (description of class)
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

public class Monthcount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Local variable
		int num;
		String input;

		Scanner scanner;
		scanner = new Scanner(System.in);
		System.out.println("Please supply number");
		input = scanner.nextLine();
		num = Integer.parseInt(input);

		// Switch statement
		switch (num) {

		case 1:
			System.out.println("Janaury");
			break;
		case 2:
			System.out.println("Feburary");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("Demember");
			break;
		}

	}

}
