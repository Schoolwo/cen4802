package Assignment2;

/**
 * Date: 1/22/2022
 * This program will run Fibonacci terms with a recursive method
 * @author Jean Dalmont
 * @version 1.0 
 *
 */

public class TwoMethods {
	
	/**
	 * @param n This is the recursive method that will be used to add the Fibonacci sequences.
	 * @return
	 */

	private static int fibRecursive(int n) {
		if(n == 0) {
			return n;
		}
		if(n == 1 || n == 2){
			return 1;
		}
		return fibRecursive(n-1) + fibRecursive(n-2);
	}

	/**
	 * This is the main method which will call the recursive method to out put the Fibonacci terms.
	 * @param args
	 */
	
	public static void main(String args[]) {
		int fibTerm = 10;
		System.out.print("The " + fibTerm + "th ");
		System.out.println("term of the Fibonacci sequence is: " + fibRecursive(fibTerm));
	}
}
