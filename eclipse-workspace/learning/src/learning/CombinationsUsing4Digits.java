package learning;

public class CombinationsUsing4Digits {
	
	public static void combinations(int[] arr, int[] data, int start,
			int end, int index, int r) {
		if (index == r) {
			for(int j = 0; j < r; j++) {
				System.out.print(data[j] + "");
			}
			System.out.println("");
			return;
		}
		
		for (int i = start; i <= end && end-i+1 >= r-index; i++) {
			data[index] = arr[i];
			combinations(arr, data, i+1, end, index+1, r);
		}
		
	}
	
	public static void printCombinations(int[] arr, int n, int r) {
		int data[] = new int[r];
		combinations(arr, data, 0, n-1, 0, r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
		int r = 2;
		int n = arr.length;
		printCombinations(arr, n, r);
	}

}
