/**
 * @author Mr. Rasmussen
 */

package fracCalc;

import java.util.*;

public class FracCalc {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter here (\"quit\" to quit) : ");
		String input = console.nextLine();

		while (!input.equals("quit")) {
			produceAnswer(input);
			System.out.println("Please enter here (\"quit\" to quit) : ");
			input = console.nextLine();
		}

	}

	// TODO: Read the input from the user and call produceAnswer with an equation

	// ** IMPORTANT ** DO NOT DELETE THIS FUNCTION. This function will be used to
	// test your code
	// This function takes a String 'input' and produces the result
	//
	// input is a fraction string that needs to be evaluated. For your program, this
	// will be the user input.
	// e.g. input ==> "1/2 + 3/4"
	//
	// The function should return the result of the fraction after it has been
	// calculated
	// e.g. return ==> "1_1/4"
	public static String produceAnswer(String input) {
		// TODO: Implement this function to produce the solution to the input
		int spaceAt = input.indexOf(" ");
		int length = input.length();

		char operator = input.charAt(spaceAt + 1);
		String first = input.substring(0, spaceAt);
		String second = input.substring(spaceAt + 3, length);

		/*int wholeIndex = second.indexOf("_");
		if (wholeIndex == -1 && second.indexOf("/") == -1) {
			System.out.print("whole:" + second + " ");
		} else if (wholeIndex == -1 && second.indexOf("/") != -1) {
			System.out.print("whole:0 ");
		} else {
			System.out.print("whole:" + second.charAt(wholeIndex - 1) + " ");
		}

		int numerIndex = second.indexOf("/");
		if (numerIndex == -1 && second.indexOf("_") == -1) {
			System.out.print("numerator:0 ");
		} else if (numerIndex == -1 && second.indexOf("_") != -1) {
			System.out.print("numerator:0 ");
		} else if (numerIndex != -1 && second.indexOf("_") == -1) {
			System.out.print("numerator:" + second.substring(0, numerIndex) + " ");
		} else {
			System.out.print("numerator:" + second.substring(second.indexOf("_") + 1, second.indexOf("/")) + " ");
		}

		int denomIndex = second.indexOf("/");
		if (denomIndex == -1 && second.indexOf("_") == -1) {
			System.out.println("denominator:1");
		} else if (denomIndex == -1 && second.indexOf("_") != -1) {
			System.out.println("denominator:0");
		} else if (denomIndex != -1 && second.indexOf("_") == -1) {
			System.out.println("denominator:" + second.substring(denomIndex + 1, second.length()));
		} else {
			System.out.println("denominator:" + second.substring(denomIndex + 1, second.length()));
		} */
		
		return second;
		
		
		

	}

	// TODO: Fill in the space below with any helper methods that you think you will
	// need

}
