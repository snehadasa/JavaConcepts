package learning;

public class BaseConversion {
	 public static String baseConversion(String num, int source_base,
			 int destination_base) {
		 return Integer.toString(Integer.parseInt(num, source_base),
				 destination_base);
	 }
	 
	 public static void main(String[] args) {
		String num = "256";
		int source_base = 8;
		int destination_base = 10;
		String res = baseConversion(num, source_base, destination_base);
		System.out.println(res);
	}
}
