package edu.augustana.csc285.labs;

public class NumberUtils {

	/**
	 * @param a - a number to compare
	 * @param b - a number to compare
	 * @param c - a number to compare
	 * @return the largest of the three numbers
	 */							//   30    10      20
	public static int maxOfThree(int a, int b, int c) {
		if (a > b) {
			if (c > a) {
				return c;
			} else {
				return a;
			}
		} else {
			if (c > b) {
				return c;
			} else {
				return b;
			}
		}
	}
	
	public static void main(String[] args) {
		// NOTE: There's a bug in maxOfThree above... can we find it? 
		System.out.println(maxOfThree(10,20,30) + " should be 30");
		System.out.println(maxOfThree(17,9,2) + " should be 17");
		
	}

}
