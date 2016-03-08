package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> keeper = new HashMap<Integer,Integer>();
		int len = nums.length;
		int[] result = null;
		for (int i = 0; i < len; i++) {
			if(!keeper.containsKey(nums[i])){
				keeper.put(target - nums[i],i);
			}else{
				result = new int[2];
				result[0] = keeper.get(nums[i]);
				result[1] = i;
			}
		}
		return result;
	}
}
