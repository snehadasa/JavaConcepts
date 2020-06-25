package learning;

import java.util.*;

class TwoSum {
	public List<Pair> twoSum(int[] nums, int target) {
		List<Pair> result = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == target - nums[i]) {
					result.add(new Pair(i,j));
				}
			}
		}
		return result;
	}
	
	class Pair {
		Pair(int x, int y) {
			this.x  = x;
			this.y = y;
		}
		@Override
		public String toString() {
			return "Pair [x=" + x + ", y=" + y + "]";
		}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}

		private 
		int x;
		int y;
	}

	public static void main(String []args) {
		int[] arr1 = {1,2, 3, 4,6,8, 10};
		TwoSum obj = new TwoSum();
		List<Pair> ans  = obj.twoSum(arr1, 11);
		System.out.println(ans);

	}
}