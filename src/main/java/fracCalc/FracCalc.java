/**
 * @author Mr. Rasmussen
 */

package fracCalc;

import java.util.*;

public class FracCalc {

	public static int firstPart;
	public static int secondPart;
	public static int thirdPart;
	public static int first_Part;
	public static int second_Part;
	public static int third_Part;
	public static int first_top;
	public static int second_top;
	public static int top;
	public static int bottom;
	public static String finalAnswer;
	
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

		// first operand
		int whole_Index = first.indexOf("_");
		if (whole_Index == -1 && first.indexOf("/") == -1) {
			first_Part = Integer.parseInt(first);
		} else if (whole_Index == -1 && first.indexOf("/") != -1) {
			first_Part = 0;
		} else {
			first_Part = Integer.parseInt(first.substring(0, first.indexOf("_")));
		}

		int numer_Index = first.indexOf("/");
		if (numer_Index == -1 && first.indexOf("_") == -1) {
			second_Part = 0;
		} else if (numer_Index == -1 && first.indexOf("_") != -1) {
			second_Part = 0;
		} else if (numer_Index != -1 && first.indexOf("_") == -1) {
			second_Part = Integer.parseInt(first.substring(0, numer_Index));
		} else {
			second_Part = Integer.parseInt(first.substring(first.indexOf("_") + 1, first.indexOf("/")));
		}

		int denom_Index = first.indexOf("/");
		if (denom_Index == -1 && first.indexOf("_") == -1) {
			third_Part = 1;
		} else if (denom_Index == -1 && first.indexOf("_") != -1) {
			third_Part = 0;
		} else if (denom_Index != -1 && first.indexOf("_") == -1) {
			third_Part = Integer.parseInt(first.substring(denom_Index + 1, first.length()));
		} else {
			third_Part = Integer.parseInt(first.substring(denom_Index + 1, first.length()));
		}

		// second operand
		int wholeIndex = second.indexOf("_");
		if (wholeIndex == -1 && second.indexOf("/") == -1) {
			firstPart = Integer.parseInt(second);
			;
		} else if (wholeIndex == -1 && second.indexOf("/") != -1) {
			firstPart = 0;
		} else {
			firstPart = Integer.parseInt(second.substring(0, second.indexOf("_")));
		}

		int numerIndex = second.indexOf("/");
		if (numerIndex == -1 && second.indexOf("_") == -1) {
			secondPart = 0;
		} else if (numerIndex == -1 && second.indexOf("_") != -1) {
			secondPart = 0;
		} else if (numerIndex != -1 && second.indexOf("_") == -1) {
			secondPart = Integer.parseInt(second.substring(0, numerIndex));
		} else {
			secondPart = Integer.parseInt(second.substring(second.indexOf("_") + 1, second.indexOf("/")));
		}

		int denomIndex = second.indexOf("/");
		if (denomIndex == -1 && second.indexOf("_") == -1) {
			thirdPart = 1;
		} else if (denomIndex == -1 && second.indexOf("_") != -1) {
			thirdPart = 0;
		} else if (denomIndex != -1 && second.indexOf("_") == -1) {
			thirdPart = Integer.parseInt(second.substring(denomIndex + 1, second.length()));
		} else {
			thirdPart = Integer.parseInt(second.substring(denomIndex + 1, second.length()));
		}
		
		String ans1 = "";
		ans1 = "whole:" + first_Part + " numerator:" + second_Part + " denominator: " + third_Part;
		String ans2 = "";
		ans2 = "whole:" + firstPart + " numerator:" + secondPart + " denominator:" + thirdPart;
		
		if (first_Part < 0) {
			first_top = ((first_Part * third_Part) - second_Part);
		} else {
			first_top = ((first_Part * third_Part) + second_Part);
		}
		int first_bottom = third_Part;

		if (firstPart < 0) {
			second_top = ((firstPart * thirdPart) - secondPart);
		} else {
			second_top = ((firstPart * thirdPart) + secondPart);
		}
		int second_bottom = thirdPart;

		if (first_bottom != second_bottom) {
			if (operator == '+') {
				top = (first_top * second_bottom) + (second_top * first_bottom);
				bottom = (first_bottom * second_bottom);
			} else if (operator == '-') {
				top = (first_top * second_bottom) - (second_top * first_bottom);
				bottom = (first_bottom * second_bottom);
			} else if (operator == '*') {
				top = (first_top * second_top);
				bottom = (first_bottom * second_bottom);
			} else {
				top = (first_top * second_bottom);
				bottom = (first_bottom * second_top);
			}
		} else {
			if (operator == '+') {
				top = (first_top + second_top);
				bottom = second_bottom;
			} else if (operator == '-') {
				top = (first_top - second_top);
				bottom = second_bottom;
			} else if (operator == '*') {
				top = (first_top * second_top);
				bottom = (first_bottom * second_bottom);
			} else {
				top = (first_top * second_bottom);
				bottom = (first_bottom * second_top);	
			}
		}
		System.out.println(top);
		System.out.println(bottom);
		
		if (top % bottom == 0) {
			finalAnswer = top / bottom + "";
		} else if (first_top == second_top && first_bottom == second_bottom) {
				finalAnswer = first_top + "/" + (first_bottom / 2);
		} else {
			if ((top / bottom) == 0) {
				finalAnswer = (top % bottom) + "/" + bottom;
			} else {
				finalAnswer = (top / bottom) + "_" + Math.abs((top % bottom)) + "/" + Math.abs(bottom);
			}
		}
		System.out.println(finalAnswer);
		return finalAnswer;
	}

	// TODO: Fill in the space below with any helper methods that you think you will
	// need

}
