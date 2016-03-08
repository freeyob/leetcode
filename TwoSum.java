package leetcode;

public class TwoSum {
	 public int[] twoSum(int[] nums, int target) {
	    	int[] result = null;
	    	int len = nums.length;
	        for(int i = 0;i < len;i++){
	            for(int j = 0; j < len; j++){
	                if(nums[i] + nums[j] == target && i != j ){
	                	result = new int[]{i,j};
	                    return  result;
	                }
	            }
	        }
	        return result;
	    }
}
