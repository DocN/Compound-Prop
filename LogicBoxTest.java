/*
 * Author:   Ryan Chau
 * Course:   CPSC 2190, Fall 2011
 * Lab:	One
 * Compiler: JDK 7.0
 *
 *Class for testing compound truth and compound propositions
 * Input: pP and pQ Proposition Truth Values
 * Output: Compound truth values of pP and pQ by conjunction,disjunction,negation,implication and biconditional
 */

import java.util.Scanner;

public class LogicBoxTest {

	public static void main (String [] args) {
		//Ask user for propositions and there truths (store into variables)
		storage testProp = new storage(askProp("P"), askProp("Q"));

		//create truth table and compound proposition
		compoundTruth compoundTruth = new compoundTruth();
		compoundProp compoundProp = new compoundProp();

		//ask user for proposition p and q as well as there truth values
		testProp.addTruthP(askTruth(testProp.getPropP()));
		testProp.addTruthQ(askTruth(testProp.getPropQ()));


		//output compound propositions
		System.out.println ("Conjunction proposition: " + compoundProp.conjunction(testProp.getPropP(),testProp.getPropQ()));
		System.out.println ("Disjunction proposition: " + compoundProp.disjunction(testProp.getPropP(),testProp.getPropQ()));
		System.out.println ("Negation proposition: " + compoundProp.negation(testProp.getPropP(),testProp.getPropQ()));
		System.out.println ("Implication proposition: " + compoundProp.implication(testProp.getPropP(),testProp.getPropQ()));
		System.out.println ("Biconditional proposition: " + compoundProp.biconditional(testProp.getPropP(),testProp.getPropQ()));

		//outout compound truth values
		System.out.println ("Conjunction Truth Value: " + compoundTruth.conjunction(testProp.getTruthP(),testProp.getTruthQ()));
		System.out.println ("Disjunction Truth Value: " + compoundTruth.disjunction(testProp.getTruthP(),testProp.getTruthQ()));
		System.out.println ("Negation Truth Value: " + compoundTruth.negation(testProp.getTruthP(),testProp.getTruthQ()));
		System.out.println ("Implication Truth Value: " + compoundTruth.implication(testProp.getTruthP(),testProp.getTruthQ()));
		System.out.println ("Biconditional Truth Value: " + compoundTruth.biconditional(testProp.getTruthP(),testProp.getTruthQ()));
	}
	/*ask user for a proposition */
	private static String askProp(String letter) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter Proposition " + letter);
		return input.nextLine();
	}

	/*ask user for truth values of proposition prop */
	private static boolean askTruth(String prop) {
		boolean repeater = true;
		Scanner input = new Scanner(System.in);

		//repeat until truth value is valid
		while (repeater == true) {
			System.out.println("What is the degree of truth value (between 0 and 1) of the proposition  " + prop);
			String truthValueInput = input.nextLine();
			//check if input is true or t
			try {
				float truth = Float.valueOf(truthValueInput).floatValue();
				System.out.println(truth);
			catch (NumberFormatException nfe) {

			}
 				}
			}
			if((truthValueInput.toLowerCase()).equals("true") || (truthValueInput.toLowerCase()).equals("t") ) {
				repeater = false;
				return true;
			}
			//check if input is false or f
			else if((truthValueInput.toLowerCase()).equals("false") || (truthValueInput.toLowerCase()).equals("f") ) {
				repeater = false;
				return false;
			}
			else {
				//invalid input error repeat
				System.out.println("Invalid input please try again");
			}
		}
		return true;
	}


}