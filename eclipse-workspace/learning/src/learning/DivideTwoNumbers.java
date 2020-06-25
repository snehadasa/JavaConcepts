package learning;

public class DivideTwoNumbers {
	
	public int divideTwoNumbers(int dividend, int divisor) {
		
		int quo = (dividend/divisor);
		
		return quo;
	}
	
	public static void main(String[] args) {
		
		int ans  = new DivideTwoNumbers().divideTwoNumbers(64, 8);
		System.out.println(ans);
	}
} 
