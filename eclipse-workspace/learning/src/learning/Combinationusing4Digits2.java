package learning;

public class Combinationusing4Digits2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digits = 0;
		
		for (int i = 1; i<= 4; i++) {
			for (int j = 1; j<= 4; j++) {
				for (int k = 1; k <= 4; k++) {
					if (i != j && j != k && k != i) {
						digits++;
						System.out.println(i + "" + j + "" + k + "");
					}
				}
			}
		}
		System.out.println("Total Combinations" + digits);
	}

}
