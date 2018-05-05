/*
 * Author:   Ryan Chau
 * Course:   CPSC 2190, Fall 2011
 * Lab:	One
 * Compiler: JDK 7.0
 *
 *Class for compounding truth values of P and Q by conjunction,disjunction,negation,implication and biconditional
 * Input: pP and pQ Proposition Truth Values
 * Output: Compound truth values of pP and pQ by conjunction,disjunction,negation,implication and biconditional
 */

public class compoundTruth {

    public compoundTruth() {
    }

    /*
    conjunction function compounds the conjunction truth values of the input pP and pQ
    */
    public boolean conjunction (boolean pP,boolean pQ) {
    	//create conjunction table
    	truthTables table = new truthTables();
    	boolean [][]conjunctionTable = table.conTable();

		int x = 0;
		int y = 0;
		//search through table compare pP and pQ with table until compound truth value is found
		while (x !=2 && y != 3) {
			if(conjunctionTable[x][y]  == pP &&  conjunctionTable[x+1][y] == pQ) {
				x += 2;
				return conjunctionTable[x][y];
			}
			x = 0;
			y += 1;
	}
	return false;

	}
    /*
    disjunction function compounds the disjunction truth values of the input pP and pQ
    */
    public boolean disjunction (boolean pP, boolean pQ) {
    	//create conjunction table
    	truthTables table = new truthTables();
    	boolean [][]disjunctionTable = table.disTable();
		int x = 0;
		int y = 0;

		//search through table compare pP and pQ with table until compound truth value is found
		while (x !=2 && y != 3) {
			if(disjunctionTable[x][y]  == pP &&  disjunctionTable[x+1][y] == pQ) {
				x += 2;
				return disjunctionTable[x][y];
			}
			x = 0;
			y += 1;
		}
		return false;

	}
    /*
    negation function compounds the negation truth values of the input pP and pQ
    */
    public boolean negation (boolean pP, boolean pQ) {
    	//negate pP and pQ
		pP = !pP;
		pQ = !pQ;

		//return conjunction of negation pP and pQ
		return conjunction (pP, pQ);

	}
    /*
    implication function compounds the implication truth values of the input pP and pQ
    */
    public boolean implication (boolean pP, boolean pQ) {
    	//create conjunction table
    	truthTables table = new truthTables();
    	boolean [][]implicationTable = table.implTable();
		int x = 0;
		int y = 0;

		//search through table compare pP and pQ with table until compound truth value is found
		while (x !=2 && y != 3) {
			if(implicationTable[x][y]  == pP &&  implicationTable[x+1][y] == pQ) {
				x += 2;
				return implicationTable[x][y];
			}
			x = 0;
			y += 1;
		}
		return false;

	}
	/*
    bicondtional function compounds the biconditional truth values of the input pP and pQ
    */
    public boolean biconditional (boolean pP, boolean pQ) {
    	//create conjunction table
    	truthTables table = new truthTables();
    	boolean [][]biconditionalTable = table.biTable();
		int x = 0;
		int y = 0;

		//search through table compare pP and pQ with table until compound truth value is found
		while (x !=2 && y != 3) {
			if(biconditionalTable[x][y]  == pP &&  biconditionalTable[x+1][y] == pQ) {
				x += 2;
				return biconditionalTable[x][y];
			}
			x = 0;
			y += 1;
		}
		return false;

	}
}