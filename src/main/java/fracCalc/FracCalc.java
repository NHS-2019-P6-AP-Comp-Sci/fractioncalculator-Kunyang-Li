/**
 * @author Mr. Rasmussen
 */

package fracCalc;

import java.util.*;

public class FracCalc {

	public static String firstPart;
	public static String secondPart;
	public static String thirdPart;
	public static String first_Part;
	public static String second_Part;
	public static String third_Part;

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

		// second operand
		int wholeIndex = second.indexOf("_");
		if (wholeIndex == -1 && second.indexOf("/") == -1) {
			firstPart = "whole:" + second + " ";
		} else if (wholeIndex == -1 && second.indexOf("/") != -1) {
			firstPart = "whole:0 ";
		} else {
			firstPart = "whole:" + second.charAt(wholeIndex - 1) + " ";
		}

		int numerIndex = second.indexOf("/");
		if (numerIndex == -1 && second.indexOf("_") == -1) {
			secondPart = "numerator:0 ";
		} else if (numerIndex == -1 && second.indexOf("_") != -1) {
			secondPart = "numerator:0 ";
		} else if (numerIndex != -1 && second.indexOf("_") == -1) {
			secondPart = "numerator:" + second.substring(0, numerIndex) + " ";
		} else {
			secondPart = "numerator:" + second.substring(second.indexOf("_") + 1, second.indexOf("/")) + " ";
		}

		int denomIndex = second.indexOf("/");
		if (denomIndex == -1 && second.indexOf("_") == -1) {
			thirdPart = "denominator:1";
		} else if (denomIndex == -1 && second.indexOf("_") != -1) {
			thirdPart = "denominator:0";
		} else if (denomIndex != -1 && second.indexOf("_") == -1) {
			thirdPart = "denominator:" + second.substring(denomIndex + 1, second.length());
		} else {
			thirdPart = "denominator:" + second.substring(denomIndex + 1, second.length());
		}
		
		// first operand
		int whole_Index = first.indexOf("_");
		if (whole_Index == -1 && first.indexOf("/") == -1) {
			first_Part = "whole:" + first + " ";
		} else if (whole_Index == -1 && first.indexOf("/") != -1) {
			first_Part = "whole:0 ";
		} else {
			first_Part = "whole:" + first.charAt(whole_Index - 1) + " ";
		}

		int numer_Index = first.indexOf("/");
		if (numer_Index == -1 && first.indexOf("_") == -1) {
			second_Part = "numerator:0 ";
		} else if (numer_Index == -1 && first.indexOf("_") != -1) {
			second_Part = "numerator:0 ";
		} else if (numer_Index != -1 && first.indexOf("_") == -1) {
			second_Part = "numerator:" + first.substring(0, numer_Index) + " ";
		} else {
			second_Part = "numerator:" + first.substring(first.indexOf("_") + 1, first.indexOf("/")) + " ";
		}

		int denom_Index = first.indexOf("/");
		if (denom_Index == -1 && first.indexOf("_") == -1) {
			third_Part = "denominator:1";
		} else if (denom_Index == -1 && first.indexOf("_") != -1) {
			third_Part = "denominator:0";
		} else if (denom_Index != -1 && first.indexOf("_") == -1) {
			third_Part = "denominator:" + first.substring(denom_Index + 1, first.length());
		} else {
			third_Part = "denominator:" + first.substring(denom_Index + 1, first.length());
		}
		String ans2 = "";
		ans2 = firstPart + secondPart + thirdPart;

		String ans1 = "";
		ans1 = first_Part + second_Part + third_Part;
		return ans2;

	}

	// TODO: Fill in the space below with any helper methods that you think you will
	// need

}
