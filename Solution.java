//Approach 2


package examples;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

public class Solution {
	
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
		ArrayList<Boolean> list = new ArrayList<Boolean>();
		
		int max = 0;
		for(int i : candies) {
			if (i>max) {
				max=i;
			}
		}
		for(int i : candies) {
			
			list.add(i + extraCandies >= max);
			
					
		}
				
		
        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> result = solution.kidsWithCandies(candies, extraCandies);
        System.out.println(result); 
    }
}


