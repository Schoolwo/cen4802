package Assignment2;

public class TwoMethods {

	private static int fibRecursive(int n) {
		if(n == 0) {
			return n;
		}
		if(n == 1 || n == 2){
			return 1;
		}
		return fibRecursive(n-1) + fibRecursive(n-2);
	}

	
	public static void main(String args[]) {
		int fibTerm = 10;
		System.out.print("The " + fibTerm + "th ");
		System.out.println("term of the Fibonacci sequence is: " + fibRecursive(fibTerm));

	}
}
