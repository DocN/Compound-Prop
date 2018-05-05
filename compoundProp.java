/*
 * Author:   Ryan Chau
 * Course:   CPSC 2190, Fall 2011
 * Lab:	One
 * Compiler: JDK 7.0
 *
 *Class for compounding proposition P and Q by conjunction,disjunction,negation,implication and biconditional
 * Input: pP and pQ Propositions
 * Output: Compound pP and pQ by conjunction,disjunction,negation,implication and biconditional
 */

public class compoundProp {

	/*constructor compoundProp() function */
    public compoundProp() {

    }
	/*conjunction function returns the compound proposition p and q by conjunction */
    public String conjunction (String p,String q) {
		return (p + " and " + q);
    }

	/*disjunction function returns the compound proposition p and q by disjunction */
    public String disjunction(String p,String q) {
		return (p + " or " + q);
    }

	/*negation function returns the compound proposition p and q by negation */
    public String negation (String p, String q) {
    	p = p.toLowerCase();
    	q = q.toLowerCase();

    	return ("It is not the case that " + p + " and " + q);
	}

	/*implication function returns the compound proposition p and q by implication */
	public String implication (String p, String q) {
		return (p + " so " + q);
	}

	/*biconditional function returns the compound proposition p and q by biconditional */
	public String biconditional (String p, String q) {
		return (p + " if and only if " + q);
	}




}