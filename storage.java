/*
 * Author:   Ryan Chau
 * Course:   CPSC 2190, Fall 2011
 * Lab:	One
 * Compiler: JDK 7.0
 *
 *Class for storing the propositions P and Q and there Truth Values
 * Input: proposition P, proposition Q and there truth values
 * Output: proposition P, proposition Q and there truth values
 */

public class storage {

	/*storage function stores the function pP and pQ */
    public storage(String pP,String pQ) {
		propP = pP;
		propQ = pQ;

    }
	/* getPropP returns the propP*/
    public String getPropP() {
    	return propP;
    }

	/* getPropQ returns the propQ*/
    public String getPropQ() {
    	return propQ;
    }

	/* getTruthP returns the truthP*/
    public float getTruthP() {
    	return truthP;
    }
	/* getTruthQ returns the truthQ*/
    public float getTruthQ() {
    	return truthQ;
    }

    /* addTruthP adds truth value to storage truthP*/
    public void addTruthP(float truth) {
    	truthP = truth;
    }
	/* addTruthQ adds truth value to storage truthQ*/
    public void addTruthQ(float truth) {
    	truthQ = truth;
    }


	//storage variables
    private String propP;
    private String propQ;
    private float truthP;
    private float truthQ;
    private String propT;
    private boolean truthT;

}