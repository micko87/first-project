import java.util.Scanner;

/**
 *   File Name: GradeAverage.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 26, 2016
 *
 */

/**
 * GradeAverage //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class GradeAverage {

	static double avgGrade;
	/**
	 * @param args
	 */

	static double count;
	static boolean hasMoreNumbers;
	static double totalSum;

	public static void main(String[] args) {
		// Create a loop which keeps executing until condition is false

		double count = 0;
		double total = 0;
		double sum = 0;
		double average;

		Scanner scanner = new Scanner(System.in);

		boolean hasMoreNumbers = true;
		while (hasMoreNumbers) {
			// Add grade value to totalSum of grades

			System.out.println("What is your Grade ");
			total = Double.parseDouble(scanner.nextLine());
			sum = sum + total; // sum += totals
			// ask user if they have more numbers
			System.out.println("Do you have more number? (Yes/Y or (No/n))");

			// gather user input into variable input
			String input = scanner.nextLine();

			// Evaluate input to see if they say yes
			if (input.equalsIgnoreCase("Yes") || input.equalsIgnoreCase("Y"))
				hasMoreNumbers = true;
			else if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n"))
				hasMoreNumbers = false;
			count++;

			// If they do say yes, set hasMoreNumbers to false
		}
		average = sum / count;

		System.out.println("The average of the grades is: " + average);
	}

}
