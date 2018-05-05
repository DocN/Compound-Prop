/*
 * Author:   Ryan Chau
 * Course:   CPSC 2190, Fall 2011
 * Lab:	One
 * Compiler: JDK 7.0
 *
 *Class for creating and storing truth value tables
 * Input: None
 * Output: truth value tables for conjunction,disjunction,negation, implication and biconditional
 */

public class truthTables {

	/*constructor TruthTables creates tables for conjunction,disjunction,negation, implication and biconditional */
    public truthTables() {
		conjunctionTable = new boolean[3][4];
		setconjunctionTable();

		disjunctionTable = new boolean[3][4];
		setdisjunctionTable();

		negationTable = new boolean[2][2];
		setNegationTable();

		implicationTable = new boolean[3][4];
		setImplicationTable();

		biconditionalTable = new boolean[3][4];
		setBiconditionalTable();

    }
    /*conTable outputs a conjunction Table */
	public boolean[][] conTable () {
		return conjunctionTable;
	}
	 /*disTable outputs a disjunction Table */
	public boolean[][] disTable () {
		return disjunctionTable;
	}
	/*negtable outputs a negation Table */
	public boolean[][] negTable () {
		return negationTable;
	}
	/*implTable outputs a implication Table */
	public boolean[][] implTable () {
		return implicationTable;
	}

	/*biTable outputs a biconditional Table */
	public boolean[][] biTable () {
		return biconditionalTable;
	}

	/*setconjunctionTable sets up a the values of the conjunction Table */
    private void setconjunctionTable() {
     	conjunctionTable[0][0] = true;
		conjunctionTable[1][0] = true;
		conjunctionTable[2][0] = true;

    	conjunctionTable[0][1] = true;
  		conjunctionTable[1][1] = false;
		conjunctionTable[2][1] = false;


		conjunctionTable[0][2] = false;
		conjunctionTable[1][2] = true;
		conjunctionTable[2][2] = false;

		conjunctionTable[0][3] = false;
		conjunctionTable[1][3] = false;
		conjunctionTable[2][3] = false;
    }
    /*setdisjunctionTable sets up a the values of the disjunction Table */
    private void setdisjunctionTable() {
    	disjunctionTable[0][0] = true;
		disjunctionTable[1][0] = true;
		disjunctionTable[2][0] = true;

    	disjunctionTable[0][1] = true;
		disjunctionTable[1][1] = false;
		disjunctionTable[2][1] = true;

		disjunctionTable[0][2] = false;
		disjunctionTable[1][2] = true;
		disjunctionTable[2][2] = true;

		disjunctionTable[0][3] = false;
		disjunctionTable[1][3] = false;
		disjunctionTable[2][3] = false;
    }
	/*setNegationTable sets up a the values of the Negation Table */
    private void setNegationTable() {
    	negationTable[0][0] = true;
		negationTable[1][0] = false;

    	negationTable[0][1] = false;
		negationTable[1][1] = true;
    }
	/*setImplicationTable sets up a the values of the implication Table */
    private void setImplicationTable() {
     	implicationTable[0][0] = true;
		implicationTable[1][0] = true;
		implicationTable[2][0] = true;

    	implicationTable[0][1] = true;
		implicationTable[1][1] = false;
		implicationTable[2][1] = false;

		implicationTable[0][2] = false;
		implicationTable[1][2] = true;
		implicationTable[2][2] = true;

		implicationTable[0][3] = false;
		implicationTable[1][3] = false;
		implicationTable[2][3] = true;
    }

    /*setBiconditionalTable sets up a the values of the bicondtional Table */
    private void setBiconditionalTable() {
     	biconditionalTable[0][0] = true;
		biconditionalTable[1][0] = true;
		biconditionalTable[2][0] = true;

    	biconditionalTable[0][1] = true;
		biconditionalTable[1][1] = false;
		biconditionalTable[2][1] = false;

		biconditionalTable[0][2] = false;
		biconditionalTable[1][2] = true;
		biconditionalTable[2][2] = false;

		biconditionalTable[0][3] = false;
		biconditionalTable[1][3] = false;
		biconditionalTable[2][3] = true;
    }

	//set values of truth value tables
    private boolean [][]conjunctionTable;
    private boolean [][]disjunctionTable;
    private boolean [][]negationTable;
    private boolean [][]implicationTable;
    private boolean [][]biconditionalTable;

}