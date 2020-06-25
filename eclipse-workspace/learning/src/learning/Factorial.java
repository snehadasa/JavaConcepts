package learning;

public class Factorial {
	
	public int factorial(int n) {
		
		if (n == 0) {
			return 1;
		}
		return (n * factorial(n - 1));
		
	}
	
	public static void main(String []args) {
		
		int fact = new Factorial().factorial(7);
		System.out.println(fact);
	}
}
