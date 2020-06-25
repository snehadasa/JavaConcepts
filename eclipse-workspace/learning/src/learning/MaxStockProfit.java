package learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxStockProfit {
	
	public int maxStockProfit(List<Integer> prices) {
		
		Integer min = prices.get(0);
	    int maxProfit = 0;

		//int diff = 0;
		
		if (prices.size() == 0) {
			return 0;
		}
		for (int x : prices) {
			if (x < min) {
				min = x;
			}
			int localProfit = x - min;
			if (localProfit > maxProfit) {
				maxProfit = localProfit;
			}
		}	
//		List<ArrayList> list = new ArrayList<ArrayList>();
//		for (int i = 0; i < prices.size(); i++) {
//			if (prices.get(i) < min) {
//				min = prices.get(i);
//				//list.add(min);
//			}
//			list.add(prices.get(i) - min);
//		}		
//		return Collections.max(list);
		return maxProfit;
	}
	
	
	public static void main(String[] args) {
		List<Integer> prices = new ArrayList<Integer>(Arrays.asList(10,4, 6, 8, 10, 2));
		int res = new MaxStockProfit().maxStockProfit(prices);
		System.out.println(res);
	}

}
