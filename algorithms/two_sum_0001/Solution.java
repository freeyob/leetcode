package two_sum_0001;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        var numMap = new HashMap<Integer, Integer>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            var hitNum = numMap.get(target - nums[i]);
            if (hitNum != null) {
                if (i == hitNum) {
                    continue;
                }
                result[0] = i;
                result[1] = hitNum;
                return result;
            }
        }
        return result;
    }
}